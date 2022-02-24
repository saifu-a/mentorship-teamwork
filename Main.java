import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("InputData/a_an_example.in.txt");
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

        // Reading contributors
        int nextContributorPosition = 1;

        Contributor[] contributors = new Contributor[numberOfContributors];

        for (int i = 0; i < numberOfContributors; i++) {
            String[] temp = allLines[nextContributorPosition].split("\\s+");
            String name = temp[0];
            int skillCount = Integer.parseInt(temp[1]);

            Skill[] skills = new Skill[skillCount];
            for (int j = 0; j < skillCount; j++) {
                String[] temp1 = allLines[nextContributorPosition + j + 1].split("\\s+");
                String skillName = temp1[0];
                int skillLevel = Integer.parseInt(temp1[1]);
                skills[j] = new Skill(skillName, skillLevel);
            }

            contributors[i] = new Contributor(name, skills, skillCount);
            nextContributorPosition += skillCount + 1;
        }

//        System.out.println(Arrays.toString(contributors));

        // Reading projects
        int nextProjectPosition = nextContributorPosition;

        Project[] projects = new Project[numberOfProjects];

        for (int i = 0; i < numberOfProjects; i++) {
            String[] temp = allLines[nextProjectPosition].split("\\s+");
            String name = temp[0];
            int days = Integer.parseInt(temp[1]);
            int score = Integer.parseInt(temp[2]);
            int bestBefore = Integer.parseInt(temp[3]);
            int reqContributors = Integer.parseInt(temp[4]);
            double decidingFactor = (double) score / days;
            Skill[] reqSkills = new Skill[reqContributors];

            for (int j = 0; j < reqContributors; j++) {
                String[] temp1 = allLines[nextProjectPosition + j + 1].split("\\s+");
                String skillName = temp1[0];
                int skillLevel = Integer.parseInt(temp1[1]);
                reqSkills[j] = new Skill(skillName, skillLevel);
            }

            projects[i] = new Project(name, days, score, bestBefore, decidingFactor, reqContributors, reqSkills);
            nextProjectPosition += reqContributors + 1;
        }

        System.out.println(Arrays.toString(projects));
    }
}
