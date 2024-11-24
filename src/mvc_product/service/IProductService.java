package mvc_product.service;

import mvc_product.entity.Product;
import mvc_product.repository.ProductRepository;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    void deleteProduct(int id);
    List<Product> getAllProducts();
    Product findProductById(int id);
    List<Product> findProductByName(String name);
}


