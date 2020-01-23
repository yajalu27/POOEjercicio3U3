package BLL;

import BEU.Curso;
import BEU.Estado;
import BEU.Estudiante;
import BEU.Matricula;
import Lucas.BaseBLLcrud;
import Lucas.BasePersistencia;
import Lucas.Util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestionMatricula  extends BasePersistencia<Matricula> implements BaseBLLcrud<Matricula>{

    private Matricula matricula;
    private final String directorio = "matriculas";

    public GestionMatricula() {
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String imprimir() {
       StringBuilder sb =new StringBuilder();
       sb.append("Estudiante: ");
       sb.append(matricula.getEstudiante()).append("\n");
       sb.append("Curso:");
       sb.append(matricula.getCurso().getTitulo()).append("\n");
         sb.append("Promedio:");
         sb.append(matricula.getPromedio());
         sb.append(matricula.imprimirDetalle()).append("\n");
         return sb.toString();
    }

    public String calificar(float valor) {
        String mensaje = "";
        int numero = this.matricula.addCalificacion(valor);
        switch (numero) {
            case 0:
                mensaje = "\t Todas las notas an sido registradas\n";
                break;
            case 1:
                mensaje = "\t Calificacion de la unidad I ingresada correctamente\n";
                break;
            case 2:
                mensaje = "\t Calificacion de la unidad II ingresada correctamente\n";
                break;
            case 3:
                mensaje = "\t Calificacion de la unidad III ingresada correctamente\n";
                break;
            default:
                mensaje = "\t Error. No se registro la calificacion \n";
                break;
        }
        return mensaje;
    }

    public void prmediar() {
        this.matricula.calcularPromedio();
    }

    /*public String imprimirDetalle() {
        return matricula.imprimirDetalle();
    }*/

    public void anular(boolean op) {
        if (op == true) {
            matricula.setEstado(Estado.Anulada);
            Util.print("\n\t Su matricula a sido anulada ");
            float valor = matricula.getCurso().getCosto() * 0.10f;
            Util.print("\n\t Debe Pagar el 10 % del Rubro : $ " + valor);
        }
    }

   /* public String archivar() {
        String resultado;
        String nombreArchivo = "matricula_" + matricula.getNumero() + ".json";
        try {
            try (FileWriter archivo = new FileWriter(nombreArchivo)) {
                archivo.write(matricula.toSave());
                resultado = "\n\t Matricula N° " + matricula.getNumero() + " archivada correctamente \n";
            }
        } catch (IOException e) {
            resultado = "\n ERROR. " + e.toString();
        }
        return resultado;
    }*/
    

    public void archivar() throws IOException{
        this.escribir(directorio, matricula.getNumero(), matricula);
    }
    
    public void configurar(Curso cr,Estudiante est){
        this.matricula.setCurso(cr);
        this.matricula.setEstudiante(est);
    }
    public List<Matricula> reportar(String titulo) throws IOException{
        List<Matricula>resultado = new ArrayList<>();
       List<String> contenidos= this.leerdirectorio(directorio, titulo);
       for(String texto:contenidos){
           GsonBuilder gb = new GsonBuilder();
            gb.setPrettyPrinting();
            Gson gson = gb.create();
            try{
                    Matricula m=gson.fromJson(texto, Matricula.class);
            resultado.add(m);
            
            }catch(JsonSyntaxException ex){
                Util.print("El texto No se pudo convertir en matricula");
                Util.print(ex.toString());
            }
        
           
       }
       return resultado;
    }
    @Override
    public void crear() {
        matricula = new Matricula();
    }

    @Override
    public void consultar(String id) throws IOException {
        String contenido=this.leer(directorio, id);
        GsonBuilder gb = new GsonBuilder();
            gb.setPrettyPrinting();
            Gson gson = gb.create();
            matricula=gson.fromJson(contenido, Matricula.class);
            
    }

    @Override
    public void actualizar() throws IOException {
      
    }

    @Override
    public void eliminar() throws IOException {
        
    }
}
