package br.com.igor.lista02;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int hora;

        // Scanner
        System.out.println("Digite a hora do dia: ");
        hora = sc.nextInt();

        // Lógica
        if (hora >= 0 && hora <= 11) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Hora inválida.");
        }

        // Final
        sc.close();
    }
}