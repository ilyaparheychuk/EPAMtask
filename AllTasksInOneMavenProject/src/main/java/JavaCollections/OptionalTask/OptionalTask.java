package JavaCollections.OptionalTask;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Scanner;


public class OptionalTask {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader n = new FileReader("D:\\studyautomate\\EPAM COURCE\\Java\\JavaTask\\9AllInOneMavenProject\\one.txt");
        Scanner in = new Scanner(n);

        ArrayList<String> lines = new ArrayList<String>();

        while (in.hasNext()) {
            lines.add(in.nextLine());
        }

        in.close();
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }

    }
}
