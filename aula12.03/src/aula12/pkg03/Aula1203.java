package aula12.pkg03;

import java.util.Scanner;

public class Aula1203 {

    public static void main(String[] args) {

        double a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado A:");
        a = scanner.nextDouble();

        System.out.println("Digite o valor do lado B:");
        b = scanner.nextDouble();

        System.out.println("Digite o valor do lado C:");
        c = scanner.nextDouble();

        String resultado = (a + b > c && a + c > b && b + c > a)
                ? (a == b && b == c)
                        ? "Triangulo equilatero."
                        : (a == b || b == c || a == c)
                                ? "Triangulo isosceles."
                                : "Triangulo escaleno."
                : "Esses valores nao formam um triangulo.";

        System.out.println(resultado);

        scanner.close();
    }
}
