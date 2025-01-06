import java.awt.*;
class Area{
    public void shape(){
        System.out.println("The area of shape can be determined by multiplying its sides");
    }
}
class Rectangle extends Area{
    public void shape(){
        System.out.println("The area of rectangle is length * breadth");
    }
}

public class Exercise16 {
    public static void main(String[] args) {
        Area area=new Area();
        Rectangle rectangle=new Rectangle();
        area.shape();
        rectangle.shape();
    }
}
