package ss1_gioi_thieu_ve_java.BaiTap;
import java.util.Scanner;
public class HienThiLoiChao {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hiển thị lời chào");

        System.out.println("Nhập tên : ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);
    }
}
