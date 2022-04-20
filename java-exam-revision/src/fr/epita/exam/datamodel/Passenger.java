package fr.epita.exam.datamodel;

public class Passenger {
    private String name;
    private String pclass;
    private double age;
    private String sex;
    private boolean survived;

    public Passenger(String name, String pclass, double age, String sex, boolean survived) {
        this.name = name;
        this.pclass = pclass;
        this.age = age;
        this.sex = sex;
        this.survived = survived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPclass() {
        return pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isSurvived() {
        return survived;
    }

    public void setSurvived(boolean survived) {
        this.survived = survived;
    }

    @Override
    public String toString() {
        return "Passenger [" +
                "name=\"" + name + "\"" +
                ", survived=\"" + survived +"\""
                + ']';
    }
}
