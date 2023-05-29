import Persons.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTests {

    @Test
    public void testCheckSetFirstName(){
        String firstName = "Ivan";
        Man man = new Man();
        man.setFirstName(firstName);
        Assert.assertEquals(man.getFirstName(), firstName, String.format("name '%s' not equal '%s'", man.getFirstName(), firstName));
    }

    @Test
    public void testCheckSetLastName(){
        String lastName = "Ivanovych";
        Man man = new Man();
        man.setLastName(lastName);
        Assert.assertEquals(man.getLastName(), lastName, String.format("last name '%s' not equal '%s'", man.getLastName(), lastName));
    }

    @Test
    public void testCheckSetAge(){
        int age = 25;
        Man man = new Man();
        man.setAge(age);
        Assert.assertEquals(man.getAge(), age, String.format("age '%s' not equal '%s'", man.getAge(), age));
    }

    @Test
    public void testCheckSetPartner(){
        String namePartner = "Ira";
        Man man = new Man();
        man.setPartner(namePartner);
        Assert.assertEquals(man.getPartner(), namePartner, String.format("Partner '%s' not equal '%s'", man.getPartner(), namePartner));
    }

    @Test
    public void testCheckManNotRetired(){
        int age = 65;
        Man man = new Man();
        man.setAge(age);
        Assert.assertEquals(man.isRetired(), false, "Man not retired");
    }
}
