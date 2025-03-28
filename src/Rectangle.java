import javax.management.ValueExp;

public class Rectangle extends Shape{


    private int sideA , sideB;
    public static int counter = 0;
    public int counterforobject = 0;

    public static String class_name = "Rectangle";

    public Rectangle(Point location, int SideA, int SideB) {
        super(location);
        setSideA(sideA);
        setSideB(sideB);
    }


    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA <  0){
            throw new IllegalArgumentException("Side A can't be negative! ! !");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }
    @Override
    public double perimeter(){
        return 2 * (sideA + sideB);
    }
    public double area(){
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "counterforobject=" + counterforobject +
                "location=" + this.getLocation() +
                ", sideA=" + this.sideA +
                ", sideB=" + this.sideB +
                '}';
    }
}