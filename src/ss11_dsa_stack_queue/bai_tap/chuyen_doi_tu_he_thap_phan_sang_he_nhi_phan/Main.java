package ss11_dsa_stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int decimalNumber = 30;
        System.out.println("Số nhị phân của " + decimalNumber + " là: " + convertToBinary(decimalNumber));
    }

    public static String convertToBinary(int decimalNumber) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder binaryResult = new StringBuilder();

        while (decimalNumber > 0) {
            stack.push(decimalNumber % 2);
            decimalNumber = decimalNumber / 2;
        }

        while (!stack.isEmpty()) {
            binaryResult.append(stack.pop());
        }

        return binaryResult.toString();
    }
}
