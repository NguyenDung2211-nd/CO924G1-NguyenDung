package ss12_java_colection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {
   private ArrayList<Product> products;

   public ProductManager() {
       this.products = new ArrayList<Product>();
   }

   public void addProduct(Product product){
       this.products.add(product);
   }

    public void printProducts() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm rỗng.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public void deleteProduct(int id) {
        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                System.out.println("Xóa sản phẩm thành công.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy id sản phẩm.");
        }
    }

    public void searchProduct(String name) {
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

   public void editProduct(int id, String name, float price){
       boolean found = false;
       for(Product product : products){
           if(product.getId() == id){
               product.setName(name);
               product.setPrice(price);
               System.out.println("Sửa sản phẩm thành công.");
               found = true;
               break;
           }
       }
       if(!found){
           System.out.println("Không tìm thấy sản phẩm..");
       }
   }

    public void sortByPriceAscending() {
        products.sort(Comparator.comparing(Product::getPrice));
        System.out.println("Sắp xếp tăng dần theo giá thành công.");
    }

    public void sortByPriceDescending() {
        products.sort(Comparator.comparing(Product::getPrice).reversed());
        System.out.println("Sắp xếp giảm dần theo giá thành công.");
    }

    public void sortByNameThenPriceThenId() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                int nameComparison = p1.getName().compareTo(p2.getName());
                if (nameComparison != 0) {
                    return nameComparison;
                }

                int priceComparison = Double.compare(p1.getPrice(), p2.getPrice());
                if (priceComparison != 0) {
                    return priceComparison;
                }

                return Integer.compare(p1.getId(), p2.getId());
            }
        });
        System.out.println("Sắp xếp sản phẩm theo tên (A-Z) -> giá -> id thành công.");
    }

}
