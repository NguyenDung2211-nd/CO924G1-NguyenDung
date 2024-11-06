package ss1_gioi_thieu_ve_java.BaiTap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Úng dụng đọc số thành chữ");

        System.out.println("Nhập số nguyên dương bạn muốn đọc (Yêu cầu số có tối đa 3 chữ số).");
        int number = scanner.nextInt();

        if( number >= 0 && number <= 999 ){
            System.out.println(chuyenDoiSoThanhChu(number));
        }
        else{
            System.out.println("Sai yêu cầu.");
        }
    }


    public static String chuyenDoiSoThanhChu(int number){
        if (number == 0) {
            return "zero";
        }
        String chu = " ";

            if(number >= 100){
                chu += hangDonVi(number / 100) + " hundred";
                number %= 100;
                if(number > 0){
                    chu += " and ";
                }
            }
            if(number >= 10 && number <+ 19){
                chu += hangTeen(number);
            }else{
                if(number >= 20){
                    chu += hangChuc(number / 10);
                    number %= 10;
                    if(number > 0){
                        chu += " ";
                    }
                }
            }
            if(number < 10 && number > 0){
                chu += hangDonVi(number);
            }
            return chu;
    }

    public static String hangDonVi(int donVi){
        switch(donVi){
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    public static String hangTeen(int teen){
        switch(teen){
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    public static String hangChuc(int chuc){
        switch(chuc){
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
}
