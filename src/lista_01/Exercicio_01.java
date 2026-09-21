package lista_01;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        //Variáveis
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        double tamanho;

        //Scanner
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite sua tamanho: ");
        tamanho = sc.nextDouble();

        //Print
        System.out.println("Olá " + nome + " sua idade é " + idade + " e sua altura é de " + tamanho);

        sc.close();
    }
}
