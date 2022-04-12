package fr.epita.csv.exercise.datamodel;


//Task6
public class StudentGrade {
    private String name;
    private String grade;

    public StudentGrade(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
