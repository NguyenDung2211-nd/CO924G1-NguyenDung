package mvc_product2.repository;

import mvc_product2.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProductRepository {
    private List<Product> products;

    private static final String FILE_PATH = "src/mvc_product2/data/data.csv";

    public ProductRepository() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        try (FileWriter fileWriter = new FileWriter(FILE_PATH, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(product.getId() + "," + product.getName() + "," + product.getPrice());
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi sản phẩm vào file.");
        }
        products.add(product);
    }

    public List<Product> getAllProducts() {
        List<Product> productsFromFile = new LinkedList<>();
        File file = new File(FILE_PATH);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Product product = new Product(Integer.parseInt(data[0]), data[1], Float.parseFloat(data[2]));
                productsFromFile.add(product);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file sản phẩm.");
        }
        return productsFromFile;
    }

    public void deleteProduct(int id) {
        List<Product> products = getAllProducts();
        boolean found = false;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            saveAll(products);
            System.out.println("Đã xóa sản phẩm thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm để xóa.");
        }
    }


    public void editProduct(int id, String newName, float newPrice) {
        List<Product> products = getAllProducts();
        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                found = true;
                break;
            }
        }
        if (found) {
            saveAll(products);
            System.out.println("Sản phẩm đã được cập nhật thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm với ID: " + id);
        }
    }

    public void sortByPriceAscending() {
        List<Product> products = getAllProducts();
        products.sort(Comparator.comparing(Product::getPrice));
        saveAll(products);
        System.out.println("Danh sách sản phẩm đã được sắp xếp tăng dần theo giá.");
    }

    public void sortByPriceDescending() {
        List<Product> products = getAllProducts();
        products.sort(Comparator.comparing(Product::getPrice).reversed());
        saveAll(products);
        System.out.println("Danh sách sản phẩm đã được sắp xếp giảm dần theo giá.");
    }

    public void sortByNameThenId() {
        List<Product> products = getAllProducts();
        products.sort((p1, p2) -> {
            int nameComparison = p1.getName().compareToIgnoreCase(p2.getName());
            if (nameComparison != 0) {
                return nameComparison;
            }
            return Integer.compare(p1.getId(), p2.getId());
        });
        saveAll(products);
        System.out.println("Danh sách sản phẩm đã được sắp xếp theo tên (A-Z), nếu trùng tên thì sắp xếp theo ID.");
    }

    private void saveAll(List<Product> products) {
        File file = new File(FILE_PATH);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Product product : products) {
                bufferedWriter.write(product.getId() + "," + product.getName() + "," + product.getPrice());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi danh sách sản phẩm vào file.");
        }
    }

    public Product getProductById(int id) {
        for (Product product : getAllProducts()) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public boolean isIdExist(int id) {
        for (Product product : getAllProducts()) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
