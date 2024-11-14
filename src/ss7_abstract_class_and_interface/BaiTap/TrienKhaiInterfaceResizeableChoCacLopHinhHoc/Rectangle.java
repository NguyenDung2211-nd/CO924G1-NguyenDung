package ss7_abstract_class_and_interface.BaiTap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    public void resize(double percent){
        width += width * percent / 100;
        height += height * percent / 100;
    }
}
