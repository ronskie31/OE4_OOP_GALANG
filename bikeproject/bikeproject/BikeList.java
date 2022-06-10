package bikeproject;

import java.util.ArrayList;
import java.util.Random;

// implementation of BikeList
public class BikeList {
    public static void main(String[] args) {
        ArrayList<Bike> bikes = new ArrayList<>();
        int mountainBikeSales = 0;
        int roadBikeSales = 0;
        fillArray(bikes);
        displayStock(bikes);
        displayBikeNumbers(bikes);
    }

    public static void fillArray(ArrayList<Bike> bikes) {
        int numOfBikes = 10;
        Random random = new Random();
        for (int i = 0; i < numOfBikes; ++i) {
            int val = random.nextInt() % 2;
            Bike bike;
            if (val == 0)
                bike = new MountainBike("Bull Horn", "Maxxis", "dropper", "Hardtail", 27, "RockShoxXC32", "Pro",
                        "19inches");
            else
                bike = new RoadBike("drop", "tread less", "razor", "racing", 19, "20mm", "22");
            bikes.add(bike);
        }
    }

    public static void displayStock(ArrayList<Bike> bikes) {
        for (Bike bike : bikes)
            System.out.println(bike);
    }

    public static int calculateStock(ArrayList<Bike> bikes) {
        int bikeSold = 0;
        for (Bike bike : bikes)
            if (bike instanceof MountainBike)
                bikeSold++;
        return bikeSold;
    }

    public static void displayBikeNumbers(ArrayList<Bike> bikes) {
        int mb = 0;
        int rb = 0;
        mb = calculateStock(bikes);
        rb = bikes.size() - mb;
        System.out.println("Stock Levels");
        System.out.println("We have " + mb + " Mountain Bikes in stock");
        System.out.println("We have " + rb + " Road Bikes in stock");
    }
}