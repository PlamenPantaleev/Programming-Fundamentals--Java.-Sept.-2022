package FundamentalsExercise.AssociativeArraysExercise;

import java.util.*;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int counter = input.length;
        int goodsCounter = 0;

        LinkedHashMap<String, Integer> goods = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> junk = new LinkedHashMap<>();
        boolean isDone = false;
        goods.put("shards", 0);
        goods.put("fragments", 0);
        goods.put("motes", 0);

        while (true) {

            int realCounter = counter;
            for (int i = 0; i < realCounter; i+=2) {
                counter -= 2;
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") ||
                material.equals("motes")) {
                    goods.put(material, goods.get(material) + quantity);
                } else {
                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        junk.put(material, junk.get(material) + quantity);
                    }
                }
                for (Map.Entry<String, Integer> entry: goods.entrySet()) {
                    if (entry.getValue() >= 250) {
                        goodsCounter = 250;
                        goods.put(entry.getKey(), entry.getValue() - 250);
                        if (entry.getKey().equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (entry.getKey().equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else if (entry.getKey().equals("motes")) {
                            System.out.println("Dragonwrath obtained!");
                        }
                        isDone = true;
                        break;
                    }
                }
                if (isDone) {
                    break;
                }
            }
            if (isDone) {
                break;
            }
            input = scanner.nextLine().split(" ");
            counter = input.length;
        }
        goods.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junk.entrySet().forEach(junkEntry -> System.out.println(junkEntry.getKey() + ": " + junkEntry.getValue()));
    }
}
