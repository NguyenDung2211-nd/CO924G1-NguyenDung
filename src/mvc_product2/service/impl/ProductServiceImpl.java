package mvc_product2.service.impl;

import mvc_product2.entity.Product;
import mvc_product2.repository.ProductRepository;
import mvc_product2.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl() {
        this.productRepository = new ProductRepository();
    }

    @Override
    public void addProduct(Product product) {
        if (productRepository.isIdExist(product.getId())) {
            System.out.println("Sản phẩm với ID " + product.getId() + " đã tồn tại.");
        } else {
            productRepository.addProduct(product);
            System.out.println("Thêm sản phẩm thành công.");
        }
    }


    @Override
    public void printProducts() {
        List<Product> products = productRepository.getAllProducts();
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng.");
        } else {
            System.out.println("Danh sách sản phẩm hiện tại : ");
            products.forEach(System.out::println);
        }
    }

    @Override
    public void deleteProduct(int id) {
        Product product = productRepository.getProductById(id);
        if (product != null) {
            productRepository.deleteProduct(id);
            System.out.println("Xóa sản phẩm thành công.");
        } else {
            System.out.println("Sản phẩm với ID " + id + " không tồn tại.");
        }
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : productRepository.getAllProducts()) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public void editProduct(int id, String name, float price) {
        productRepository.editProduct(id, name, price);
    }

    @Override
    public void sortByPriceAscending() {
        productRepository.sortByPriceAscending();
        System.out.println("Sắp xếp tăng dần theo giá thành công.");
    }

    @Override
    public void sortByPriceDescending() {
        productRepository.sortByPriceDescending();
        System.out.println("Sắp xếp giảm dần theo giá thành công.");
    }

    @Override
    public void sortByNameThenId() {
        productRepository.sortByNameThenId();
        System.out.println("Sắp xếp sản phẩm theo tên (A-Z) -> ID thành công.");
    }


    @Override
    public boolean isIdExist(int id) {
        return productRepository.isIdExist(id);
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

}
