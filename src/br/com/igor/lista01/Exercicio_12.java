package br.com.igor.lista01;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double consumo;
        double valorKwh;
        double valorConta;

        // Scanner
        System.out.println("Digite o consumo mensal em kWh: ");
        consumo = sc.nextDouble();

        // Lógica
        if (consumo <= 100) {
            valorKwh = 0.50;
        } else if (consumo <= 300) {
            valorKwh = 0.75;
        } else {
            valorKwh = 1.10;
        }

        valorConta = consumo * valorKwh;

        // Prints
        System.out.println("O valor do kWh é: R$ " + valorKwh);
        System.out.println("O valor total da conta é: R$ " + valorConta);

        sc.close();
    }
}