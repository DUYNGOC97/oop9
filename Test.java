package inheritance1;

public class Test {
    public static void main(String[] args){
        Circle circle = new Circle(3.2,"green");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(2.5,"red",32);
        System.out.println(cylinder);
    }
}
