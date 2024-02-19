package Ex1006;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        double n1 = nota.nextDouble();
        double n2 = nota.nextDouble();
        double n3 = nota.nextDouble();
        double media = (n1*0.2)+(n2*0.3)+(n3*0.5);
        System.out.format("MEDIA = %.1f\n", media);
    }
}
