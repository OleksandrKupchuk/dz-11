import Persons.Man;
import Persons.Woman;
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
        String lastName = "Vynyuk";
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

    @Test
    public void testCheckManIsRetired(){
        int age = 66;
        Man man = new Man();
        man.setAge(age);
        Assert.assertEquals(man.isRetired(), true, "Man is on retired");
    }

    @Test
    public void testCheckRegisterPartnership(){
        Woman woman = new Woman("Ira", "Vynyuk", 28);
        Man man = new Man();
        man.registerPartnership(woman.getLastName());
        Assert.assertEquals(man.getLastName(), woman.getLastName(),
                String.format("Last name '%s' not equal last name his partner '%s'", man.getLastName(), woman.getLastName()));
    }

    @Test
    public void testCheckDeregisterPartnership(){
        Woman woman = new Woman("Ira", "Vynyuk", 28);
        Man man = new Man("Oleksandr", "Levko", 27);
        man.registerPartnership(woman.getLastName());
        Assert.assertEquals(man.getLastName(), woman.getLastName(),
                String.format("Last name '%s' not equal last name his partner '%s'", man.getLastName(), woman.getLastName()));
    }
}
