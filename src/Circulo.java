package src;
import java.util.*;

public class Circulo {
    public static void main(String[] args) {
        Circulo circulo=new Circulo();
    }
    Scanner scanner=new Scanner(System.in);
    Double radio;
    Double area;
    Double perimetro;

    public Circulo(){
        System.out.println("Ingrese el radio:");
        radio=scanner.nextDouble();
        System.out.println("El area del circulo es: "+calcularArea(area));
        System.out.println("El perimetro del circulo es: "+calcularPerimetro(perimetro));
    }
    public double calcularArea(Double area){
        area=Math.PI*radio*radio;
        return area;
    }
    public double calcularPerimetro(Double perimetro){
        perimetro=2*Math.PI*radio;
        return perimetro;
    }
}
