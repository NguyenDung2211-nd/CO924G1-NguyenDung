package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class DemSoLanXuatHienCuaCacKiTuTrongChuoi {
    public static void main(String[] args) {

        System.out.println("Đếm số lần xuất hiện của các kí tự trong chuỗi");
        Scanner scanner = new Scanner(System.in);


        String chuoi = "abcdabcdabcd";

        int soKiTu = chuoi.length();
        System.out.println("Số kí tự trong chuỗi : "+ soKiTu);

        System.out.println("Nhập kí tự để kiểm tra : ");
        char kiTu = scanner.next().charAt(0);


            int count = 0;
            for (int i = 0; i < chuoi.length(); i++) {
                if (chuoi.charAt(i) == kiTu) {
                    count++;
                }
            }
            if(count > 0) {
                System.out.println(kiTu + " có trong chuỗi và xuất hiện " + count + " lần.");
            }else{
                System.out.println(kiTu + " Không có trong chuỗi.");
            }
    }
}
