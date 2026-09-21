package br.com.igor.lista02;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int numero;
        int modulo;

        // Scanner
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        // Lógica
        modulo = Math.abs(numero);

        if (numero > 0) {
            System.out.println("O número é positivo.");
        }

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        }

        if (numero % 5 == 0) {
            System.out.println("O número é múltiplo de 5.");
        }

        if (modulo >= 10 && modulo <= 99) {
            System.out.println("O número tem dois dígitos.");
        }

        // Final
        sc.close();
    }
}