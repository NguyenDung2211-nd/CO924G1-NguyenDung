package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class ThemPhanTuVaoMang {
    public static void main(String[] args) {

        System.out.println("Thêm phần tử vào mảng");
        Scanner scanner = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Nhập số cần chèn (X): ");
        int x = scanner.nextInt();

        System.out.print("Nhập vị trí cần chèn (index): ");
        int index = scanner.nextInt();

        if (index < 0 || index > arr.length-1) {
            System.out.println("Không thể chèn phần tử vào vị trí này.");
        } else {
            for (int i = arr.length-1; i > index; i--) {
                arr[i] = arr[i - 1];
            }

            arr[index] = x;

            System.out.print("Mảng sau khi chèn " + x + " vào vị trí " + index + ": ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
