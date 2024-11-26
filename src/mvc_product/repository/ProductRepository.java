package mvc_product.repository;

import mvc_product.entity.Product;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ProductRepository {

    private static final String FILE_PATH = "src/mvc_product/data/data.csv";

    public List<Product> getAll() {
        File file = new File(FILE_PATH);
        List<Product> products = new LinkedList<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Product product = new Product(Integer.parseInt(data[0]), data[1], Float.parseFloat(data[2]));
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file sản phẩm.");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file sản phẩm.");
        }
        return products;
    }

    public void add(Product product) {
        File file = new File(FILE_PATH);
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(product.getId() + "," + product.getName() + "," + product.getPrice());
            bufferedWriter.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi sản phẩm vào file.");
        }
    }

    public void delete(int id) {
        List<Product> products = getAll();
        boolean found = products.removeIf(product -> product.getId() == id);
        if (found) {
            saveAll(products);
            System.out.println("Đã xóa sản phẩm thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm để xóa.");
        }
    }

    public Product findById(int id) {
        return getAll().stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }

    public List<Product> findByName(String name) {
        List<Product> foundProducts = new LinkedList<>();
        for (Product product : getAll()) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
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
}
