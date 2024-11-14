package ss7_abstract_class_and_interface.BaiTap.TrienKhaiInterfaceColorableChoCacLopHinhHoc;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(5);
        shapes[1] = new Circle(3);

        for (Shape shape : shapes) {
            System.out.println("Diện tích: " + shape.getArea());

                if (shape instanceof Colorable) {
                    Colorable colorableShape = (Colorable) shape;
                    colorableShape.howToColor();
                }
        }
    }
}
