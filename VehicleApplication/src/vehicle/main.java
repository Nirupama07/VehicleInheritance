package vehicle;

public class main {
    public static void main(String[] args) {
        car Mycar = new car("Gasoline", 180, "civic", "blue");
        bike Mybike = new bike("Electric", 50, "Clip-on");
        
        System.out.println("Car details:");
        System.out.println("Engine type: " + Mycar.getType());
        System.out.println("Horsepower: " + Mycar.getHorsepower());
        System.out.println("Model: " + Mycar.getModel());
        System.out.println("Colour: " + Mycar.getColour());
        
        System.out.println("\nBike details:");
        System.out.println("Engine type: " + Mybike.getType()); // Accessing engine type
        System.out.println("Horsepower: " + Mybike.getHorsepower());
        System.out.println("Handle type: " + Mybike.getHandleType());
    }
}
