package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cài đặt thuật toán sắp xếp chèn.");
        Scanner scanner = new Scanner(System.in);

        int number = -1;
        while(number <= 0){
            System.out.println("Nhập số lượng phần tử của mảng : ");
            try{
                number = Integer.parseInt(scanner.nextLine());
                if(number <= 0){
                    System.out.println("Sai yêu cầu, số lượng phần tử phải là một số nguyên dương (> 0). nhập lại : ");
                }
            }catch(NumberFormatException e){
                System.out.println("Sai yêu cầu. Nhập lại một số nguyên dương hợp lệ.");
            }
        }

        int[] array = new int[number];

        System.out.println("Nhập phần tử vào mảng");
        for(int i = 0; i < number; i++){
            while(true){
                System.out.print("Nhập phần tử thứ "+ (i + 1)+ " : ");
                try{
                    array[i] = Integer.parseInt(scanner.nextLine());
                    break;
                }catch(NumberFormatException e){
                    System.out.println("Sai yêu cầu. Nhập lại một số nguyên hợp lệ.");
                }
            }
        }

        System.out.println("Mảng vừa nhập là : ");
        for(int i = 0; i < number; i++){
            System.out.print(array[i] + " ");
        }

        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);

        System.out.println();
        System.out.println("Mảng sau khi sắp xếp : ");
        for(int i = 0; i < number; i++){
            System.out.print(array[i] + " ");
        }
    }
}
