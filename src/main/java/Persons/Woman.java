package Persons;

public class Woman extends Person {
    public Woman(){
        super.retirementAge = 60;
    }

    public Woman(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
        super.retirementAge = 60;
    }
}