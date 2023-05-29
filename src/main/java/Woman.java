public class Woman extends Person {
    public Woman(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
        super.retirementAge = 60;
    }
}