package br.com.igor.lista03;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int numero;
        long fatorial = 1;

        // Scanner
        System.out.println("Digite um número inteiro não negativo: ");
        numero = sc.nextInt();

        // Lógica
        if (numero < 0) {
            System.out.println("Entrada inválida.");
        } else {
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
            }

            // Print
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        // Final
        sc.close();
    }
}