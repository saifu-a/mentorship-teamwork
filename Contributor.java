import java.util.Arrays;

public class Contributor {
    public String name;
    public Skill[] skills;
    public int skillCount;

    public Contributor(String name, Skill[] skills, int skillCount) {
        this.name = name;
        this.skills = skills;
        this.skillCount = skillCount;
    }

    @Override
    public String toString() {
        return "Contributor{" +
                "name='" + name + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", skillCount=" + skillCount +
                '}';
    }
}
