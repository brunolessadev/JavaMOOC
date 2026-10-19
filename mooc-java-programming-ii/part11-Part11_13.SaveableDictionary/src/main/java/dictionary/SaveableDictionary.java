package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionaryHashMap;
    private String file;

    public SaveableDictionary() {
        this.dictionaryHashMap = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this.dictionaryHashMap = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation){
        if (dictionaryHashMap.containsKey(words)){
            return;
        } else if (dictionaryHashMap.containsKey(translation)) {
            return;
        }
        dictionaryHashMap.put(words, translation);
        dictionaryHashMap.put(translation, words);
    }

    public String translate(String word){
        if (dictionaryHashMap.containsKey(word)){
            return dictionaryHashMap.get(word);
        }
        return null;
    }

    public void delete(String word){
        String translation = translate(word);

        dictionaryHashMap.remove(word);
        dictionaryHashMap.remove(translation);
    }

    public boolean load(){
        try (Scanner fileReader = new Scanner(Paths.get(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            ArrayList<String> savedKeys = new ArrayList<>();

            for (String key : this.dictionaryHashMap.keySet()) {
                if (savedKeys.contains(key)) {
                    continue;
                }

                String translation = this.dictionaryHashMap.get(key);
                writer.println(key + ":" + translation);

                savedKeys.add(key);
                savedKeys.add(translation);
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
