package br.com.igor.lista03;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int n;
        int contador = 1;

        // Scanner
        System.out.println("Digite um número inteiro: ");
        n = sc.nextInt();

        // Lógica
        if (n < 1) {
            System.out.println("Não há valores a exibir.");
        } else {
            while (contador <= n) {
                System.out.println(contador);
                contador++;
            }
        }

        // Final
        sc.close();
    }
}