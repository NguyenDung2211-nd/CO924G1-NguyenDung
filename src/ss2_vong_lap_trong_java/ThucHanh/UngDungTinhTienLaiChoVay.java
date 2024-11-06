package ss2_vong_lap_trong_java.ThucHanh;
import java.util.Scanner;
public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args){

        double money ;
        int month ;
        double interestRate ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ứng dụng tính tiền lãi cho vay");

        System.out.println("Nhập số tiền đầu tư :");
        money = scanner.nextDouble();

        System.out.println("Nhập số tháng :");
        month = scanner.nextInt();

        System.out.println("Nhập lãi xuất :");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng iền lãi "+ totalInterest);
    }
}
