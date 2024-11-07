package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {

        System.out.println("Tìm giá trị nhỏ nhất trong mảng");
        Scanner scanner = new Scanner(System.in);

        int number = -1;
        while(number <= 0){
            System.out.println("Nhập số lượng phần tử của mảng : ");
            try{
                number = Integer.parseInt(scanner.nextLine());
                if(number <= 0){
                    System.out.println("Sai yêu cầu. Số lượng phần tử phải là một số nguyên dương(> 0)");
                }
            }catch(NumberFormatException e){
                System.out.println("Vui lòng nhập 1 số nguyên hợp lệ");
            }
        }

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Mảng hiện tại : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();

        int min = timMin(array);
        System.out.println("Giá trị lớn nhất trong mảng : "+min);
    }

    public static int timMin(int[] array) {
        int minValue = array[0];
        for (int k = 1; k < array.length; k++) {
            if (array[k] < minValue) {
                minValue = array[k];
            }
        }
        return minValue;
    }

}
