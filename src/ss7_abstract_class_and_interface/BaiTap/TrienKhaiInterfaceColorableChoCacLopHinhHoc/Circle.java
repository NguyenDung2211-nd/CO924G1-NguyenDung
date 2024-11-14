package ss7_abstract_class_and_interface.BaiTap.TrienKhaiInterfaceColorableChoCacLopHinhHoc;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
