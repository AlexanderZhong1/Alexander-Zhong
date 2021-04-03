public class Main {
    public static void main(String[] args) {
        Time time = new Time(0, 0, 0);
        System.out.println(time.toString());
        time.previousSecond();
        System.out.println(time.toString());


    }
}
