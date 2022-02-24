import java.util.Arrays;

public class Project {
    public String name;
    public int numberOfDays;
    public int score;
    public int bestBefore;
    public double decidingFactor;
    public int requireContributors;
    public Skill[] requiredSkills;

    public Project(String name, int numberOfDays, int score, int bestBefore, double decidingFactor, int requireContributors, Skill[] requiredSkills) {
        this.name = name;
        this.numberOfDays = numberOfDays;
        this.score = score;
        this.bestBefore = bestBefore;
        this.decidingFactor = decidingFactor;
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
                ", decidingFactor=" + decidingFactor + 
                ", requireContributors=" + requireContributors +
                ", skills=" + Arrays.toString(requiredSkills) +
                '}';
    }
}
