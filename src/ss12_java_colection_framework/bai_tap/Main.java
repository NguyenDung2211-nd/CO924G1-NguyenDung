package ss12_java_colection_framework.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        int choice = 0;
        while(true){
            System.out.println("Quản lí sản phẩm");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Hiển thị danh sách sản phẩm.");
            System.out.println("3. Xóa sản phẩm (ghi rõ id sản phẩm để xóa).");
            System.out.println("4. Tìm kiếm sản phẩm (nhập tên sản phẩm để tìm).");
            System.out.println("5. Sửa thông tin sản phẩm (nhập id sản phẩm để sửa).");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá.");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá.");
            System.out.println("8. Sắp xếp sản phẩm theo tên(cùng tên thì theo giá, cùng giá thì theo id).");
            System.out.println("0. Thoát khỏi chương trình.");

            choice = getChoice(scanner);

            switch(choice){
                case 1 :
                    addProduct(scanner, productManager);
                    break;
                case 2:
                    productManager.printProducts();
                    break;
                case 3:
                    deleteProduct(scanner, productManager);
                    break;
                case 4:
                    searchProduct(scanner, productManager);
                    break;
                case 5:
                    editProduct(scanner, productManager);
                    break;
                case 6:
                   productManager.sortByPriceAscending();
                   productManager.printProducts();
                    break;
                case 7:
                   productManager.sortByPriceDescending();
                   productManager.printProducts();
                    break;
                case 8:
                    productManager.sortByNameThenPriceThenId();
                    productManager.printProducts();
                    break;
                case 0:
                    System.out.println("Đã Thoát.");
                    return;
                default:
                    System.out.println("Chọn chức năng không hợp lệ.");
            }
        }
    }

    private static void addProduct(Scanner scanner, ProductManager productManager) {
        System.out.println("Nhập id sản phẩm : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm : ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá cho sản phẩm : ");
        float price = Float.parseFloat(scanner.nextLine());
        Product product = new Product(id, name, price);
        productManager.addProduct(product);
    }

    private static void deleteProduct(Scanner scanner, ProductManager productManager) {
        int id;
        System.out.println("Nhập id sản phẩm : ");
        id = Integer.parseInt(scanner.nextLine());
        productManager.deleteProduct(id);
    }

    private static void searchProduct(Scanner scanner, ProductManager productManager) {
        String name;
        System.out.println("Nhập tên sản phẩm để tìm kiếm : ");
        name = scanner.nextLine();
        System.out.println("Kết quả tìm kiếm : ");
        productManager.searchProduct(name);
    }

    private static void editProduct(Scanner scanner, ProductManager productManager) {
        int id;
        System.out.println("Nhập id của sản phẩm : ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Sửa thông tin sản phẩm : ");
        System.out.println("Sửa lại tên sản phẩm.");
        String newName = scanner.nextLine();
        System.out.println("Sửa lại giá sản phẩm.");
        float newPrice = Float.parseFloat(scanner.nextLine());
        productManager.editProduct(id, newName, newPrice);
    }

    private static int getChoice(Scanner scanner) {
        int choice = 0;
        while (true) {
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choice = Integer.parseInt(scanner.nextLine());
                return choice;
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn phải là số.");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định: " + e.getMessage());
            }
        }
    }
}
