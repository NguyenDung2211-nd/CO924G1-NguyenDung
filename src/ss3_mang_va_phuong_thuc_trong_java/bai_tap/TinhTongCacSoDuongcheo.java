package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class TinhTongCacSoDuongcheo {
    public static void main(String[] args) {

        System.out.println("Tính tổng các số đường chéo chính của ma trận hình vuông");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập kích thước ma trận hình vuông (n x n) : ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        System.out.println("Nhập phần tử vào ma trận :");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Phần tử ["+ i +"]["+ j +"] : ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận hiện tại : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                sum += array[i][j];
            }
        }
        System.out.println("Tổng các phần tử của ma trận = "+ sum);

        int sumDiagonal = 0;
        System.out.print("Các phần tử trên đường chéo chính : ");
        for(int i =0; i < n; i++){
            System.out.print(array[i][i] + " ");
                sumDiagonal += array[i][i];
        }
        System.out.println();
        System.out.println("Tổng đường chéo chính = "+ sumDiagonal);
    }
}
