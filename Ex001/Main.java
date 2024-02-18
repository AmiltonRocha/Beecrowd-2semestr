package Ex001;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double n = 3.14159;
        double area = n * (raio * raio);
        System.out.format("A =%.4f ", area);

    }
}