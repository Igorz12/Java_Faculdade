package br.com.igor.lista03;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int opcao;
        double numero;
        double resultado;

        // Lógica
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Dobro");
            System.out.println("2 - Metade");
            System.out.println("3 - Quadrado");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite um número: ");
                    numero = sc.nextDouble();

                    resultado = numero * 2;

                    System.out.printf("Resultado: %.2f%n", resultado);
                }

                case 2 -> {
                    System.out.println("Digite um número: ");
                    numero = sc.nextDouble();

                    resultado = numero / 2;

                    System.out.printf("Resultado: %.2f%n", resultado);
                }

                case 3 -> {
                    System.out.println("Digite um número: ");
                    numero = sc.nextDouble();

                    resultado = numero * numero;

                    System.out.printf("Resultado: %.2f%n", resultado);
                }

                case 0 -> {
                    System.out.println("Programa encerrado.");
                }

                default -> {
                    System.out.println("Opção inválida.");
                }
            }

        } while (opcao != 0);

        // Final
        sc.close();
    }
}