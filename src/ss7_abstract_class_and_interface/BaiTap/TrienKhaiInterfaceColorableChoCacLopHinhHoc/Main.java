package ss7_abstract_class_and_interface.BaiTap.TrienKhaiInterfaceColorableChoCacLopHinhHoc;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(10);

        Random random = new Random();

        for(Shape shape : shapes){
            double randomPercent = 1 + random.nextInt(100);

            System.out.println("Diện tích trước khi thay đổi : "+ shape.getArea());

            if(shape instanceof Resizeable){
                Resizeable resizeableShape = (Resizeable) shape;
                resizeableShape.resize(randomPercent);
            }

            System.out.println("Diện tích sau khi thay đổi : " + shape.getArea());
            System.out.println("Tỉ lệ tăng kích thước : " + randomPercent );
            System.out.println();
        }
    }
}
