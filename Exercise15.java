
 class Vehicle{
    public void drive(){
        System.out.println("Repairing the vehicle");
    }
 }
 class Car extends Vehicle{
     @Override
     public void drive() {
         super.drive();
         System.out.println("Repairing car");
     }
 }





public class Exercise15 {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Car car=new Car();
        vehicle.drive();
        car.drive();
    }
}
