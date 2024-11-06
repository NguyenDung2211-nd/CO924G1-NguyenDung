package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        System.out.println("Gọp mảng");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của mảng 1: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];

        System.out.print("Nhập kích thước của mảng 2: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];

        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < n1; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < n2; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < n2; i++) {
            array3[n1 + i] = array2[i];
        }

        System.out.println("Các phần tử của mảng thứ 3 sau khi gộp:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

    }
}
