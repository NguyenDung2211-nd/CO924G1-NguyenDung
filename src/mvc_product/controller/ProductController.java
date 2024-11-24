package mvc_product.controller;

import mvc_product.entity.Product;
import mvc_product.service.IProductService;
import mvc_product.service.impl.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();

    public void addProduct(Product product) {
        try {
            productService.addProduct(product);
            System.out.println("Sản phẩm đã được thêm thành công.");
        } catch (Exception e) {
            System.out.println("Lỗi khi thêm sản phẩm: " + e.getMessage());
        }
    }

    public void deleteProduct(int id) {
        try {
            productService.deleteProduct(id);
            System.out.println("Sản phẩm đã được xóa thành công.");
        } catch (Exception e) {
            System.out.println("Lỗi khi xóa sản phẩm: " + e.getMessage());
        }
    }

    public List<Product> getAllProducts() {
        try {
            return productService.getAllProducts();
        } catch (Exception e) {
            System.out.println("Lỗi khi lấy danh sách sản phẩm: " + e.getMessage());
            return null;
        }
    }

    public Product findProductById(int id) {
        try {
            return productService.findProductById(id);
        } catch (Exception e) {
            System.out.println("Lỗi khi tìm sản phẩm: " + e.getMessage());
            return null;
        }
    }

    public List<Product> findProductByName(String name) {
        try {
            return productService.findProductByName(name);
        } catch (Exception e) {
            System.out.println("Lỗi khi tìm sản phẩm theo tên: " + e.getMessage());
            return null;
        }
    }
}

