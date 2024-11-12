package ss5_accessmodifier_staticmethod_staticproperty.BaiTap.XayDungLopChiGhiTrongJava;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString(){
        return "Student (name = " + name + ", classes = " + classes + ")";
    }

}
