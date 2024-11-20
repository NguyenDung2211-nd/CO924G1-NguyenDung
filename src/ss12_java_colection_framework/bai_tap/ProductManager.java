package ss12_java_colection_framework.bai_tap;

import java.util.ArrayList;

public class ProductManager {
   private ArrayList<Product> products;

   public ProductManager() {
       this.products = new ArrayList<Product>();
   }

   public void addProduct(Product product){
       this.products.add(product);
   }

   public void printProducts(){
       for(Product product : products){
           System.out.println(product);
       }
   }

   public void deleteProduct(int id){
       boolean found = false;
       for(Product product : products){
           if(product.getId() == id){
               products.remove(product);
               System.out.println("Xóa sản phẩm thành công.");
               break;
           }
       }
       if(!found){
           System.out.println("Không tìm thấy id sản phẩm.");
       }
   }

   public void searchProduct(String name){
       for(Product product : products){
           if(product.getName().equals(name)){
               System.out.println(product);
           }
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

   public void sortByPriceAscending(){
       for(int i = 0; i < products.size()-1; i++){
           for(int j = i + 1; j < products.size(); j++){
               if(products.get(i).getPrice() > products.get(j).getPrice()){
                   Product temp = products.get(i);
                   products.set(i, products.get(j));
                   products.set(j, temp);
               }
           }
       }
       System.out.println("Sắp xếp tăng dần theo giá thành công.");
   }

   public void sortByPriceDescending(){
       for(int i = 0; i < products.size()-1; i++){
           for(int j = i + 1; j < products.size(); j++){
               if(products.get(i).getPrice() < products.get(j).getPrice()){
                   Product temp = products.get(i);
                   products.set(i, products.get(j));
                   products.set(j, temp);
               }
           }
       }
       System.out.println("Sắp xếp giảm dần theo giá thành công.");
   }
}
