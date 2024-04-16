package projects;


import java.util.Locale;
import java.util.Scanner;

public class Moeda {

    private static Scanner inputTeclado = new Scanner(System.in);

    static int moedaLocal;
    static  double dolar, euro;
    static int real;

    public static void MoedasMenu() {
        System.out.println("[1] - Real");
        System.out.println("[2] - Dolar");
        System.out.println("[3] - Euro");
    }

    public static double ConversaoMoeda() {
        double dolar, euro;
        int real;

        euro = 5.61;
        dolar = 5.29;
        real = 1;

        switch (moedaLocal) {
            case 1:

                double reaisPossuido1, dolaresConvertido1, euroConvertido1;
                int moedaConvertida1;

                System.out.println("Digite quantos reais você tem:");
                reaisPossuido1 = inputTeclado.nextDouble();

                OpcoesReal();

                System.out.println("Qual moeda sera convertida: ");
                moedaConvertida1 = inputTeclado.nextInt();

                if (moedaConvertida1 == 1) {
                    dolaresConvertido1 = reaisPossuido1 / dolar;
                    System.out.printf("Convertendo %.2f Reais em Dolares Temos - %.2f%n", reaisPossuido1, dolaresConvertido1);
                    return dolaresConvertido1;

                } else if (moedaConvertida1 == 2) {
                    euroConvertido1 = reaisPossuido1 / euro;
                    System.out.printf("Convertendo %.2f Reais em Euros Temos - %.2f%n", reaisPossuido1, euroConvertido1);
                    return euroConvertido1;
                } else {
                    System.out.println("Erro");
                    break;
                }

            case 2:
                double dolaresPossuidos2, realConvertido2, euroConvertido2;
                int moedaConvertida2;

                System.out.println("Digite quantos Dolares você tem: ");
                dolaresPossuidos2 = inputTeclado.nextDouble();

                OpcoesDolar();

                System.out.println("Qual moeda sera convertida: ");
                moedaConvertida2 = inputTeclado.nextInt();

                if (moedaConvertida2 == 1) {
                    realConvertido2 = dolaresPossuidos2 * dolar;
                    System.out.printf("Convertendo %.2f Dolar em Reais Temos - %.2f%n", dolaresPossuidos2, realConvertido2);
                    return realConvertido2;

                } else if (moedaConvertida2 == 2) {
                    euroConvertido2 = (dolaresPossuidos2 * dolar) / euro;
                    System.out.printf("Convertendo %.2f Dolar em Euros Temos - %.2f%n", dolaresPossuidos2, euroConvertido2);
                    return euroConvertido2;
                } else {
                    System.out.println("Error");
                    break;
                }
            case 3:
                double euroPossuido3, realConvertido3, dolarConvertido3;
                int moedaConvertida3;

                System.out.println("Quantos Euros você tem: ");
                euroPossuido3 = inputTeclado.nextDouble();

                OpcoesEuro();

                System.out.println("Qual moeda sera convertida: ");
                moedaConvertida3 = inputTeclado.nextInt();

                if (moedaConvertida3 == 1) {
                    realConvertido3 = (euroPossuido3 * euro) * real;
                    System.out.printf("Convertendo %.2f Euros em Reais Temos - %.2f%n", euroPossuido3, realConvertido3);
                    return realConvertido3;
                } else if (moedaConvertida3 == 2) {
                    dolarConvertido3 = (euroPossuido3 * euro) / dolar;
                    System.out.printf("Convertendo %.2f Euros em Dolar Temos - %.2f%n", euroPossuido3, dolarConvertido3);
                    return dolarConvertido3;
                } else {
                    System.out.println("Erro");
                    break;
                }
            default:
                System.out.println("Moeda não Localizada ERROR");
                break;
        }
        return 0;
    }

    public static void OpcoesReal() {
        System.out.println("[1] - Dolar");
        System.out.println(("[2] - Euro"));
    }

    public static void OpcoesDolar() {
        System.out.println("[1] - Real");
        System.out.println("[2] - Euro");
    }

    public static void OpcoesEuro() {
        System.out.println("[1] - Real");
        System.out.println("[2] - Dolar");
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        MoedasMenu();

        System.out.println("Digite a moeda de sua Região: ");
        moedaLocal = inputTeclado.nextInt();

        ConversaoMoeda();

    }
}
