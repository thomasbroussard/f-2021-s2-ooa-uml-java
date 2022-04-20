package fr.epita.exam.datamodel;

public enum PassengerClass {
    FIRST_CLASS("1st"),
    SECOND_CLASS("2nd"),
    THIRD_CLASS("3rd");

    private String className;

    PassengerClass(String name){
        this.className = name;
    }


}
