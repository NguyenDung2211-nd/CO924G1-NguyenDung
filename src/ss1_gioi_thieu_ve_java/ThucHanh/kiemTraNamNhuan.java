package ss1_gioi_thieu_ve_java.ThucHanh;
import java.util.Scanner;
public class kiemTraNamNhuan {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình kiêmr tra năm nhuận");

        System.out.println("Nhập năm bạn muốn kiểm tra :");
        int year = scanner.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year +" là năm nhuận.");
        }else{
            System.out.println(year + " không phải là năm nhuận");
        }
    }
}
