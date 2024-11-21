package ss13_thuat_toan_tim_kiem.bai_tap.cai_dat_thuat_toan_tim_kiem_nhi_phan_su_dung_de_quy;

import java.util.Arrays;
import java.util.Scanner;

import static ss13_thuat_toan_tim_kiem.bai_tap.cai_dat_thuat_toan_tim_kiem_nhi_phan_su_dung_de_quy.BinarySearch.binarySearch;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = -1;
        while(n <= 0){
            System.out.println("Nhập số lượng phần tử : ");
            try{
                n = Integer.parseInt(scanner.nextLine());
                if(n <= 0){
                    System.out.println("Sai yêu cầu. số lượng phần tử phải là một số nguyên dương(> 0).");
                }
            }catch(NumberFormatException e ){
                System.out.println("Sai yêu cầu. Vui lòng nhập một số nguyên dương hợp lệ.");
            }
        }

        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    array[i] = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Sai yêu cầu. Vui lòng nhập một số nguyên!");
                    scanner.nextLine();
                }
            }
        }

        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));


        int value;
        while(true){
            System.out.print("Nhập giá trị cần tìm: ");
            try{
                value = Integer.parseInt(scanner.nextLine());
                break;
            }catch(NumberFormatException e ){
                System.out.println("Sai yêu cầu. Vui lòng nhập một số nguyên hợp lệ.");
            }
        }

        int result = BinarySearch.binarySearch(array, 0, array.length - 1, value);

        if (result != -1) {
            System.out.println("Giá trị " + value + " được tìm thấy tại chỉ số: " + result);
        } else {
            System.out.println("Giá trị " + value + " không tồn tại trong mảng.");
        }

        scanner.close();
    }
}

