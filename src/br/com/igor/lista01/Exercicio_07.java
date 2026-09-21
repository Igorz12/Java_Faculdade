package br.com.igor.lista01;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        double area;
        double perimetro;
        double diagonal;

        // Scanner
        System.out.println("Digite a base do retângulo: ");
        base = sc.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        altura = sc.nextDouble();

        // Lógica
        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt((base * base) + (altura * altura));

        // Prints
        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);
        System.out.println("A diagonal do retângulo é: " + diagonal);

        sc.close();
    }
}