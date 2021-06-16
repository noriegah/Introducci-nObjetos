package src;

import java.util.*;

public class Fraccion {
 public static void main(String[] args) {
    Fraccion fraccion=new Fraccion();
 }  

     int numerador1,numerador2,denominador1,denominador2;
     int resultadoNumerador,resultadoDenominador;
     int op=0;
     Scanner scanner=new Scanner(System.in);

    
 public Fraccion(){
    System.out.println("1.sumar 2.Restar 3.Multiplicar 4.Dividir");
    op=scanner.nextInt();
    switch(op){
        
        case 1:
            sumar();
        break;
        
        case 2:
            restar();
        break;
        
        case 3:
            multiplicar();
        break;
        
        case 4:
            dividir();
        break;
        
        default:
            System.out.println("Opcion incorrecta...");
        break;    

    }
 }
 public void sumar(){
    System.out.println("Ingrese el numerador de la primer fraccion:");
    numerador1=scanner.nextInt();

    System.out.println("Ingrese el denominador de la primera fraccion:");
    denominador1=scanner.nextInt();

    System.out.println("Ingrese el numerador de la segunda fraccion:");
    numerador2=scanner.nextInt();

    System.out.println("Ingrese el denominador de la segunda fraccion:");
    denominador2=scanner.nextInt();

    resultadoNumerador=(numerador1*denominador2 + denominador2*numerador2);
    resultadoDenominador=(denominador1*denominador2);

    System.out.println("El resultado de la suma es: "+resultadoNumerador+"/" +resultadoDenominador );

 }
 public void restar(){
    System.out.println("Ingrese el numerador de la primer fraccion:");
    numerador1=scanner.nextInt();

    System.out.println("Ingrese el denominador de la primera fraccion:");
    denominador1=scanner.nextInt();

    System.out.println("Ingrese el numerador de la segunda fraccion:");
    numerador2=scanner.nextInt();

    System.out.println("Ingrese el denominador de la segunda fraccion:");
    denominador2=scanner.nextInt();

    resultadoNumerador=(numerador1*denominador2 - denominador2*numerador2);
    resultadoDenominador=(denominador1*denominador2);

    System.out.println("El resultado de la resta es: "+resultadoNumerador+"/" +resultadoDenominador );

 }
 public void multiplicar(){
    System.out.println("Ingrese el numerador de la primer fraccion:");
    numerador1=scanner.nextInt();

    System.out.println("Ingrese el denominador de la primera fraccion:");
    denominador1=scanner.nextInt();

    System.out.println("Ingrese el numerador de la segunda fraccion:");
    numerador2=scanner.nextInt();

    System.out.println("Ingrese el denominador de la segunda fraccion:");
    denominador2=scanner.nextInt();

    resultadoNumerador=(numerador1*numerador2);
    resultadoDenominador=(denominador1*denominador2);

    System.out.println("El resultado de la multiplicacion es: "+resultadoNumerador+"/" +resultadoDenominador );

 }
 public void dividir(){
    System.out.println("Ingrese el numerador de la primer fraccion:");
    numerador1=scanner.nextInt();

    System.out.println("Ingrese el denominador de la primera fraccion:");
    denominador1=scanner.nextInt();

    System.out.println("Ingrese el numerador de la segunda fraccion:");
    numerador2=scanner.nextInt();

    System.out.println("Ingrese el denominador de la segunda fraccion:");
    denominador2=scanner.nextInt();

    resultadoNumerador=(numerador1*denominador2);
    resultadoDenominador=(denominador1*numerador2);

    System.out.println("El resultado de la division es: "+resultadoNumerador+"/" +resultadoDenominador );

 }
 public void setSuma(int resultadoNumerador, int resultadoDenominador){
     this.resultadoNumerador=resultadoNumerador;
     this.resultadoDenominador=resultadoDenominador;
 }
 public void setResta(int resultadoNumerador, int resultadoDenominador){
    this.resultadoNumerador=resultadoNumerador;
    this.resultadoDenominador=resultadoDenominador;
}
public void setMultiplicacion(int resultadoNumerador, int resultadoDenominador){
    this.resultadoNumerador=resultadoNumerador;
    this.resultadoDenominador=resultadoDenominador;
}
public void setDivision(int resultadoNumerador, int resultadoDenominador){
    this.resultadoNumerador=resultadoNumerador;
    this.resultadoDenominador=resultadoDenominador;
}
public int getSuma(){
    return resultadoNumerador;
}
public int getResta(){
    return resultadoNumerador;
}
public int getMultiplicacion(){
    return resultadoNumerador;
}
public int getDivision(){
    return resultadoNumerador;
}

}
