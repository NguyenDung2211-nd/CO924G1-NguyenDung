package ss17_binary_file.bai_tap.quan_li_san_pham_luu_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private float price;
    private String manufacturer;
    private String describe;

    public Product(){
    }
     public Product(int id, String name, float price, String manufacturer, String describe){
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.describe = describe;
     }

     public int getId(){
        return id;
     }
     public void setId(int id){
        this.id = id;
     }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescribe() {
        return describe;
    }
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product(" + "id = " + id + ", name = " + name + ", price = " + price + ", manufacturer = " + manufacturer + ", describe = " + describe + ")";
    }
}
