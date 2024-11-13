package ss7_abstract_class_and_interface.BaiTap.TrienKhaiInterfaceColorableChoCacLopHinhHoc;

public class Square extends Shape implements Resizeable {
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea(){
        return side * side;
    }

    public void resize(double percent){
        side += side * percent / 100;
    }
}
