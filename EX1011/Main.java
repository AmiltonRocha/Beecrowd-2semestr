package EX1011;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        double raio = numero.nextDouble();
        double pi =  3.14159;
        double volume = (4/3.0)*pi*(raio*raio*raio);
        System.out.format("VOLUME = %.3f\n", volume);
        numero.close();

    }
}
