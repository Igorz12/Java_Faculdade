package br.com.igor.lista01;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double valorHora;
        double horasMes;
        double salarioBruto;
        double descontoINSS;
        double salarioLiquido;
        double valorDesconto;

        // Scanner
        System.out.println("Digite o valor da hora trabalhada: ");
        valorHora = sc.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        horasMes = sc.nextDouble();

        // Lógica
        valorDesconto = 0.08;
        salarioBruto = valorHora * horasMes;
        descontoINSS = salarioBruto * valorDesconto;
        salarioLiquido = salarioBruto - descontoINSS;

        // Prints
        System.out.println("O salário bruto é: " + salarioBruto);
        System.out.println("O desconto do INSS é: " + descontoINSS);
        System.out.println("O salário líquido é: " + salarioLiquido);

        sc.close();
    }
}