package mvc2.view;
import java.util.Scanner;
public class CounterView {
    public void displayCounter(int value){
        System.out.println("Giá trị hiện tại : " + value);
    }

    public int getChoise(){
        System.out.println("Chọn hành động : ");
        System.out.println("1. Tăng");
        System.out.println("2. Giảm");
        System.out.println("3. Reset");
        System.out.println("4. Thoát ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
