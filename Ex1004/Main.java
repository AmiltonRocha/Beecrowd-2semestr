package Ex1004;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner int1 = new Scanner(System.in);
       int valor1 = int1.nextInt();
       Scanner int2 = new Scanner(System.in);
       int valor2 = int2.nextInt();
       int PROD = valor1 * valor2;
       System.out.printf("O valor de %d * %d e igual a %d ",valor1,valor2,PROD);
    }
}
