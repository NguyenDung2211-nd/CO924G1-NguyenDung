package ss2_vong_lap_trong_java.BaiTap;

public class HienThiCacLoaiHinh {
    public static void main(String [] args){

        // Hình chữ nhật.
        for(int i = 1; i <= 4; i++){
            System.out.println();
            for(int j = 1; j <= 15; j++){
                System.out.print("*");
            }
        }
        System.out.println();

        // Tam giác vuông (4 hình 4 góc).
        for(int b = 1; b < 6; b++){
            System.out.println();
            for(int c = 1; c <= b; c++){
                System.out.print("*");
            }
        }
        System.out.println();


        for(int a = 1; a < 6; a++){
            System.out.println();
            for(int d = 6; d > a; d--){
                System.out.print("*");
            }
        }
        System.out.println();


        for(int e = 1; e < 6; e++){
            System.out.println();
            for(int f = 6; f >= e; f--){
                System.out.print(" ");
            }
            for(int g = 1; g <= e; g++){
                System.out.print("*");
            }
        }
        System.out.println();


        for(int h = 1; h < 6; h++){
            System.out.println();
            for(int l = 1; l < h; l++){
                System.out.print(" ");
            }
            for(int r = 6; r > h; r--){
                System.out.print("*");
            }
        }
        System.out.println();

        // Tam giác cân.
        for (int e = 1; e <= 5; e++) {
            System.out.println();
            for (int f = 5; f > e; f--) {
                System.out.print(" ");
            }
            for (int g = 1; g <= (2 * e - 1); g++) {
                System.out.print("*");
            }
        }
    }
}


