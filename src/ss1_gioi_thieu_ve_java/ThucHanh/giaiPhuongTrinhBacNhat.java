package ss1_gioi_thieu_ve_java.ThucHanh;
import java.util.Scanner;
public class giaiPhuongTrinhBacNhat {
    public static void main(String [] args){
        System.out.println("Giải phương trình bậc nhất.");
        System.out.println("Cho một phương trình là 'a * x + b = c' Vui lòng nhập hằng số.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a : ");
        double a = scanner.nextDouble();

        System.out.println("Nhập b : ");
        double b = scanner.nextDouble();

        System.out.println("Nhập c : ");
        double c = scanner.nextDouble();

        if(a != 0){
            double answer = (c - b) / a;
            System.out.println("Phương trình có 1 nghiệm x =\n" + answer);
        }else{
            if(b == c){
                System.out.println("Phương trình vô số nghiệm");
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
