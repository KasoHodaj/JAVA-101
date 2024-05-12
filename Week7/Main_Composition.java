package Week7;

import java.util.Scanner;

public class Main_Composition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Vehicle car1 = new Vehicle("Kaso Hodaj","NKH9655",2012);
        Vehicle car2 = new Vehicle("Spiros Tsop", "ABC6969", 2004);
        Vehicle car3 = new Vehicle("Io Tranaka", "ETB2023", 2023);


        car1.sysdief.vazeiEmpros();
        car1.engine.leitourgia();
        car1.engine.kinisi();
        car1.sysdief.striveiAristera();
        car1.sysdief.striveiDexia();
        car1.sysdief.svynei();
        car1.engine.svysimo();


        car1.engine.setCubic_capacity(5000);
        car1.engine.setHorsepower(300);

        for(int i=1; i<=3; i++){
            System.out.println("\nCar " + i);
            System.out.println("Give cc and hp: ");
            switch (i){
                case 1:
                    car1.engine.setCubic_capacity(sc.nextInt());
                    car1.engine.setHorsepower(sc.nextInt());
                    break;
                case 2:
                    car2.engine.setCubic_capacity(sc.nextInt());
                    car2.engine.setHorsepower(sc.nextInt());
                    break;
                case 3:
                    car3.engine.setCubic_capacity(sc.nextInt());
                    car3.engine.setHorsepower(sc.nextInt());
                    break;
                default:
                    System.out.println("End");
                    break;
            }
        }

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        /*
        ------------------------------------
         */
        Vehicle[] cars = {
                new Vehicle("Kaso Hodaj","NKH9655",2012,1200,100),
                new Vehicle("Giannis Antetokounmpo", "GA1122", 2015, 1500, 110),
                new Vehicle("Eleni Markou", "EM2233", 2016, 1400, 105),
                new Vehicle("Nikolaos Dimitriou", "ND3344", 2018, 1600, 120),
                new Vehicle("Maria Georgiou", "MG4455", 2020, 1300, 115),
                new Vehicle("Dimitris Papadopoulos", "DP5566", 2021, 1800, 130)
        };

        boolean end = false; // flag to control the loop based on user choice
        int option,pos; // variables to store user's menu choice and array index

        System.out.println("SELECT AN OPTION FROM THE LIST.");
        System.out.println("1. The cylinder capacity of the car.");
        System.out.println("2. The horsepower of the car.");
        System.out.println("3. The owner of the car, and the year of manufacture.");
        System.out.println("4. Exit.");

        do{ // Main loop
            System.out.println();
            System.out.print("Input:  ");
            option = sc.nextInt(); // read user's menu option input
         switch (option){

             case 1: // Get car index from user and display engine cubic capacity
                 System.out.print("Give the position of the car: ");
                 pos = sc.nextInt();
                 System.out.println("Cubic Capacity: " + cars[pos].engine.getCubic_capacity());
                 break;
             case 2: // Get car index from user and display engine horsepower
                 System.out.print("Give the position of the car: ");
                 pos = sc.nextInt();
                 System.out.println("Horsepower: " + cars[pos].engine.getHorsepower());
                 break;
             case 3: // Get car index from user and display vehicle owner and year of manufacture
                 System.out.print("Give the position of the car: ");
                 pos = sc.nextInt();
                 System.out.println("Owner: " + cars[pos].getFullName() + ", Year of manufacture: " + cars[pos].getYear());
                 break;
             case 4:  // Option to exit the loop and end the program
                 end = true;
                 System.out.println("Power Off...");
                 break;
             default: // Handle invalid option entries
                 System.out.println("Wrong Option, please try again!");
                 break;
         }
        }while(end != true); // Continue until the user chooses to exit


        /**
            car2.sysdief.vazeiEmpros();
            car2.engine.leitourgia();
            car2.engine.kinisi();
            car2.sysdief.striveiAristera();
            car2.sysdief.striveiDexia();
            car2.sysdief.svynei();
            car2.engine.svysimo();

            car3.sysdief.vazeiEmpros();
            car3.engine.leitourgia();
            car3.engine.kinisi();
            car3.sysdief.striveiAristera();
            car3.sysdief.striveiDexia();
            car3.sysdief.svynei();
            car3.engine.svysimo();

            Vehicle car4 = new Vehicle();
            Vehicle car5 = new Vehicle();

            System.out.println("\n Car 4");
            System.out.print("Full Name: ");
            car4.setFullName(sc.nextLine());
            System.out.print("Licence Plate: ");
            car4.setPlateNumber(sc.nextLine());
            System.out.print("Year: ");
            car4.setYear(sc.nextInt());

            System.out.println("\n Car 5");
            System.out.print("Full Name: ");
            car5.setFullName(sc.nextLine());
            System.out.print("Licence Plate: ");
            car5.setPlateNumber(sc.nextLine());
            System.out.print("Year: ");
            car5.setYear(sc.nextInt());
        **/




    }
}
