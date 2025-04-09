class Bike {
    String brand;
    int year;
    double mileage;
}

class BikeDemo {
    public static void main(String str[]) {
        Bike b1 = new Bike();
        b1.brand = "Suzuki"; // Corrected spelling of "Suzuki" and fixed dot notation
        b1.year = 2024;
        b1.mileage = 40.5;
        
        System.out.println("Brand: " + b1.brand);
        System.out.println("Year: " + b1.year); // Added to print year
        System.out.println("Mileage: " + b1.mileage); // Added to print mileage
    }
}