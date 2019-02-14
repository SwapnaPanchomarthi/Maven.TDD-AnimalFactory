package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testSetName() {

        Dog dog1 = new Dog("Blacky", new Date(), 003);
        Assert.assertTrue(dog1 instanceof Dog);

    }
    // TODO - Create tests for `speak`
    @Test
    public void testDogSpeak() {

        Dog dog1 = new Dog("Blacky", new Date(), 003);

        String actual= dog1.speak();
        String expected = "bark!";
        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testDogBirthDate() {

        Dog dog1 = new Dog("Blacky", new Date(), 003);

        Date actual= dog1.getBirthDate();
        Date expected = new Date();
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testDogEat() {

        Dog dog1 = new Dog("Blacky", new Date(), 003);
        Food food = new Food();
        dog1.eat(food);
        int actual = dog1.getNumberOfMealsEaten();
        int expected = 1;

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void testDogGetId() {

        Dog dog1 = new Dog("Blacky", new Date(), 003);

        int actual= dog1.getId();
        int expected = 003;
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {

        Dog dog1 = new Dog("Blacky", new Date(), 003);

        Assert.assertTrue(dog1 instanceof Animal);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
   @Test
    public void testMammalinheritance() {

        Dog dog1 = new Dog("Blacky", new Date(), 003);

        Assert.assertTrue(dog1 instanceof Mammal);

    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
