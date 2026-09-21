package br.com.igor.lista02;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        // Scanner
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        // Lógica
        if (n2 == 0) {
            System.out.println("A verificação não pode ser feita.");
        } else {
            if (n1 % n2 == 0) {
                System.out.println("O primeiro número é múltiplo do segundo.");
            } else {
                System.out.println("O primeiro número não é múltiplo do segundo.");
            }
        }

        // Final
        sc.close();
    }
}