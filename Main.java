import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Documents\\Workspace\\HashCode\\mentorship-teamwork\\InputData\\a_an_example.in.txt");
        Scanner scanner = new Scanner(fileInputStream);

        String[] allLines = new String[100];
        int k = 0;
        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());      //returns the line that was skipped
            allLines[k++] = scanner.nextLine();
        }
        scanner.close();     //closes the scanner

        int numberOfContributors = Integer.parseInt(String.valueOf(allLines[0].charAt(0)));
        int numberOfProjects = Integer.parseInt(String.valueOf(allLines[0].charAt(2)));

        String nextContributor = allLines[1];
        int nextContributorPosition = allLines[1].charAt(-1) + 1;
    }
}
