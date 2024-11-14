package ss7_abstract_class_and_interface.BaiTap.TrienKhaiInterfaceColorableChoCacLopHinhHoc;

public class Square extends Shape implements Colorable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
