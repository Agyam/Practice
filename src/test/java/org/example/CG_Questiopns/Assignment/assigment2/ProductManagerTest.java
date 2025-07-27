package org.example.CG_Questiopns.Assignment.assigment2;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private ProductManager manager;

    @BeforeEach
    void setUp() {
        manager = new ProductManager();
    }

    @Test
    void testAddValidProduct() {
        Product p = new Product(1, "AppleJuice", 50.5,
                LocalDate.now().plusDays(10), "Fresh and rich,- full of taste.");
        manager.addProduct(p);

        List<Product> all = manager.getAllProducts();
        assertEquals(1, all.size());
        assertEquals("AppleJuice", all.get(0).getProductName());
    }

    @Test
    void testAddInvalidNameProduct() {
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Product(2, "bananaJuice", 45.0,
                        LocalDate.now().plusDays(10), "Nutritious,- and sweet."));
        assertTrue(e.getMessage().contains("Product name must start with a capital letter"));
    }

    @Test
    void testAddNegativePriceProduct() {
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Product(3, "MangoJuice", -10,
                        LocalDate.now().plusDays(5), "Fresh,- and organic."));
        assertEquals("Price must be a positive number!", e.getMessage());
    }

    @Test
    void testAddPastExpiryDateProduct() {
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Product(4, "OrangeJuice", 30,
                        LocalDate.now().minusDays(1), "Expired,- don't drink."));
        assertEquals("Expiry date must be a future date!", e.getMessage());
    }

    @Test
    void testAddInvalidDescriptionProduct() {
        Exception e = assertThrows(IllegalArgumentException.class, () ->
                new Product(5, "GrapeJuice", 50,
                        LocalDate.now().plusDays(5), "Only healthy drink"));
        assertTrue(e.getMessage().contains("Description must contain ',' and '-'"));
    }

    @Test
    void testDeleteProductById() {
        Product p = new Product(6, "LemonJuice", 20,
                LocalDate.now().plusDays(5), "Tart,- and energizing.");
        manager.addProduct(p);
        manager.deleteProduct(6);

        assertEquals(0, manager.getAllProducts().size());
    }

    @Test
    void testAutoRemoveExpiredProducts() {
        Product valid = new Product(7, "PeachJuice", 30,
                LocalDate.now().plusDays(3), "Sweet,- and juicy.");
        Product expired = new Product(8, "ExpiredJuice", 10,
                LocalDate.now().minusDays(3), "Old,- don't drink.");

        manager.addProduct(valid);
        manager.addProduct(expired);

        manager.autoRemoveExpiredProducts(LocalDate.now());

        assertEquals(1, manager.getAllProducts().size());
        assertEquals("PeachJuice", manager.getAllProducts().get(0).getProductName());
    }

    @Test
    void testSearchByName() {
        Product p1 = new Product(9, "BerryJuice", 25,
                LocalDate.now().plusDays(4), "Delicious,- and tangy.");
        manager.addProduct(p1);

        List<Product> result = manager.searchByName("BerryJuice");
        assertEquals(1, result.size());
        assertEquals("BerryJuice", result.get(0).getProductName());
    }

    @Test
    void testSearchByPriceRangeValid() {
        Product p1 = new Product(10, "WatermelonJuice", 40,
                LocalDate.now().plusDays(6), "Cool,- and hydrating.");
        Product p2 = new Product(11, "KiwiJuice", 90,
                LocalDate.now().plusDays(3), "Sweet,- and tangy.");
        manager.addProduct(p1);
        manager.addProduct(p2);

        Map<Integer, String> results = manager.searchByPriceRange(30, 50);
        assertEquals(1, results.size());
        assertTrue(results.containsKey(10));
    }

    @Test
    void testSearchByPriceRangeInvalidRange() {
        assertThrows(IllegalArgumentException.class, () ->
                manager.searchByPriceRange(-10, 50));
    }

    @Test
    void testSearchByPriceRangeNoResults() {
        Product p = new Product(12, "FigJuice", 100,
                LocalDate.now().plusDays(2), "Exotic,- and rich.");
        manager.addProduct(p);

        assertThrows(NoSuchElementException.class, () ->
                manager.searchByPriceRange(10, 50));
    }

    @Test
    void testDisplayProductSorting() {
        Product p1 = new Product(13, "ZebraJuice", 60,
                LocalDate.now().plusDays(5), "Wild,- and rare.");
        Product p2 = new Product(14, "AppleJuice", 60,
                LocalDate.now().plusDays(5), "Fresh,- and classic.");
        Product p3 = new Product(15, "BananaJuice", 60,
                LocalDate.now().plusDays(10), "Smooth,- and sweet.");

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        List<Product> sorted = manager.getAllProducts().stream()
                .sorted((a, b) -> {
                    int cmp = b.getExpiryDate().compareTo(a.getExpiryDate());
                    return cmp == 0 ? a.getProductName().compareTo(b.getProductName()) : cmp;
                }).collect(Collectors.toList());

        manager.displayProducts();

        assertEquals("BananaJuice", sorted.get(0).getProductName());
        assertEquals("AppleJuice", sorted.get(1).getProductName());
        assertEquals("ZebraJuice", sorted.get(2).getProductName());
    }
}
