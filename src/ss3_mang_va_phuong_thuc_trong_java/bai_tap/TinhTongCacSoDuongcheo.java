package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class TinhTongCacSoDuongcheo {
    public static void main(String[] args) {

        System.out.println("Tính tổng các số đường chéo chính của ma trận hình vuông");
        Scanner scanner = new Scanner(System.in);

        int n = -1;
        while(n <= 0){
            System.out.println("Nhập kích thức ma trận hình vuông(n x n) : ");
            try{
                n = Integer.parseInt(scanner.nextLine());
                if(n <= 0) {
                    System.out.println("Sai yêu cầu. Nhập lại kích thước của ma trận(n > 0). ");
                }
            }catch( NumberFormatException e){
                System.out.println("Vui lòng nhập một số nguyên dương hợp lệ.");
            }
        }

        int[][] array = new int[n][n];

        System.out.println("Nhập phần tử vào ma trận :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "] : ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận hiện tại : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Tổng các phần tử của ma trận = " + sum);

        int total = tongDuongCheo(array);
        System.out.println("Tổng đường chéo chính = "+ total);

    }
    public static int tongDuongCheo(int[][] array) {

        int sumDiagonal = 0;
        System.out.print("Các phần tử trên đường chéo chính : ");
        for(int i =0; i < array.length; i++){
            System.out.print(array[i][i] + " ");
                sumDiagonal += array[i][i];
        }
        System.out.println();
        return sumDiagonal;
    }
}
