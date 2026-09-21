package br.com.seunome.lista03;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int soma = 0;

        // Scanner
        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        // Lógica
        if (a > b) {
            System.out.println("Intervalo inválido.");
        } else {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    soma = soma + i;
                }
            }

            // Print
            System.out.println("A soma dos números pares é: " + soma);
        }

        // Final
        sc.close();
    }
}