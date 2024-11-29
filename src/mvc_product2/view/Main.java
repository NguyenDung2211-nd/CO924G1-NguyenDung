package mvc_product2.view;

import mvc_product2.controller.ProductController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductController productController = new ProductController();

        int choice = 0;
        while (true) {
            System.out.println("============== Quản lí sản phẩm ==============");
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
                    productController.printProducts();
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
                    productController.sortByPriceAscending();
                    break;
                case 7:
                    productController.sortByPriceDescending();
                    break;
                case 8:
                    productController.sortByNameThenPriceThenId();
                    break;
                case 0:
                    System.out.println("Đã Thoát.");
                    return;
                default:
                    System.out.println("Chọn chức năng không hợp lệ.");
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
                System.out.println("Lựa chọn phải là số.");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định: ");
            }
        }
    }

    private static void addProduct(Scanner scanner, ProductController productController) {
        int id = 0;
        while(true) {
            System.out.print("Nhập id sản phẩm : ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if(id <= 0){
                    System.out.println("Sai yêu cầu. id phải là một số nguyên dương (> 0).");
                } else if (productController.isIdExist(id)) {
                    System.out.println("ID sản phẩm đã tồn tại. Vui lòng nhập ID khác.");
                }else{
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("Sai yêu cầu. id phải là 1 số nguyên dương.");
            }catch(Exception e){
                System.out.println("Lỗi không xác định.");
            }
        }

        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        float price = 0;
        while(true) {
            System.out.print("Nhập giá sản phẩm : ");
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
        productController.addProduct(id, name, price);
    }

    private static void deleteProduct(Scanner scanner, ProductController productController) {
        int id = 0;
        while(true) {
            System.out.print("Nhập id sản phẩm cần xóa: ");
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
        productController.deleteProduct(id);
    }

    private static void searchProduct(Scanner scanner, ProductController productController) {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String name = scanner.nextLine();
        productController.searchProduct(name);
    }

    private static void editProduct(Scanner scanner, ProductController productController) {
        int id;
        while (true) {
            System.out.print("Nhập id sản phẩm cần sửa: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id <= 0) {
                    System.out.println("Sai yêu cầu. id phải là một số nguyên dương (> 0).");
                    continue;
                }
                if (productController.getProductById(id) == null) {
                    System.out.println("Không tìm thấy sản phẩm với ID: " + id);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sai yêu cầu. id phải là một số nguyên dương.");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định.");
            }
        }

        System.out.print("Nhập tên sản phẩm mới: ");
        String name = scanner.nextLine();

        float price;
        while (true) {
            System.out.print("Nhập giá sản phẩm mới: ");
            try {
                price = Float.parseFloat(scanner.nextLine());
                if (price <= 0) {
                    System.out.println("Sai yêu cầu. Giá sản phẩm phải lớn hơn 0.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai yêu cầu. Giá sản phẩm phải là một số.");
            } catch (Exception e) {
                System.out.println("Lỗi không xác định.");
            }
        }
        productController.editProduct(id, name, price);
    }

}

