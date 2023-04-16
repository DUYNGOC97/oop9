package inheritance1;

public class Cylinder extends Circle {
    private int height;
    public Cylinder(){

    }
    public Cylinder(double radius,String color,int height){
        super(radius,color);
        this.height=height;
    }
    public Cylinder(int height){
        this.height=height;
    }
    public double volume(){
        return this.height*Math.pow(this.radius,2)*Math.PI;
    }
    public String toString(){
        return "radius: "+super.getRadius()+", volume: "+volume();
    }
}
