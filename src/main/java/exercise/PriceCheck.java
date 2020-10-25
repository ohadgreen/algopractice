package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PriceCheck {

    public static void main(String[] args) {
        System.out.println("Hello");
    }

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        // Write your code here
        int wrongPricing = 0;

        Map<String, Float> priceMap = new HashMap<>();

        for (int i = 0; i < products.size(); i++) {
            priceMap.put(products.get(i), productPrices.get(i));
        }

        for (int i = 0; i < productSold.size(); i++) {
            String prodSold = productSold.get(i);
            Float soldProdPrice = soldPrice.get(i);

            if(priceMap.containsKey(prodSold)) {
                Float realPrice = priceMap.get(prodSold);
                if(!realPrice.equals(soldProdPrice)) {
                    wrongPricing++;
                }
            }
        }

        return wrongPricing;
    }


}
