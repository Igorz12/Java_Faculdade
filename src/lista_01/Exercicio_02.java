package lista_01;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        //Variáveis
        Scanner sc = new  Scanner(System.in);
        int n1;
        int n2;
        int soma;
        int subtracao;
        double resto;
        double divisao;

        //Scanner
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        //Lógica
        soma = n1 + n2;
        subtracao = n1 - n2;
        divisao = (double) n1 * n2;
        resto = n1 % n2;

        //Prints
        System.out.println("A soma dos dois números é: " + soma);
        System.out.println("A subtração dos dois números é: " + subtracao);
        System.out.println("A divisão dos dois números é: " + divisao);
        System.out.println("O resto da divisão dos dois números é: " + resto);
        sc.close();
    }
}
