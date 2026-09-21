package lista_01;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double media;

        // Scanner
        System.out.println("Digite a média final do aluno: ");
        media = sc.nextDouble();

        // Lógica
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }
}