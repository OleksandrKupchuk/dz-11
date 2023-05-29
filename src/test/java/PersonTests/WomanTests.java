package PersonTests;

import Persons.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Messages.Persons.MessagePersons.*;

public class WomanTests {

    @Test(groups = {"properties"})
    public void testCheckSetFirstName(){
        String firstName = "Ira";
        Woman woman = new Woman();
        woman.setFirstName(firstName);
        Assert.assertEquals(woman.getFirstName(), firstName, firstNameMessage(woman.getFirstName(), firstName));
    }

    @Test(groups = {"properties"})
    public void testCheckSetLastName(){
        String lastName = "Levko";
        Woman woman = new Woman();
        woman.setLastName(lastName);
        Assert.assertEquals(woman.getLastName(), lastName, lastNameMessage(woman.getLastName(), lastName));
    }

    @Test(groups = {"properties"})
    public void testCheckSetAge(){
        int age = 27;
        Woman woman = new Woman();
        woman.setAge(age);
        Assert.assertEquals(woman.getAge(), age, ageMessage(woman.getAge(), age));
    }

    @Test(groups = {"properties"})
    public void testCheckSetPartner(){
        String namePartner = "Oleksandr";
        Woman woman = new Woman();
        woman.setPartner(namePartner);
        Assert.assertEquals(woman.getPartner(), namePartner, partnerMessage(woman.getPartner(), namePartner));
    }

    @Test
    public void testCheckNotRetired(){
        Woman woman = new Woman("Ira", "Vynyuk", 60);
        Assert.assertEquals(woman.isRetired(), false, shouldNotBeRetiredMessage(woman.getFirstName()));
    }

    @Test
    public void testCheckIsRetired(){
        Woman woman = new Woman("Ira", "Vynyuk", 61);
        Assert.assertEquals(woman.isRetired(), true, shouldBeRetiredMessage(woman.getFirstName()));
    }

    @Test(groups = {"properties"})
    public void testCheckRegisterPartnership(){
        Man man = new Man("Oleksandr", "Levko", 25);
        Woman woman = new Woman("Ira", "Vynyuk", 28);
        woman.registerPartnership(man.getLastName());
        Assert.assertEquals(woman.getLastName(), man.getLastName(), registerPartnershipMessage(woman.getLastName(), man.getLastName()));
    }

    @Test(groups = {"properties"})
    public void testCheckDeregisterPartnership(){
        Man man = new Man("Oleksandr", "Levko", 27);
        Woman woman = new Woman("Ira", "Vynyuk", 28);
        woman.registerPartnership(man.getLastName());
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getPreviousLastName(), woman.getLastName(), deregisterPartnershipMessage(woman.getPreviousLastName(), woman.getLastName()));
    }
}