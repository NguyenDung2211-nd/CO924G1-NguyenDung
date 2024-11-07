package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {

        System.out.println("Tính tổng các số ở một cột xác định");
        Scanner scanner = new Scanner(System.in);

        int rows = -1;
        while(rows <= 0){
            System.out.println("Nhập số hàng của mảng : ");
            try{
                rows = Integer.parseInt(scanner.nextLine());
                if(rows <= 0){
                    System.out.println("Sai yêu cầu. Số hàng của mảng phải là một số nguyên dương(> 0)");
                }
            }catch(NumberFormatException e){
                System.out.println("Vui lòng nhập 1 số nguyên dương hợp lệ");
            }
        }

        int cols = -1;
        while(cols <= 0){
            System.out.println("Nhập số cột của mảng : ");
            try{
                cols = Integer.parseInt(scanner.nextLine());
                if(cols <= 0){
                    System.out.println("Sai yêu cầu. Số cột của mảng phải là một số nguyên dương(> 0)");
                }
            }catch(NumberFormatException e){
                System.out.println("Vui lòng nhập 1 số nguyên dương hợp lệ");
            }
        }


        int[][] array = new int[rows][cols];

        System.out.println("Nhập phần tử vào mảng : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử tại [" + i + "][" + j + "] : ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("mảng hiện tại : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Tổng gí trị của mảng = " + sum);

        System.out.println("Nhập số thứ tự của một cột cần tính tổng (bắt đầu từ 0). ");
        int colsIndex = scanner.nextInt();

        if (colsIndex < 0 || colsIndex >= cols) {
            System.out.println("Số cột không hợp lệ.");
        } else {
            int totalColsIndex = sumValue(array, rows, colsIndex);
            System.out.println("Tổng các phần tử trong cột "+ colsIndex +" là "+ totalColsIndex);
        }
    }

    public static int sumValue(int[][] array, int rows, int colsIndex){
            int sumColsIndex = 0;

            for(int i = 0; i < rows; i++) {
                sumColsIndex += array[i][colsIndex];
            }
            return sumColsIndex;
    }
}
