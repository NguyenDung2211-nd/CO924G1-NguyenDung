package ss15_exception_va_debug.bai_tap.su_dung_lop_illegaltriangle_exception;

import java.util.Scanner;

import static ss15_exception_va_debug.bai_tap.su_dung_lop_illegaltriangle_exception.Triangle.checkTriangle;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh a: ");
            int a = getInput(scanner);
            System.out.print("Nhập cạnh b: ");
            int b = getInput(scanner);
            System.out.print("Nhập cạnh c: ");
            int c = getInput(scanner);

            checkTriangle(a, b, c);
            System.out.println("Đây là một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static int getInput(Scanner scanner){
        int edge = 0;
        while(true){
            try{
                edge = Integer.parseInt(scanner.nextLine());
                if(edge <= 0){
                    System.out.println("Sai yêu cầu. Cạnh của tam giác phải là số nguyên dương ( > 0)");
                }
            }catch(NumberFormatException e){
                System.out.println("Sai yêu cầu. Nhập lại một số nguyên hợp lệ");
            }
        }
    }
}
