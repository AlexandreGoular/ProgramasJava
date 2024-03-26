package programas; // Renomeie o pacote para evitar conflitos com pacotes do Java

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------");
        System.out.println("Calculadora");
        System.out.println("-------------------------------");

        operacoesCalculadora();

        int operacaoEscolhidaUsuario;
        double numeroUm, numeroDois, adicao, subtracao, multiplicacao, divisao;

        System.out.println("Qual operação deseja: ");
        operacaoEscolhidaUsuario = input.nextInt();

        clearScreen();

        switch (operacaoEscolhidaUsuario) {
            case 1:
                System.out.println("Adição");
                System.out.println(" ");
                System.out.println("Digite o primeiro numero: ");
                numeroUm = input.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numeroDois = input.nextDouble();
                adicao = numeroUm + numeroDois;
                System.out.printf("A soma de %.2f + %.2f = %.2f", numeroUm, numeroDois, adicao);
                break;

            case 2:
                System.out.println("Subtração");
                System.out.println(" ");
                System.out.println("Digite o primeiro numero: ");
                numeroUm = input.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numeroDois = input.nextDouble();
                subtracao = numeroUm - numeroDois;
                System.out.printf("A subtração de %.2f - %.2f = %.2f", numeroUm, numeroDois, subtracao);
                break;

            case 3:
                System.out.println("Multiplicação");
                System.out.println(" ");
                System.out.println("Digite o primeiro numero: ");
                numeroUm = input.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numeroDois = input.nextDouble();
                multiplicacao = numeroUm * numeroDois;
                System.out.printf("A multiplicação de %.2f * %.2f = %.2f", numeroUm, numeroDois, multiplicacao);
                break;

            case 4:
                System.out.println("Divisão");
                System.out.println(" ");
                System.out.println("Digite o primeiro numero: ");
                numeroUm = input.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numeroDois = input.nextDouble();
                if (numeroDois == 0) {
                    System.out.println("Divisão por 0 Inválida");
                } else {
                    divisao = numeroUm / numeroDois;
                    System.out.printf("A divisão de %.2f / %.2f = %.2f", numeroUm, numeroDois, divisao);
                }
                break;

            default:
                System.out.println("Operação Inválida");
                break;
        }
    }

    public static void operacoesCalculadora() {
        System.out.println("[1] - Adição");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
