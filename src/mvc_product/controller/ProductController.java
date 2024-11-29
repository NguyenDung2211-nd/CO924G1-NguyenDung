package mvc_product.controller;

import mvc_product.entity.Product;
import mvc_product.service.IProductService;
import mvc_product.service.impl.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();

    public void addProduct(Product product) {
            productService.addProduct(product);
            System.out.println("Sản phẩm đã được thêm thành công.");

    }

    public void deleteProduct(int id) {
            productService.deleteProduct(id);
            System.out.println("Sản phẩm đã được xóa thành công.");
    }

    public List<Product> printProducts() {
            return productService.getAllProducts();
    }

    public Product findProductById(int id) {
            return productService.findProductById(id);
    }

    public List<Product> findProductByName(String name) {
            return productService.findProductByName(name);
    }
}

