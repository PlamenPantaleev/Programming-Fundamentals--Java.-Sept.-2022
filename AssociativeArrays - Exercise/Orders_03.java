package FundamentalsExercise.AssociativeArraysExercise;

import java.util.*;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, List<Double>> productMap = new LinkedHashMap<>();

        while (!command.equals("buy")) {
            String [] infoArray = command.split("\\s+");
            String product = infoArray[0];
            double price = Double.parseDouble(infoArray[1]);
            double quantity = Double.parseDouble(infoArray[2]);

            if (!productMap.containsKey(product)) {
                productMap.put(product, new ArrayList<>());
                productMap.get(product).add(price);
                productMap.get(product).add(quantity);
            } else {
                for (Map.Entry<String, List<Double>> element: productMap.entrySet()) {
                    List<Double> currentValues = element.getValue();
                    double currentPrice = currentValues.get(0);
                    double currentQuantity = currentValues.get(1);

                    if (element.getKey().equals(product)) {
                        currentValues.set(1, currentQuantity + quantity);
                       if (currentPrice != price) {
                           currentValues.set(0, price);
                       }
                       break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        productMap.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1)));
    }
}
