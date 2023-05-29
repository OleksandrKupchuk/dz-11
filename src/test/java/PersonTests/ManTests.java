package PersonTests;

import Persons.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Messages.Persons.MessagePersons.*;

public class ManTests {

    @Test(groups = {"properties"})
    public void testCheckSetFirstName(){
        String firstName = "Ivan";
        Man man = new Man();
        man.setFirstName(firstName);
        Assert.assertEquals(man.getFirstName(), firstName, firstNameMessage(man.getFirstName(), firstName));
    }

    @Test(groups = {"properties"})
    public void testCheckSetLastName(){
        String lastName = "Vynyuk";
        Man man = new Man();
        man.setLastName(lastName);
        Assert.assertEquals(man.getLastName(), lastName, lastNameMessage(man.getLastName(), lastName));
    }

    @Test(groups = {"properties"})
    public void testCheckSetAge(){
        int age = 25;
        Man man = new Man();
        man.setAge(age);
        Assert.assertEquals(man.getAge(), age, ageMessage(man.getAge(), age));
    }

    @Test(groups = {"properties"})
    public void testCheckSetPartner(){
        String namePartner = "Ira";
        Man man = new Man();
        man.setPartner(namePartner);
        Assert.assertEquals(man.getPartner(), namePartner, partnerMessage(man.getPartner(), namePartner));
    }

    @Test
    public void testCheckNotRetired(){
        Man man = new Man("Oleksandr", "Levko", 65);
        Assert.assertEquals(man.isRetired(), false, shouldNotBeRetiredMessage(man.getFirstName()));
    }

    @Test
    public void testCheckIsRetired(){
        Man man = new Man("Oleksandr", "Levko", 66);
        Assert.assertEquals(man.isRetired(), true, shouldBeRetiredMessage(man.getFirstName()));
    }

    @Test(groups = {"properties"})
    public void testCheckRegisterPartnership(){
        Woman woman = new Woman("Ira", "Vynyuk", 28);
        Man man = new Man("Oleksandr", "Levko", 27);
        man.registerPartnership(woman.getLastName());
        Assert.assertEquals(man.getLastName(), woman.getLastName(), registerPartnershipMessage(man.getLastName(), woman.getLastName()));
    }

    @Test(groups = {"properties"})
    public void testCheckDeregisterPartnership(){
        Woman woman = new Woman("Ira", "Vynyuk", 28);
        Man man = new Man("Oleksandr", "Levko", 27);
        man.registerPartnership(woman.getLastName());
        man.deregisterPartnership(true);
        Assert.assertEquals(man.getPreviousLastName(), man.getLastName(), deregisterPartnershipMessage(man.getPreviousLastName(), man.getLastName()));
    }
}