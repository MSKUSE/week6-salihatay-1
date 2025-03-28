public class Circle extends  Shape {

    private Point center;
    private int radius;


    public Circle(Point location,int radius) {
        super(location);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0){
            this.radius = 0;
            System.out.println("Radius can't be negative");
        }else {
            this.radius = radius;

        }
    }
    @Override
    public double area(){
        return  Math.PI* this.radius* this.radius;
    }
    @Override
    public double perimeter(){
        return 2*Math.PI * this.radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}