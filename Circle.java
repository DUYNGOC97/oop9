package inheritance1;

public class Circle {
    protected double radius;
    protected String color;
    public Circle(){

    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getPerimeter(){
        return (this.radius*2)*Math.PI;
    }
    public String toString(){
        return "radius= "+getRadius()+" color: "+getColor()+" Perimeter: "+getPerimeter();
    }
}
