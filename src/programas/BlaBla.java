import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class BlaBla {

    public static void main(String[] args) throws IOException {

        try {
            String nameUser = System.getProperty("user.name");
            String caminho = "C:\\Users\\" + nameUser + "\\Desktop\\bla.txt";

            File arquivo = new File(caminho);

            FileWriter writer = new FileWriter(arquivo);

            writer.write("Faz o LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
            writer.close();

            if (!arquivo.exists()) {
                arquivo.createNewFile();
                System.out.println("Arquivo criado: " + caminho);

            } else {

                int i = 0;

                while (true) {

                    // Process comandoEdge = Runtime.getRuntime().exec("cmd /c start msedge");
                    Process comandoNotepad = Runtime.getRuntime().exec("notepad " + caminho);


                    i++;

                    if (i == 100000) {
                        break;
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
