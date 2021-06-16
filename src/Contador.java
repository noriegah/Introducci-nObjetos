package src;
import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Contador contador=new Contador();
    }
    Scanner scanner=new Scanner(System.in);
    private int cont=0;
    private int incrementar;
    private int decrementar;
    int op=0;

    public Contador(){
        System.out.println("1.Incrementar 2.Decrementar");
        op=scanner.nextInt();
        if(op==1){
            incrementar();
        }else if(op==2){
            decrementar();
        }else{
            System.out.println("Seleccione una opcion valida...");
        }
    }
    public void incrementar(){
        System.out.println("Hasta que numero desea incrementar el contador(el contador inicia en cero)");
        incrementar=scanner.nextInt();
        for(cont=0;cont<=getIncrementar();cont++){
            System.out.println(cont);
        }
    }
    public void decrementar(){
        System.out.println("Hasta que numero desea decrementar el contador(el contador inicia en cero)");
        decrementar=scanner.nextInt();
        for(cont=0;cont>=getDecrementar();cont--){
            System.out.println(cont);
        }
    }
   
    public void setIncrementar(int incrementar){
        this.incrementar=incrementar;
    }
    public void setDecrementar(int decrementar){
        this.decrementar=decrementar;
    }
    public int getIncrementar(){
        return incrementar;
    }
    public int getDecrementar(){
        return decrementar;
    }
}


