package mvc_product2.service.impl;

import mvc_product2.entity.Product;
import mvc_product2.repository.ProductRepository;
import mvc_product2.service.ProductService;

import java.util.ArrayList;
import java.util.Comparator;
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
        Product product = productRepository.getProductById(id);
        if (product != null) {
            product.setName(name);
            product.setPrice(price);
            System.out.println("Sửa sản phẩm thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm.");
        }
    }

    @Override
    public void sortByPriceAscending() {
        List<Product> products = productRepository.getAllProducts();
        products.sort(Comparator.comparing(Product::getPrice));
        System.out.println("Sắp xếp tăng dần theo giá thành công.");
    }

    @Override
    public void sortByPriceDescending() {
        List<Product> products = productRepository.getAllProducts();
        products.sort(Comparator.comparing(Product::getPrice).reversed());
        System.out.println("Sắp xếp giảm dần theo giá thành công.");
    }

    @Override
    public void sortByNameThenPriceThenId() {
        List<Product> products = productRepository.getAllProducts();
        products.sort((p1, p2) -> {
            int nameComparison = p1.getName().compareTo(p2.getName());
            if (nameComparison != 0) return nameComparison;

            int priceComparison = Float.compare(p1.getPrice(), p2.getPrice());
            if (priceComparison != 0) return priceComparison;

            return Integer.compare(p1.getId(), p2.getId());
        });
        System.out.println("Sắp xếp sản phẩm theo tên (A-Z) -> giá -> id thành công.");
    }

    @Override
    public boolean isIdExist(int id) {
        return productRepository.isIdExist(id);
    }

    @Override
    public Product getProductById(int id) {
        List<Product> products = productRepository.getAllProducts();
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }



}
