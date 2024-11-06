package ss2_vong_lap_trong_java.BaiTap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args){

        System.out.println("Các số nguyên tố nhỏ hơn 100");
        int number = 2;
        boolean isPrime;


        while(number < 100){
            isPrime = true;
            for(int i = 2; i <= Math.sqrt(number); i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number);
            }
            number++;
        }
    }
}
