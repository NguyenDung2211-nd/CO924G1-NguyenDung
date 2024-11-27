package ss17_binary_file.bai_tap.quan_li_san_pham_luu_file_nhi_phan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while(true) {
            System.out.println("Quản lí sản phẩm.");
            System.out.println("1. Thêm sản phẩm :");
            System.out.println("2. Hiển thị sản phẩm :");
            System.out.println("3. Tìm kiếm sản phẩm :");
            System.out.println("0. Thoát chương trình:");

            choice = getChoice(scanner);

            switch(choice) {
                case 1:
                    addProduct(scanner, productManager);
                    break;
                case 2:
                    productManager.printProduct();
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm để tìm kiếm.");
                    String name = scanner.nextLine();
                    productManager.searchProduct(name);
                    break;
                case 0:
                    System.out.println("Đã thoát.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static int getChoice(Scanner scanner){
        int choice = 0;
        while(true){
            System.out.println("Mời bạn nhập lựa chọn : ");
            try{
                choice = Integer.parseInt(scanner.nextLine());
                if(choice < 0){
                System.out.println("Sai yêu cầu. Mời bạn nhập lại.");
               }else{
                    return choice;
                }
            }catch(NumberFormatException e){
                System.out.println("Sai yêu cầu. Lựa chọn của bạn phải là 1 số.");
            }catch(Exception e){
                System.out.println("Lỗi không xác định.");
            }
        }
    }

    private static void addProduct(Scanner scanner, ProductManager productManager) {
        int id = 0;
        while(true) {
            System.out.println("Nhập id sản phẩm : ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if(id <= 0){
                    System.out.println("Sai yêu cầu. id phải là một số nguyên dương (> 0).");
                }else{
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("Sai yêu cầu. id phải là 1 số nguyên dương.");
            }catch(Exception e){
                System.out.println("Lỗi không xác định.");
            }
        }

        System.out.println("Nhập tên sản phẩm : ");
        String name = scanner.nextLine();

        float price = 0;
        while(true) {
            System.out.println("Nhập giá sản phẩm : ");
            try {
                price = Float.parseFloat(scanner.nextLine());
                if(price <= 0){
                    System.out.println("Sai yêu cầu. Giá sản phẩm không phải là số âm (free càng không nha :))).");
                }else{
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("Sai yêu cầu. giá sản phẩm phải là 1 số .");
            }catch(Exception e){
                System.out.println("Lỗi không xác định.");
            }
        }

        System.out.println("Nhập hãng sản xuất : ");
        String munufacturer = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm : ");
        String describe = scanner.nextLine();

        Product product = new Product(id, name, price, munufacturer, describe);
        productManager.addProduct(product);
    }
}
