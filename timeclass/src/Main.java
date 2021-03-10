public class Main {
    public static void main(String[] args) {
        Time time = new Time(23, 58, 59);
        System.out.println(time.toString());
        time.nextSecond();
        System.out.println(time.toString());


    }
}
