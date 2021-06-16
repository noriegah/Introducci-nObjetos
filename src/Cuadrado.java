package src;
import java.util.*;

public class Cuadrado {
    public static void main(String[] args) {
        Cuadrado cuadrado=new Cuadrado();
    }
    Scanner scanner=new Scanner(System.in);
    int lado=0;
    int area=0;
    int perimetro=0;
    

    public Cuadrado(){
        System.out.println("Ingrese el tamaño de un lado del cuadrado:");
        lado=scanner.nextInt();

        //puede ser cualquier valor entero.
        System.out.println("El area del cuadrado es:"+calcularArea(area));
        System.out.println("El perimetro del cuadrado es:"+calcularPerimetro(perimetro));
    }
    public int calcularArea(int area){
        area=lado*lado;
        return area;
    }
    public int calcularPerimetro(int perimetro){
        perimetro=4*lado;
        return perimetro;
    }
   
}
