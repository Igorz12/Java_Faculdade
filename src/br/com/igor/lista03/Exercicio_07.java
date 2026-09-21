package br.com.igor.lista03;

import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);

        int quantidadeAlunos;
        int aprovados = 0;
        int abaixoDeSeis = 0;

        double nota;
        double somaNotas = 0;
        double media;

        // Scanner
        System.out.println("Digite a quantidade de alunos: ");
        quantidadeAlunos = sc.nextInt();

        // Lógica
        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.println("Digite a nota do aluno " + i + ": ");
            nota = sc.nextDouble();

            somaNotas = somaNotas + nota;

            if (nota >= 6) {
                aprovados++;
            } else {
                abaixoDeSeis++;
            }
        }

        media = somaNotas / quantidadeAlunos;

        // Prints
        System.out.printf("Média da turma: %.2f%n", media);
        System.out.println("Alunos com nota maior ou igual a 6: " + aprovados);
        System.out.println("Alunos abaixo de 6: " + abaixoDeSeis);

        // Final
        sc.close();
    }
}