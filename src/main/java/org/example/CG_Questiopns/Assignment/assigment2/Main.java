package org.example.CG_Questiopns.Assignment.assigment2;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the Product Management System!");
            System.out.println("1. Add Product\n2. Delete Product\n3. Search Product\n4. Display Products\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Product Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
                        LocalDate date = LocalDate.parse(sc.nextLine());
                        System.out.print("Enter Description: ");
                        String desc = sc.nextLine();

                        Product p = new Product(id, name, price, date, desc);
                        manager.addProduct(p);
                        break;

                    case 2:
                        System.out.print("Enter Product ID to delete: ");
                        int delId = sc.nextInt();
                        manager.deleteProduct(delId);
                        System.out.println("Deleted if existed.");
                        break;

                    case 3:
                        System.out.println("a. By Name\nb. By Price Range");
                        String sub = sc.next();
                        sc.nextLine();
                        if (sub.equalsIgnoreCase("a")) {
                            System.out.print("Enter name: ");
                            String searchName = sc.nextLine();
                            manager.searchByName(searchName).forEach(System.out::println);
                        } else {
                            System.out.print("Enter min price: ");
                            double min = sc.nextDouble();
                            System.out.print("Enter max price: ");
                            double max = sc.nextDouble();
                            Map<Integer, String> results = manager.searchByPriceRange(min, max);
                            results.forEach((k, v) -> System.out.println("ID: " + k + ", Name: " + v));
                        }
                        break;

                    case 4:
                        manager.displayProducts();
                        break;

                    case 5:
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}

