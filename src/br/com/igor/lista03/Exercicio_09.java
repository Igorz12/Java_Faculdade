package br.com.igor.lista03;

import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int n;

        // Scanner
        System.out.println("Digite um número de 1 a 9: ");
        n = sc.nextInt();

        // Lógica
        if (n < 1 || n > 9) {
            System.out.println("Entrada inválida.");
        } else {
            for (int numero = 1; numero <= n; numero++) {

                System.out.println("Tabuada do " + numero + ":");

                for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                    int resultado = numero * multiplicador;

                    System.out.println(
                            numero + " x " + multiplicador + " = " + resultado
                    );
                }

                System.out.println();
            }
        }

        // Final
        sc.close();
    }
}