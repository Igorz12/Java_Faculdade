package br.com.igor.lista01;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int numero;

        // Scanner
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        // Lógica
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        sc.close();
    }
}