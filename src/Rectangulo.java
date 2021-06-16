package src;
import java.util.*;
public class Rectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo=new Rectangulo();
    }
    Scanner scanner=new Scanner(System.in);
    int ancho;
    int largo;
    int area;
    int perimetro;

    public Rectangulo(){
        System.out.println("Ingrese el ancho:");
        ancho=scanner.nextInt();

        System.out.println("Ingrese el largo:");
        largo=scanner.nextInt();

        if(ancho!=largo){
            System.out.println("El area es: "+calcularArea(area));
            System.out.println("El perimetro es: "+calcularPerimetro(perimetro));
        }else{
            System.out.println("El ancho y largo no pueden ser iguales...");
        }

    }

    public int calcularArea(int area){
        area=largo*ancho;
        return area;
    }
    public int calcularPerimetro(int perimetro){
        perimetro=(2*largo)+(2*ancho);
        return perimetro;
    }
}
