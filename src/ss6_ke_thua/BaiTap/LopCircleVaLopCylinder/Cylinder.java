package ss6_ke_thua.BaiTap.LopCircleVaLopCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
    }

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getVolum(){
        return getArea() * height;
    }

    @Override
    public String toString(){
        return "Cylinder ( radius = " + getRadius() + ", color = " + getColor() +", height = " + height + ", volum = " + getVolum() + " )";
    }
}
