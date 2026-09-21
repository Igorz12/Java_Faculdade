package lista_01;

import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        double kelvin;

        // Scanner
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = sc.nextDouble();

        // Lógica
        fahrenheit = (celsius * 9 / 5) + 32;
        kelvin = celsius + 273.15;

        // Prints
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        System.out.println("A temperatura em Kelvin é: " + kelvin);

        sc.close();
    }
}