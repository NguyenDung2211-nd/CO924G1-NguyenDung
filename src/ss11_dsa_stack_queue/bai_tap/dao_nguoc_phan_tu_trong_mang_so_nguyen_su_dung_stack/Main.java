package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;


import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> soNguyen = new Stack<>();

        System.out.println("Stack ban đầu : "+ soNguyen);

        int number = -1;
        while(number <= 0){
            System.out.println("Nhập số lượng phần tử : ");
            try{
                number = Integer.parseInt(scanner.nextLine());
                if(number <= 0){
                    System.out.println("Sai yêu cầu. số lượng phần tử phải là một số nguyên dương(> 0).");
                }
            }catch(NumberFormatException e ){
                System.out.println("Sai yêu cầu. Vui lòng nhập một số nguyên hợp lệ.");
            }
        }

        for(int i = 0; i < number; i++){
            System.out.println("Nhập phần tử thứ "+ (i + 1)+ " : ");
            int value = scanner.nextInt();
            soNguyen.push(value);
        }
        System.out.println("Stack hiện tại (sau khi push) : " + soNguyen);

        System.out.print("Stack đảo ngược : ");
        daoNguoc(soNguyen);
    }

    private static void daoNguoc(Stack<Integer> soNguyen) {
        for(int i = soNguyen.size() - 1; i >= 0; i--){

           System.out.print(soNguyen.get(i) +", ");
        }
    }
}
