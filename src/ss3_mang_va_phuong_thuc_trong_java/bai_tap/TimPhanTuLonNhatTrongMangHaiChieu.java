package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {

        System.out.println("Tìm phần tử lớn nhất trong mảng hai chiều");
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

        System.out.println("Nhập các phần tử cho mảng .");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử tại [" + i + "][" + j + "] : ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng hiện tại : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max = maxValue(array);
        System.out.println("Phần tử lớn nhất trong mảng : " + max);
    }

        public static int maxValue(int[][] array){
            int max = array[0][0];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }
            return max;
        }
}
