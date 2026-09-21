package lista_01;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        // Scanner
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextDouble();

        // Lógica
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Print
        System.out.println("A média do aluno é: " + media);

        sc.close();
    }
}