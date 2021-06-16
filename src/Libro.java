package src;
import java.util.*;

public class Libro{
    public static void main(String[] args) {
        Libro libro=new Libro();
    }
    Scanner scanner=new Scanner(System.in);
    private int idLibro,idLibroDevolucion;
    private String nombre;
    private int DPI,DPIdevolucion;
    private String mostrarInfo;
    private int devolucion;
    int op;
    public Libro(){
    
        System.out.println("1.Prestamo 2.Devolucion 3.MostrarInformacion");
        op=scanner.nextInt();
        

        switch(op){
            case 1:
                prestamo();
           break;

            case 2:
                devolucion();
            break;
            
            case 3:
                mostrarInformacion();
            break;   
            
            default:
                System.out.println("Opción incorrecta...");
                break;
            }        

    }
    public void prestamo(){
        System.out.println("Ingrese el id del libro que desea prestar:");
        idLibro=scanner.nextInt();
        
        System.out.println("Ingrese su nombre:");
        nombre=scanner.next();

        System.out.println("Ingrese su No. DPI:");
        DPI=scanner.nextInt();

        
    }
    public void devolucion(){
        System.out.println("Ingrese su No. DPI:");
        DPIdevolucion=scanner.nextInt();
        System.out.println("Ingrese el id del Libro que presto:");
        idLibroDevolucion=scanner.nextInt();

        if(DPI==DPIdevolucion & idLibro==idLibroDevolucion){
            System.out.println(nombre+ "¡GRACIAS POR DEVOLVER EL LIBRO!");
        }else{
            System.out.println("DATOS INCORRECTOS, POR FAVOR PRUEBA DE NUEVO...");
        }

    }
    public void mostrarInformacion(){
        System.out.println("Nombre del prestamista: "+nombre);
        System.out.println("No. DPI: "+DPI);
        System.out.println("id del libro que presto: "+idLibro);
    }
    public void setPrestamo(int idLibro){
        this.idLibro=idLibro;
    }
    public void setDevolucion(int devolucion){
        this.devolucion=devolucion;
    }
    public void setMostrarInfo(String mostrarInfo){
        this.mostrarInfo=mostrarInfo;
    }
    public int getPrestamo(){
        return idLibro;
    }
    public int getDevolucion(){
        return devolucion;
    }
    public String getMostrarInfo(){
        return mostrarInfo;
    }
}