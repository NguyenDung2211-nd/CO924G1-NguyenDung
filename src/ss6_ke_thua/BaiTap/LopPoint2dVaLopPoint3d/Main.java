package ss6_ke_thua.BaiTap.LopPoint2dVaLopPoint3d;

public class Main {
    public static void main(String[] args){
        Point2D point2d = new Point2D(1.0f, 2.0f);
        System.out.println("Point2D : " + point2d);

        point2d.setXY(3.0f, 4.0f);
        System.out.println("Updated Point2D : " + point2d);

        Point3D point3d = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D : " + point3d);

        point3d.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Updated Point3D : " + point3d);
    }
}
