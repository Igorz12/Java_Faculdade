package br.com.igor.lista02;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int idade;

        // Scanner
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        // Lógica
        if (idade >= 16) {
            System.out.println("Pode votar.");
        }

        if (idade >= 18) {
            System.out.println("Pode dirigir.");
        }

        if (idade >= 60) {
            System.out.println("É idoso.");
        }

        // Final
        sc.close();
    }
}