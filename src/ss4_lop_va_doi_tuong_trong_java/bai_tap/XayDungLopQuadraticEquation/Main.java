package ss4_lop_va_doi_tuong_trong_java.bai_tap.XayDungLopQuadraticEquation;
import java.util.Scanner;
public class Main {
    public static void main(String[] srgs){
        System.out.println("Xây dựng lớp QuadraticEquation (Phương trình bậc 2)");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a : ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();
        System.out.println("Delta = " + delta);

        if (delta > 0) {
            System.out.println("The equation has two roots: " + equation.getRoot1() + " and " + equation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
