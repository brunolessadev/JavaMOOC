import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        // Cria o arquivo na pasta atual de execução do teste
        createFile("file.txt");

        // Cria o arquivo na pasta relativa do projeto
        createFile("mooc-java-programming-i/part04-Part04_23.CreatingANewFile/file.txt");
    }

    private static void createFile(String path) {
        try {
            File file = new File(path);
            if (file.getParentFile() != null) {
                file.getParentFile().mkdirs();
            }
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, world!");
            writer.close();
            System.out.println("Arquivo criado em: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}