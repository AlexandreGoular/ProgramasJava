package projects;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.time.LocalDate;

public class AnotacoesDiaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String anotacoesUser = "";

        LocalDate dataDiaria = LocalDate.now();
        String date = dataDiaria.toString();

        boolean dateNow = false;

        try {

            File anotacoes = new File("B:\\Programacao\\Projects\\JavaAnotacoes\\anotacoesDiaria.txt");

            if (!anotacoes.exists()) {

                System.out.println("Arquivo não existe. Criando arquivo...");

                if (!anotacoes.createNewFile()) {

                    System.out.println("Erro ao criar arquivo.");
                    return;
                }
            }

            Scanner scan = new Scanner(anotacoes);

            while (scan.hasNextLine()) {

                String linha = scan.nextLine();

                if (linha.contains(date)) {

                    dateNow = true;
                    break;
                }
            }

            FileWriter texto = new FileWriter(anotacoes, true);

            if (dateNow == true) {

                System.out.println("Digite suas anotações:");
                anotacoesUser = input.nextLine();
            }

            if (dateNow) {

                texto.write(" - " + anotacoesUser);

            } else {

                anotacoesUser = input.nextLine();
                texto.write(dataDiaria + " - " + anotacoesUser);
            }

            texto.write("\n");
            texto.flush();
            texto.close();

            System.out.println("Anotações adicionadas");

        } catch (IOException e) {
            System.out.println("Erro");
            e.printStackTrace();
        }
    }
}
