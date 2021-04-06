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
        String answer = "";
        String tmp = "";

        for (int x = 0; x < s.length() + 1; x++) {
            int counter = 1;
            boolean isAlpha = false;
            if (x < s.length() - 1) {
                if (s.charAt(x) <= s.charAt(x + 1)) {
                    tmp += s.charAt(x);
                    tmp += s.charAt(x + counter);
                    isAlpha = true;
                }
                while (isAlpha == true) {
                    if ((x + counter < s.length() - 1)) {
                        if (s.charAt(x + counter) <= s.charAt(x + counter + 1)) {
                            tmp += s.charAt(x + counter + 1);
                            counter++;
                        }
                        else {
                            isAlpha = false;
                        }
                    }
                    else {
                        isAlpha = false;
                    }
                }

                if (tmp.length() > answer.length()) {
                    answer = tmp;
                }
                tmp = "";

            }

        }
        if (answer == "") {
            String answer2 = "";
            answer2 += s.charAt(0);
            return answer2;
        }

        return answer;
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
