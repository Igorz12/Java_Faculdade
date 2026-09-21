package br.com.igor.lista03;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidade;
        int quantidadeItens = 0;

        double preco;
        double total = 0;
        double valorFinal;

        int formaPagamento;

        // Scanner e Lógica
        while (true) {
            System.out.println("Digite o código do produto (0 para encerrar): ");
            codigo = sc.nextInt();

            if (codigo == 0) {
                break;
            }

            System.out.println("Digite o preço unitário: ");
            preco = sc.nextDouble();

            System.out.println("Digite a quantidade: ");
            quantidade = sc.nextInt();

            total = total + (preco * quantidade);
            quantidadeItens = quantidadeItens + quantidade;
        }

        // Verificação
        if (quantidadeItens == 0) {
            System.out.println("Nenhum produto foi registrado.");
        } else {
            // Scanner
            System.out.println("Digite a forma de pagamento:");
            System.out.println("1 - Dinheiro");
            System.out.println("2 - Débito");
            System.out.println("3 - Crédito");

            formaPagamento = sc.nextInt();

            // Lógica
            valorFinal = total;

            switch (formaPagamento) {
                case 1 -> {
                    valorFinal = total - (total * 0.05);
                }

                case 2 -> {
                    valorFinal = total;
                }

                case 3 -> {
                    valorFinal = total + (total * 0.03);
                }

                default -> {
                    System.out.println("Forma de pagamento inválida.");
                    valorFinal = total;
                }
            }

            // IFs independentes
            if (total > 300) {
                System.out.println("Aviso: compra grande.");
            }

            if (quantidadeItens > 20) {
                System.out.println("Aviso: muitos itens.");
            }

            // Print
            System.out.printf("Total final: R$ %.2f%n", valorFinal);
        }

        // Final
        sc.close();
    }
}