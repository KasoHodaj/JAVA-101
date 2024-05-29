package Week8;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of vehicles
        System.out.print("How many vehicles passed today? \nInput: ");
        int N = sc.nextInt();
        sc.nextLine();  // Consume the newline character


        Vehicle[] vehicles = new Vehicle[N];

        // Generate random vehicles
        for(int i = 0; i < vehicles.length; i++){
            double random = Math.random();
            if(random <= 0.70){ // 70% chance to create a Car
                vehicles[i] = new Car();
            } else if(random <= 0.85){ // 15% chance to create a Truck
                vehicles[i] = new Truck();
            } else { // 15% chance to create a Motorcycle
                vehicles[i] = new Motorcycle();
            }
        }


        for (int i = 0; i < N; i++) {
            Vehicle v = vehicles[i];
            if (v instanceof Car) {
                System.out.println("Vehicle is a Car, insert Data (full name, plate number, year, and number of doors):");
                System.out.print("Full name: ");
                v.setFullName(sc.nextLine());
                System.out.print("Plate number: ");
                v.setPlateNumber(sc.nextLine());
                System.out.print("Year: ");
                v.setYear(sc.nextInt());
                System.out.print("Number of doors: ");
                ((Car) v).setNumDoors(sc.nextInt());
                sc.nextLine();  // Consume the newline
            } else if (v instanceof Truck) {
                System.out.println("Vehicle is a Truck, insert Data (full name, plate number, year, and number of axis):");
                System.out.print("Full name: ");
                v.setFullName(sc.nextLine());
                System.out.print("Plate number: ");
                v.setPlateNumber(sc.nextLine());
                System.out.print("Year: ");
                v.setYear(sc.nextInt());
                System.out.print("Number of axles: ");
                ((Truck) v).setNumAxis(sc.nextInt());
                sc.nextLine();  // Consume the newline
            } else if (v instanceof Motorcycle) {
                System.out.println("Vehicle is a Motorcycle, insert Data (full name, plate number, year, and if motorcycle has a sidecar [true/false]):");
                System.out.print("Full name: ");
                v.setFullName(sc.nextLine());
                System.out.print("Plate number: ");
                v.setPlateNumber(sc.nextLine());
                System.out.print("Year: ");
                v.setYear(sc.nextInt());
                System.out.print("Has sidecar (true/false): ");
                ((Motorcycle) v).setSidecar(sc.nextBoolean());
                sc.nextLine();  // Consume the newline
            }
        }


        for (Vehicle v : vehicles) {
            System.out.println(v);
            v.drive();
            System.out.println();
        }


    }
}
