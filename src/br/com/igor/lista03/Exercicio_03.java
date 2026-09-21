package br.com.igor.lista03;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double nota;

        // Scanner e Lógica
        do {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido.");
            }

        } while (nota < 0 || nota > 10);

        // Print
        System.out.printf("Nota aceita: %.2f%n", nota);

        // Final
        sc.close();
    }
}