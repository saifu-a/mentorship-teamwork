import java.util.Arrays;

public class Project {
    public String name;
    public int numberOfDays;
    public int score;
    public int bestBefore;
    public int requireContributors;
    public Skill[] requiredSkills;

    public Project(String name, int numberOfDays, int score, int bestBefore, int requireContributors, Skill[] requiredSkills) {
        this.name = name;
        this.numberOfDays = numberOfDays;
        this.score = score;
        this.bestBefore = bestBefore;
        this.requireContributors = requireContributors;
        this.requiredSkills = requiredSkills;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", numberOfDays=" + numberOfDays +
                ", score=" + score +
                ", bestBefore=" + bestBefore +
                ", requireContributors=" + requireContributors +
                ", skills=" + Arrays.toString(requiredSkills) +
                '}';
    }
}
