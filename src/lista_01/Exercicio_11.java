package lista_01;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int maior;

        // Scanner
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        n3 = sc.nextInt();

        // Lógica
        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        // Print
        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}