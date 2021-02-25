import java.util.SortedMap;

public class Main {

// adds a number to the array
    public static int[] addNumberToArray(int[] inputArray, int value) {
        int[] newArray = new int[inputArray.length + 1];
        for (int x = 0; x < inputArray.length; x++) {
            newArray[x] = inputArray[x];
        }
        newArray[inputArray.length] = value;

        return newArray;
    }

    public static int[] deleteNumberInArray(int[] inputArray) {
        int[] newArray = new int[inputArray.length - 1];
        for (int x = 0; x < newArray.length; x++) {
            newArray[x] = inputArray[x];
        }

        return newArray;
    }

    public static int[] addNumberToIndex(int[] inputArray, int value, int index) {
        int[] newArray = new int[inputArray.length + 1];

        for (int x = 0; x < newArray.length; x++) {
            if (x < index) {
                newArray[x] = inputArray[x];
            }
            else if (x == index) {
                newArray[x] = value;
            }
            else {
                newArray[x] = inputArray[x - 1];
            }
        }


        return newArray;
    }






// prints out the array in better format
    public static void printArray(int[] inputArray) {
        System.out.print("[");
        for (int x = 0; x < inputArray.length; x++) {
            if (x != inputArray.length - 1 && x != 0) {
                System.out.print(" " + inputArray[x] + ",");
            }
            else if (x == 0){
                System.out.print(inputArray[x] + ",");
            }
            else {
                System.out.print(" " + inputArray[x]);
            }
        }
        System.out.print("]\n");

    }





    public static void main(String[] args) {

        // method 1 testing
        System.out.println("\nMethod 2 Testing");

        // intialize array
        int[] testing1 = {1, 2, 3};
        System.out.println("Original Array");
        // prints old array
        printArray(testing1);

        // use the method on array addNumberToArray(array, value)
        testing1 = addNumberToArray(testing1, 2);
        System.out.println("New Array");
        printArray(testing1);

        // method 2 testing


        System.out.println("\nMethod 2 Testing");

        // initializes the array and prints it out
        int[] testing2 = {1, 2, 3};
        System.out.println("Original Array");
        printArray(testing2);

        // using the method to change the array  deleteNumberInArray(array)
        testing2 = deleteNumberInArray(testing2);
        System.out.println("New Array");
        printArray(testing2);


        // method 3

        System.out.println("\nMethod 3 Testing");

        // initializes the array and prints it out
        int[] testing3 = {1, 2, 3, 4};
        System.out.println("Original Array");
        printArray(testing3);

        // using the method to change the array  addNumberToIndex()
        testing3 = addNumberToIndex(testing3,10, 1);
        System.out.println("New Array");
        printArray(testing3);



    }
}





