import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFromFile {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int trueanswer;
        int trueanswerscounter = 0;
        String path = "exercises.txt";

        try (Scanner fr = new Scanner(new File(path))) {
            //while (sc.hasNextInt()) sum += sc.nextInt();
            while (fr.hasNextLine()) {
                System.out.println(fr.nextLine());
                int num = Integer.parseInt(fr.nextLine());
                for (int i = 0; i < num; i++) {
                    System.out.println(fr.nextLine());
                }
                trueanswer = Integer.parseInt(fr.nextLine());
                int useranswer = console.nextInt();
                System.out.println(useranswer == trueanswer ? "Correct answer" : "Incorrect answer");
                if (useranswer == trueanswer) trueanswerscounter++;
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Total correct answers : " + trueanswerscounter);
        }
    }
}
