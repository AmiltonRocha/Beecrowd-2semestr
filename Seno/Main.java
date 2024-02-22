package Seno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double graus = leitor.nextDouble();
        int vezes = leitor.nextInt();
        double aux = 1;
        double seno = 0;
        double radiano = graus * (3.141592 / 180);
        if (graus <= 360 && graus >= 0 && vezes <= 10000 && vezes >= 1) {
            if(vezes>50){
                vezes = 50;
            }          
            for (int i = 0; i < vezes; i++) {
                if (i % 2 == 0) {
                    seno += (Math.pow(radiano, aux) / calcularFatorial(aux));
                } else {
                    seno -= (Math.pow(radiano, aux) / calcularFatorial(aux));
                }
                aux += 2;
            }
        }
        leitor.close();
        System.out.printf("%.10f\n", seno);
    }

    public static double calcularFatorial(double numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        
        else {
            double fatorial = 1;
            for (int i = 2; i <= numero; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}