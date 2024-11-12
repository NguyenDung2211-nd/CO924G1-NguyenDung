package ss6_ke_thua.BaiTap.LopCircleVaLopCylinder;

public class Main {
    public static void main(String[] args){
        System.out.println("Bài tập Circle và Cylinder : ");

        Circle circle = new Circle(6.0, "white");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(5.0, "red", 4.0);
        System.out.println(cylinder);
    }
}
