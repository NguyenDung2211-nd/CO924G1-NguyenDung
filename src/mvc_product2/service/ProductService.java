package mvc_product2.service;

import mvc_product2.entity.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    void printProducts();
    void deleteProduct(int id);
    List<Product> searchProduct(String name);
    void editProduct(int id, String name, float price);
    void sortByPriceAscending();
    void sortByPriceDescending();
    void sortByNameThenId();
    boolean isIdExist(int id);
    Product getProductById(int id);
}

