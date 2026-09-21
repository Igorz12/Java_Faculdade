package lista_01;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double raio;
        double area;
        double perimetro;

        // Scanner
        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        // Lógica
        area = Math.PI * raio * raio;
        perimetro = 2 * Math.PI * raio;

        // Prints
        System.out.println("A área do círculo é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);

        sc.close();
    }
}