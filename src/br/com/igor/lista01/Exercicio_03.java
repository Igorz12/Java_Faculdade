package br.com.igor.lista01;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double reais;
        double cotacao;
        double dolares;

        // Scanner
        System.out.println("Digite o valor em reais: ");
        reais = sc.nextDouble();

        System.out.println("Digite a cotação do dólar: ");
        cotacao = sc.nextDouble();

        // Lógica
        dolares = reais / cotacao;

        // Print
        System.out.println("O valor convertido para dólares é: " + dolares);

        sc.close();
    }
}