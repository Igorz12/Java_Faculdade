package br.com.igor.lista03;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);

        int numero;
        int quantidade = 0;
        int soma = 0;
        int maior = 0;
        int menor = 0;

        // Scanner
        System.out.println("Digite números inteiros.");
        System.out.println("Digite 0 para encerrar.");

        numero = sc.nextInt();

        // Lógica
        if (numero == 0) {
            System.out.println("Nenhum valor foi lido.");
        } else {
            maior = numero;
            menor = numero;

            while (numero != 0) {
                quantidade++;
                soma = soma + numero;

                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }

                numero = sc.nextInt();
            }

            // Prints
            System.out.println("Quantidade de valores lidos: " + quantidade);
            System.out.println("Soma: " + soma);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        }

        // Final
        sc.close();
    }
}