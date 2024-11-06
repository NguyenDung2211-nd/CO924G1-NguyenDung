package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xóa phần tử trong mảng");

        int[] arr = {1,2,3,4,5};
        System.out.print("Mảng ban đầu: ");
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        System.out.println("Nhập phần tử muốn xóa :");
        int x = scanner.nextInt();

        int indexDelete = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                indexDelete = i;
                System.out.println("Phần tử " + x + " xuất hiện tại vị trí: " + indexDelete);
                break;
            }
        }
        if(indexDelete == -1){
            System.out.println("Phần tử "+ x +" không có trong mảng");
        }else{
            for (int i = indexDelete; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            System.out.print("Mảng sau khi xoá phần tử " + x + ": ");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
