package fr.epita.titanic.datamodel;

public class Passenger {

    private String passengerId;
    private boolean survived;
    private String pclass;
    private String gender;
    private double age;

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public boolean getSurvived() {
        return survived;
    }

    public void setSurvived(boolean survived) {
        this.survived = survived;
    }

    public String getPclass() {
        return pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Passenger(String passengerId, boolean survived, String pclass, String gender, double age) {
        this.passengerId = passengerId;
        this.survived = survived;
        this.pclass = pclass;
        this.gender = gender;
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
