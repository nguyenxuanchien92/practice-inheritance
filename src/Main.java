import models.Circle;
import models.Cylinder;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(1,"red");
        Cylinder cylinder = new Cylinder(1.2,"yellow",20);

        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}
