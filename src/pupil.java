import java.util.Objects;

public class pupil implements Comparable<pupil>{
    private String name;
    private int grade;
    private boolean deceased;

    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }
    public pupil(String name,int grade){
        this.name=name;
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name:"+name+" Grade:"+grade+"\n";
    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (deceased ? 1 : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pupil pupil = (pupil) o;
        return grade == pupil.grade && deceased == pupil.deceased && Objects.equals(name, pupil.name);
    }

    @Override
    public int compareTo(pupil o) {
        return o.getGrade()-this.getGrade();
    }
}
