package ss2_vong_lap_trong_java.ThucHanh;
import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiểm tra số nguyên tố");

        System.out.println("Nhập số để kiểm tra. Yêu cầu số nguyên dương");
        int number = scanner.nextInt();

        if(number < 2){
            System.out.println("Đây không phải là số nguyên tố");
        }else{
            int i = 2;
            boolean check = true;
            while(i <= Math.sqrt(number)){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println("Đây là số nguyên tố");
            }else{
                System.out.println("Đây không phải là số nguyên tố");
            }
        }
    }
}
