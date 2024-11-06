package ss2_vong_lap_trong_java.BaiTap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {

        int count = 1;
        int number = 2;
        System.out.println("20 số nguyên tố đầu tiên :");

        while (count <= 20) {
            if (isPrime(number)) {
                System.out.println("Số nguyên tố thứ " + count + ":     " + number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
