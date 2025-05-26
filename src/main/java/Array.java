import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Array {
    public static void main(String[] args) {

        String[] words = {
                "Мама", "Папа", "Баба", "Деда", "Жучка",
                "Мама", "Папа", "Баба", "Деда", "Жучка",
                "Мама", "Папа", "Баба", "Деда", "Жучка", "Астон"
        };
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        Set<String> uniqueWords = wordCount.keySet();
        System.out.println("Уникальные слова и их количество:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord + ": " + wordCount.get(uniqueWord));
        }
    }
}