package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {

        System.out.println("Tìm phần tử lớn nhất trong mảng hai chiều");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số hàng của mảng : ");
        int rows = scanner.nextInt();

        System.out.println("Nhập số cột của mảng : ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Nhập các phần tử cho mảng .");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print("Phần tử tại ["+i+"]["+j+"] : ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mảng hiện tại : ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        int max = array[0][0];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng : "+ max);
    }
}
