package mvc.view;

import mvc.controller.StudentController;
import mvc.entity.Person;
import mvc.entity.Student;

import java.util.Scanner;

public class DemoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chào mừng bạn đến với trang quản lý CodeGym");
        System.out.println("1. Quản lý học sinh");
        System.out.println("2. Quản lý giáo viên");
        System.out.println("3. Thoát");
        System.out.print("Mời bạn nhập lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                menuStudent();
                break;
            case 2:
                break;
            case 3:
                return;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }

    public static void menuStudent() {
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();

        System.out.println("Quản lý học sinh");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm học sinh");
        System.out.println("3. Sửa thông tin học sinh");
        System.out.println("4. Xóa học sinh");
        System.out.println("5. Tìm kiếm học sinh");
        System.out.println("6. Quay lại");
        System.out.print("Mời bạn nhập lựa chọn: ");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                Student[] students = studentController.display();
                for (Student student: students) {
                    System.out.println(student);
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                return;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }
}
