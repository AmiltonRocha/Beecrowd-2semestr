package EX1009;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner planilha = new Scanner(System.in);
        String nome = planilha.nextLine();
        double salario = planilha.nextDouble();
        double vendas = planilha.nextDouble();
        double TOTAL = salario + (vendas * 0.15);
        System.out.format("TOTAL = R$ %.2f\n",TOTAL);
        planilha.close();

        


    }
}
