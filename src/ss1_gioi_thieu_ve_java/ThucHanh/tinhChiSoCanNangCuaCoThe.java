package ss1_gioi_thieu_ve_java.ThucHanh;

import java.util.Scanner;
public class tinhChiSoCanNangCuaCoThe {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình tính chỉ số cân nặng cơ thể");

        double weight;
        double height;
        double bmi;

        System.out.println("Nhập cân nặng");
        weight = scanner.nextDouble();

        System.out.println("Nhập chiều cao");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "Thiếu cân");
        }
        else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Bình thường");
        }
        else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "Thừa cân");
        }
        else {
            System.out.printf("%-20.2f%s", bmi, "Mập");
        }
    }
}
