package ss13_thuat_toan_tim_kiem.thuc_hanh.tinh_do_phuc_tap_cua_thuat_toan;
import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi : ");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            frequentChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("Ký tự xuất hiện nhiều nhất là '" + character + "' với tần suất " + max + " lần");
    }
}
