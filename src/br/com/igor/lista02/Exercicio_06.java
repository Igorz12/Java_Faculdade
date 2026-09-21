package lista_02;

import java.util.Scanner;

public class Exercicio_06 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double compra;
        double frete;
        double total;

        // Scanner
        System.out.println("Digite o valor da compra: ");
        compra = sc.nextDouble();

        // Lógica
        if (compra >= 199.00) {
            frete = 0;
        } else {
            frete = 24.90;
        }

        total = compra + frete;

        // Prints
        System.out.println("Valor do frete: R$ " + frete);
        System.out.println("Total a pagar: R$ " + total);

        // Final
        sc.close();
    }
}