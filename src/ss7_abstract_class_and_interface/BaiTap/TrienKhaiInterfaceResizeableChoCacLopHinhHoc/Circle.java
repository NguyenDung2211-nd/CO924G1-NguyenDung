package ss7_abstract_class_and_interface.BaiTap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public void resize(double percent){
        radius += radius * percent / 100;
    }
}
