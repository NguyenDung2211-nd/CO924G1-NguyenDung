package ss17_binary_file.bai_tap.quan_li_san_pham_luu_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();
    private final String filePath = "src/ss17_binary_file/bai_tap/quan_li_san_pham_luu_file_nhi_phan/data.txt";

    public void addProduct(Product product) {
        products = readFromFile();
        products.add(product);
        saveToFile();
    }

    public void printProduct() {
        products = readFromFile();
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public void searchProduct(String name) {
        products = readFromFile();
        boolean found = false;
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm nào.");
        }
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu file: " + e.getMessage());
        }
    }

    private List<Product> readFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            List<Product> productList = (List<Product>) ois.readObject();
            System.out.println("Dữ liệu đọc từ file: " + productList);
            return productList;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
