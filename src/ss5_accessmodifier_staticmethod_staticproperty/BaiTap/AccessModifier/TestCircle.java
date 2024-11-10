package ss5_accessmodifier_staticmethod_staticproperty.BaiTap.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.println("Radius of circle1: " + circle1.getRadius());
        System.out.println("Area of circle1: " + circle1.getArea());

        Circle circle2 = new Circle(5.0);

        System.out.println("Radius of circle2: " + circle2.getRadius());
        System.out.println("Area of circle2: " + circle2.getArea());
    }
}