public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        //your code here
        char[] vowels = { 'a', 'e', 'i', 'o', 'u'};
        for (int x = 0; x < s.length(); x++) {
            for (int y = 0; y < vowels.length; y++) {
                if (s.charAt(x) == vowels[y]) {
                    answer++;
                }
            }
        }

        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        String name = "bob";
        int sizeName = name.length();
        for (int x = 0; x < s.length() - 2; x++) {
            if (name.charAt(0) == s.charAt(x) && name.charAt(1) == s.charAt(x+1) && name.charAt(2) == s.charAt(x+2)) {
                answer++;
            }
        }

        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //your code here
        String answer;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] sArray = s.toCharArray();
        char[] alphabetArray = alphabet.toCharArray();




        for (int x = 0; x < s.length(); x++) {
            String tmp;
            if (alphabet.charAt(alphabet.indexOf(s.charAt(x) + 1)) == s.charAt(x + 1)) {

            }
        }


        return s;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
