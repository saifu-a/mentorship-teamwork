public class Skill {
    String skillName;
    int skillLevel;

    public Skill(String skillName, int skillLevel) {
        this.skillName = skillName;
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillName='" + skillName + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }
}
