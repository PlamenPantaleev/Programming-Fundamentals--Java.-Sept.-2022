package FundamentalsLab.AssociativeArrays;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arrayInput = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word: arrayInput) {
            String currentWord = word.toLowerCase();

            if (!map.containsKey(currentWord)) {
                map.put(currentWord, 1);
            } else {
                map.put(currentWord, map.get(currentWord) + 1);
            }
        }
        List<String> wordsList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                wordsList.add(entry.getKey());
            }
        }
        System.out.print(String.join(", ", wordsList));
    }
}
