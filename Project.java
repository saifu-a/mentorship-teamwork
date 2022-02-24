import java.util.Arrays;

public class Project {
    public String name;
    public int numberOfDays;
    public int score;
    public int bestBefore;
    public int requireContributors;
    public String[] roles;
    public Skill[] skills;

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", numberOfDays=" + numberOfDays +
                ", score=" + score +
                ", bestBefore=" + bestBefore +
                ", requireContributors=" + requireContributors +
                ", roles=" + Arrays.toString(roles) +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
