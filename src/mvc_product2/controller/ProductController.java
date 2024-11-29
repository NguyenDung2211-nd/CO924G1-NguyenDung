package mvc_product2.controller;

import mvc_product2.entity.Product;
import mvc_product2.service.ProductService;
import mvc_product2.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private ProductService productService;

    public ProductController() {
        this.productService = new ProductServiceImpl();
    }

    public void addProduct(int id, String name, float price) {
        Product product = new Product(id, name, price);
        productService.addProduct(product);
    }

    public void printProducts() {
        productService.printProducts();
    }

    public void deleteProduct(int id) {
        productService.deleteProduct(id);
    }

    public void searchProduct(String name) {
        List<Product> foundProducts = productService.searchProduct(name);
        if (!foundProducts.isEmpty()) {
            foundProducts.forEach(System.out::println);  
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    public void editProduct(int id, String name, float price) {
        productService.editProduct(id, name, price);
    }

    public void sortByPriceAscending() {
        productService.sortByPriceAscending();
    }

    public void sortByPriceDescending() {
        productService.sortByPriceDescending();
    }

    public void sortByNameThenPriceThenId() {
        productService.sortByNameThenPriceThenId();
    }

    public boolean isIdExist(int id) {
        return productService.isIdExist(id);
    }

    public Product getProductById(int id) {
        return productService.getProductById(id);
    }




}
