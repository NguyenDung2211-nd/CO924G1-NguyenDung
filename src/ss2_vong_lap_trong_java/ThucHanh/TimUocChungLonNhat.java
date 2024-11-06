package ss2_vong_lap_trong_java.ThucHanh;
import java.util.Scanner;
public class TimUocChungLonNhat {
    public static void main(String [] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Tìm ước chung lớn nhất");

        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if(a == 0 || b == 0){
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước chung lơn nhất : "+ a );
    }
}
