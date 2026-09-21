package lista_02;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        // Variáveis
        Scanner sc = new Scanner(System.in);
        double temperatura;
        double umidade;

        // Scanner
        System.out.println("Digite a temperatura em Celsius: ");
        temperatura = sc.nextDouble();

        System.out.println("Digite a umidade relativa do ar (%): ");
        umidade = sc.nextDouble();

        // Lógica
        if (temperatura >= 38) {
            System.out.println("Alerta de calor extremo.");
        }

        if (umidade < 30) {
            System.out.println("Alerta de umidade baixa.");
        }

        if (temperatura >= 35 && umidade < 20) {
            System.out.println("Alerta de risco de queimada.");
        }

        // Final
        sc.close();
    }
}