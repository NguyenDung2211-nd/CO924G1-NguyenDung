package ss6_ke_thua.BaiTap.LopCircleVaLopCylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){
        return "Circle ( radius = "+ radius + ", color = "+ color + ", area = " + getArea() +")";
    }
}
