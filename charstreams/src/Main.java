import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {




        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
            lines.add(line);
        }





        br.close();


        System.out.println(wordSearch("is", lines));







    }

    static ArrayList<Integer> wordSearch(String word, ArrayList<String> lizt) {
        ArrayList<Integer> solution = new ArrayList<>();
        for (int i = 0; i < lizt.size(); i++) {
            if (lizt.get(i).contains(word)) {
                solution.add(i);
            }

        }

        return solution;
    }


}
