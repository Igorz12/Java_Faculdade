package lista_02;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int ano;

        // Scanner
        System.out.println("Digite um ano: ");
        ano = sc.nextInt();

        // Lógica
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }

        // Final
        sc.close();
    }
}