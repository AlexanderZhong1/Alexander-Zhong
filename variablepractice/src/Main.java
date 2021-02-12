public class Main {
    public static void main(String[] args) {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;


        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;


        System.out.println( "There are " + cars + " cars available." );
        System.out.println( "There are only " + drivers + " drivers available." );
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
        System.out.println("\n\n");


        int roomNumber = 113;
        double e = 2.71828;
        String subject = "Computer Science";
        System.out.println("This is room # " + roomNumber);
        System.out.println("e is close to " + e);
        System.out.println("I'm learning a bit about " + subject);

        System.out.println("\n");

        String[] scheduleSubjects = {
                "English III",
                "Precalculus",
                "Music Theory",
                "Biotechnology",
                "Principles of Technology I",
                "Latin II",
                "AP US History",
                "Business Computer Information Systems"
                };
        String[] teachers = {
                "Ms. Lapan",
                "Mrs. Gideon",
                "Mr. Davis",
                "Ms. Palmer",
                "Ms. Garcia",
                "Mrs. Barnett",
                "Ms. Johannessen",
                "Mr. James"
        };

        System.out.print("+");
        for (int x = 0; x <= 60; x++) {
          System.out.print("-");
        };
        System.out.println("+");


         // 13 and 9
        System.out.print("| " + "1" + " |" + "                          " + scheduleSubjects[0]);
        System.out.println(" |" + "        " + teachers[0] + " |");

        System.out.print("| " + "2" + " |" + "                          " + scheduleSubjects[1]);
        System.out.println(" |" + "      " + teachers[1] + " |");

        System.out.print("| " + "3" + " |" + "                         " + scheduleSubjects[2]);
        System.out.println(" |" + "        " + teachers[2] + " |");

        System.out.print("| " + "4" + " |" + "                        " + scheduleSubjects[3]);
        System.out.println(" |" + "       " + teachers[3] + " |");

        // 25
        System.out.print("| " + "5" + " |" + "           " + scheduleSubjects[4]);
        System.out.println(" |" + "       " + teachers[4] + " |");


        System.out.print("| " + "6" + " |" + "                             " + scheduleSubjects[5]);
        System.out.println(" |" + "     " + teachers[5] + " |");

        System.out.print("| " + "7" + " |" + "                        " + scheduleSubjects[6]);
        System.out.println(" |" + "  " + teachers[6] + " |");

        System.out.print("| " + "8" + " |" + "" + scheduleSubjects[7]);
        System.out.println(" |" + "        " + teachers[7] + " |");

        System.out.print("+");
        for (int x = 0; x <= 60; x++) {
            System.out.print("-");
        };
        System.out.println("+");


    }
}
