package org.example.CG_Questiopns.Assignment.assigment2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product p) {
        productList.add(p);
        System.out.println("Product added successfully!");
    }

    public void deleteProduct(int productId) {
        productList.removeIf(p -> p.getProductId() == productId);
    }

    public void autoRemoveExpiredProducts(LocalDate currentDate) {
        productList.removeIf(p -> p.getExpiryDate().isBefore(currentDate));
    }

    public List<Product> searchByName(String name) {
        return productList.stream()
                .filter(p -> p.getProductName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public Map<Integer, String> searchByPriceRange(double min, double max) {
        if (min < 0 || max < 0 || min > max)
            throw new IllegalArgumentException("Invalid price range!");

        Map<Integer, String> result = productList.stream()
                .filter(p -> p.getPrice() >= min && p.getPrice() <= max)
                .collect(Collectors.toMap(Product::getProductId, Product::getProductName));

        if (result.isEmpty())
            throw new NoSuchElementException("No products found in this price range!");

        return result;
    }

    public void displayProducts() {
        productList.stream()
                .sorted(Comparator.comparing(Product::getExpiryDate).reversed()
                        .thenComparing(Product::getProductName))
                .forEach(System.out::println);
    }

    public List<Product> getAllProducts() {
        return productList;
    }
}

