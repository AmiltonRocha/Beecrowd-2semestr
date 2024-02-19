package Ex1007;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner inteiro = new Scanner(System.in);
    int a = inteiro.nextInt();
    int b = inteiro.nextInt();
    int c = inteiro.nextInt();
    int d = inteiro.nextInt();
    int DIFERENCA = (a * b - c * d);
    System.out.format("DIFERENCA = %d\n", DIFERENCA);
    inteiro.close();

}
}