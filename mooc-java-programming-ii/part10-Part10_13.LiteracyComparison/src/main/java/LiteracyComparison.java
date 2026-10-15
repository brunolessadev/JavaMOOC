import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<Literacy> literacies = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .forEach(parts -> {
                        String gender = parts[2].replace(" (%)", "").trim();
                        String country = parts[3].trim();
                        int year = Integer.valueOf(parts[4].trim());
                        double literacyPercent = Double.valueOf(parts[5].trim());

                        literacies.add(new Literacy(country, year, gender, literacyPercent));
                    });
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        Collections.sort(literacies);

        for (Literacy literacy : literacies) {
            System.out.println(literacy);
        }
    }
}