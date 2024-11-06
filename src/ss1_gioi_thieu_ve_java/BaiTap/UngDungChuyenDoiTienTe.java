package ss1_gioi_thieu_ve_java.BaiTap;

import java.util.Scanner;
public class UngDungChuyenDoiTienTe {
    public static void main(String [] args){
        System.out.println("Chuyển đỏi tiền tệ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số USD bạn muốn đổi :");
        int moneyUSD = scanner.nextInt();

        if(moneyUSD > 0) {
            int resultVND = moneyUSD * 23000;
            System.out.println(resultVND + " VND");
        }
        else{
            System.out.println("Sai yêu cầu");
        }
    }
}
