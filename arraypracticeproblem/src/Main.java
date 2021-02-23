public class Main {
    public static void main(String[] args) {

        // first problem

        int[] numbers1 = new int[20];

        // generate random numbers for the array

        for (int x = 0; x < numbers1.length; x++) {
            int randomNum = (int)(Math.random() * 6) + 1;
            numbers1[x] = randomNum;
        }
        // checks how many 1 were generated
        int numberOf1 =  0;

        for (int x = 0; x < numbers1.length; x++) {
            if (numbers1[x] == 1) {
                numberOf1++;
            }
        }


        //prints out the problem

        System.out.println("Problem 1");
        for (int x = 0; x < numbers1.length; x++) {
            System.out.println("Index: " + x + "\tValue: " + numbers1[x]);
        }

        System.out.println("Number of 1 in this array: " + numberOf1);

        // second problem

        // initialize the second array

        int[] problem2 = new int[10];

        // generates the second random array

        for (int x = 0; x < problem2.length; x++) {
            int randomNum = (int)(Math.random() * 100) + 1;
            problem2[x] = randomNum;
        }

        // finds the average

        int problem2average;
        int problem2total = 0;
        for (int x = 0; x < problem2.length; x++) {
            problem2total += problem2[x];
        }

        problem2average = (int)(problem2total / 10);

        // prints out the problem

        System.out.println("\nProblem 2");
        for (int x = 0; x < problem2.length; x++) {
            System.out.println("Index: " + x + "\tValue: " + problem2[x]);
        }

        System.out.println("Average in this array: " + problem2average);


        // problem 3

        // randomize the two index position to swap

        int randomindex1 = (int)(Math.random() * 10);
        int randomindex2 = (int)(Math.random() * 10);

        while (randomindex1 == randomindex2) {
            randomindex2 = (int)(Math.random() * 10);
            if (randomindex1 != randomindex2) {
                break;
            }
        }


        System.out.println("\n\nProblem 3");
        System.out.println("These two were swapped");
        System.out.println("Index: " + randomindex1 + "\tValue: " + problem2[randomindex1]);
        System.out.println("Index: " + randomindex2 + "\tValue: " + problem2[randomindex2] + "\nto");


        // switches the numbers using temp variable

        int problem2temp = problem2[randomindex1];

        problem2[randomindex1] = problem2[randomindex2];
        problem2[randomindex2] = problem2temp;

        System.out.println("Index: " + randomindex1 + "\tValue: " + problem2[randomindex1]);
        System.out.println("Index: " + randomindex2 + "\tValue: " + problem2[randomindex2]);

        // problem 4


        // using temp variable to swap two numbers at a time until they reach the midpoint

        for (int x = 0; x < problem2.length / 2; x++) {
            int temp = problem2[x];
            problem2[x] = problem2[problem2.length - x - 1];
            problem2[problem2.length - x - 1] = temp;
        }


        System.out.println("\n\n problem 4 (reversed the problem 2 array)");
        for (int x = 0; x < problem2.length; x++) {
            System.out.println("Index: " + x + "\tValue: " + problem2[x]);
        }

    }
}
