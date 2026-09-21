package br.com.igor.lista03;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 1;
        int resultado;

        // Scanner
        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        // Lógica
        while (contador <= 10) {
            resultado = numero * contador;

            System.out.println(numero + " x " + contador + " = " + resultado);

            contador++;
        }

        // Final
        sc.close();
    }
}