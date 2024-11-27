
package mvc_product.view;

import mvc_product.controller.ProductController;
import mvc_product.entity.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductController productController = new ProductController();

        int choice = 0;
        while (true) {
            try {
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

                switch (choice) {
                    case 1:
                        addProduct(scanner, productController);
                        break;
                    case 2:
                        printProducts(productController);
                        break;
                    case 3:
                        deleteProduct(scanner, productController);
                        break;
                    case 4:
                        searchProduct(scanner, productController);
                        break;
                    case 5:
                        editProduct(scanner, productController);
                        break;
                    case 6:
                        sortByPriceAscending(productController);
                        break;
                    case 7:
                        sortByPriceDescending(productController);
                        break;
                    case 8:
                        sortByNameThenPriceThenId(productController);
                        break;
                    case 0:
                        System.out.println("Đã Thoát.");
                        return;
                    default:
                        System.out.println("Chọn chức năng không hợp lệ.");
                }
            } catch (Exception e) {
                System.out.println("Đã xảy ra lỗi: " + e.getMessage());
            }
        }
    }

    private static int getChoice(Scanner scanner) {
        int choice = 0;
        while (true) {
            try {
                System.out.print("Mời bạn nhập lựa chọn: ");
                choice = Integer.parseInt(scanner.nextLine());
                return choice;
            } catch (NumberFormatException e) {
                System.out.println("Choice phải là số.");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định: " + e.getMessage());
            }
        }
    }

    private static String getInput(Scanner scanner, String message) {
        String input = "";
        while (true) {
            try {
                System.out.print(message);
                input = scanner.nextLine();
                if (input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Không thể để trống.");
                }
                return input;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }

    private static void addProduct(Scanner scanner, ProductController productController) {
        int id = 0;
        while(true) {
            try {
                id = Integer.parseInt(getInput(scanner, "Nhập id sản phẩm : "));
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

        String name = getInput(scanner, "Nhập tên sản phẩm : ");

        float price = 0;
        while(true) {
            try {
                price = Float.parseFloat(getInput(scanner, "Nhập giá cho sản phẩm : "));
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

        Product product = new Product(id, name, price);
        productController.addProduct(product);
    }

    private static void printProducts(ProductController productController) {
            System.out.println("Danh sách sản phẩm:");
            for (Product product : productController.getAllProducts()) {
                System.out.println(product);
            }
    }

    private static void deleteProduct(Scanner scanner, ProductController productController) {
        int id = 0;
        while(true) {
            try {
                id = Integer.parseInt(getInput(scanner, "Nhập id sản phẩm cần xóa: "));
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
        Product product = productController.findProductById(id);
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm có id là: " + id);
        } else {
            System.out.println("Thông tin sản phẩm cần xóa: " + product + ".\nBạn có chắc muốn xóa sản phẩm này không? " +
                    "\nLưu ý: Hành động này không thể hoàn tác.");
            System.out.println("Bấm 'y' để xác nhận. Bấm phím bất kỳ để hủy.");

            char confirm = scanner.nextLine().charAt(0);
            if (confirm == 'y') {
                productController.deleteProduct(id);
                System.out.println("Xóa thành công sản phẩm có id: " + id);
            } else {
                System.out.println("Hủy xóa sản phẩm.");
            }
        }
    }

    private static void searchProduct(Scanner scanner, ProductController productController) {
        try {
            String name = getInput(scanner, "Nhập tên sản phẩm cần tìm: ");
            for (Product product : productController.findProductByName(name)) {
                System.out.println(product);
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi tìm kiếm sản phẩm: " + e.getMessage());
        }
    }

    private static void editProduct(Scanner scanner, ProductController productController) {
        try {
            int id = Integer.parseInt(getInput(scanner, "Nhập id sản phẩm cần sửa: "));
            String newName = getInput(scanner, "Nhập tên sản phẩm mới: ");
            float newPrice = Float.parseFloat(getInput(scanner, "Nhập giá sản phẩm mới: "));
            productController.findProductById(id).setName(newName);
            productController.findProductById(id).setPrice(newPrice);
        } catch (NumberFormatException e) {
            System.out.println("Sai yêu cầu. Vui lòng nhập giá trị hợp lệ.");
        } catch (NullPointerException e) {
            System.out.println("Lỗi: Không tìm thấy sản phẩm với id này.");
        } catch (Exception e) {
            System.out.println("Lỗi khi sửa sản phẩm: " + e.getMessage());
        }
    }

    private static void sortByPriceAscending(ProductController productController) {
        try {
            productController.getAllProducts().sort((p1, p2) -> Float.compare(p1.getPrice(), p2.getPrice()));
            System.out.println("Danh sách sản phẩm sau khi sắp xếp theo giá tăng dần:");
            printProducts(productController);
        } catch (Exception e) {
            System.out.println("Lỗi khi sắp xếp sản phẩm theo giá tăng dần: " + e.getMessage());
        }
    }

    private static void sortByPriceDescending(ProductController productController) {
        try {
            productController.getAllProducts().sort((p1, p2) -> Float.compare(p2.getPrice(), p1.getPrice()));
            System.out.println("Danh sách sản phẩm sau khi sắp xếp theo giá giảm dần:");
            printProducts(productController);
        } catch (Exception e) {
            System.out.println("Lỗi khi sắp xếp sản phẩm theo giá giảm dần: " + e.getMessage());
        }
    }

    private static void sortByNameThenPriceThenId(ProductController productController) {
        try {
            productController.getAllProducts().sort((p1, p2) -> {
                int nameCompare = p1.getName().compareTo(p2.getName());
                if (nameCompare != 0) return nameCompare;
                int priceCompare = Float.compare(p1.getPrice(), p2.getPrice());
                if (priceCompare != 0) return priceCompare;
                return Integer.compare(p1.getId(), p2.getId());
            });
            System.out.println("Danh sách sản phẩm sau khi sắp xếp theo tên, giá, và id:");
            printProducts(productController);
        } catch (Exception e) {
            System.out.println("Lỗi khi sắp xếp sản phẩm.");
        }
    }
}