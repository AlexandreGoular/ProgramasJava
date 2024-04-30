package projects;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class JogoForca {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<String>();
        ArrayList<String> jogos = new ArrayList<String>();
        ArrayList<String> paises = new ArrayList<String>();

        Scanner inputTeclado = new Scanner(System.in);

        Random random = new Random();

        frutas.addAll(Arrays.asList("maca", "banana", "uva", "pera"));
        jogos.addAll(Arrays.asList("terraria", "fortnite", "valorant", "minecraft"));
        paises.addAll(Arrays.asList("brasil", "japao", "russia", "portugal"));

        int lifesPlayer = 3;

        Opcoes();

        System.out.println("Selecione uma Opção");
        int opcaoUser = inputTeclado.nextInt();

        switch (opcaoUser) {
            case 1:
                System.out.println("O tema é Fruta");

                int indiceFruta = random.nextInt(frutas.size());
                String palavraFruta = frutas.get(indiceFruta);

                while (lifesPlayer != 0) {
                    ArrayList<String> letrasDigitadas = new ArrayList<String>();

                    System.out.println("Letras Digitadas: " + letrasDigitadas);

                    System.out.println("Digite uma letra");
                    String letra = inputTeclado.next();

                    if (palavraFruta.contains(letra)) {
                        System.out.println("A palavra tem a letra " + letra);
                        letrasDigitadas.add(letra);
                    } else {
                        System.out.println("A palavra não tem a letra " + letra);
                        lifesPlayer--;
                    }

                    Chute();
                    String userDeseja = inputTeclado.next();

                    String userDesejaLower = userDeseja.toLowerCase();

                    if (userDesejaLower.equals("sim")) {
                        System.out.println("Digite a palavra que você acha");
                        String palavraAcha = inputTeclado.next();

                        if (palavraAcha.equals(palavraFruta)) {
                            System.out.println("VOCÊ GANHOU");
                            break;
                        } else {
                            System.out.println("VOCÊ PERDEU");
                            lifesPlayer = 0;
                        }
                    }
                }
                break;

            case 2:
                System.out.println("O tema é Jogos");

                int indiceJogo = random.nextInt(jogos.size());
                String palavraJogo = jogos.get(indiceJogo);

                while (lifesPlayer != 0) {
                    ArrayList<String> letrasDigitadas = new ArrayList<String>();

                    System.out.println("Letras Digitadas: " + letrasDigitadas);

                    System.out.println("Digite uma letra");
                    String letra = inputTeclado.next();

                    if (palavraJogo.contains(letra)) {
                        System.out.println("A palavra tem a letra " + letra);
                        letrasDigitadas.add(letra);
                    } else {
                        System.out.println("A palavra não tem a letra " + letra);
                        lifesPlayer--;
                    }

                    Chute();
                    String userDeseja = inputTeclado.next();

                    String userDesejaLower = userDeseja.toLowerCase();

                    if (userDesejaLower.equals("sim")) {
                        System.out.println("Digite a palavra que você acha");
                        String palavraAcha = inputTeclado.next();

                        if (palavraAcha.equals(palavraJogo)) {
                            System.out.println("VOCÊ GANHOU");
                            break;
                        } else {
                            System.out.println("VOCÊ PERDEU");
                            lifesPlayer = 0;
                        }
                    }
                }
                break;

            case 3:
                System.out.println("O tema é País");

                int indicePais = random.nextInt(paises.size());
                String palavraPais = paises.get(indicePais);

                while (lifesPlayer != 0) {
                    ArrayList<String> letrasDigitadas = new ArrayList<String>();

                    System.out.println("Letras Digitadas: " + letrasDigitadas);

                    System.out.println("Digite uma letra");
                    String letra = inputTeclado.next();

                    if (palavraPais.contains(letra)) {
                        System.out.println("A palavra tem a letra " + letra);
                        letrasDigitadas.add(letra);
                    } else {
                        System.out.println("A palavra não tem a letra " + letra);
                        lifesPlayer--;
                    }

                    Chute();
                    String userDeseja = inputTeclado.next();

                    String userDesejaLower = userDeseja.toLowerCase();

                    if (userDesejaLower.equals("sim")) {
                        System.out.println("Digite a palavra que você acha");
                        String palavraAcha = inputTeclado.next();

                        if (palavraAcha.equals(palavraPais)) {
                            System.out.println("VOCÊ GANHOU");
                            break;
                        } else {
                            System.out.println("VOCÊ PERDEU");
                            lifesPlayer = 0;
                        }
                    }
                }
                break;

            default:
                System.out.println("Opção Inválida");
                break;
        }
    }

    public static void Opcoes() {
        System.out.println("[1] - Frutas");
        System.out.println("[2] - Jogos");
        System.out.println("[3] - Países");
    }

    public static void Chute() {
        System.out.println("Deseja adivinhar a Palavra? (sim/não)");
    }
}
