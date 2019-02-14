package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testCatName(){

        //Given
        String name="chichi";
        Date catDate = new Date();
        int id = 02;

        //When

        Cat cat = new Cat(name, catDate, id);

        //Then
        String expected = cat.getName();
        Assert.assertEquals(expected, name);
    }


    // TODO - Create tests for `speak`
    @Test
    public void testCatSpeak(){
        //Given
        String name="chichi";
        Date catDate = new Date();
        int id = 02;
        String actual = "meow!";
        //Cat cat = new Cat("chichi", new Date(), 02);

        //When
        Cat cat = new Cat(name,catDate, id);

        //Then
        String expected = cat.speak();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testCatBirthDate(){
        //Given
        String name="chichi";
        Date catDate = new Date();
        int id = 02;

        //When
        Cat cat = new Cat(name, catDate, id);
        cat.setBirthDate(catDate);

        //Then
        Date expected = cat.getBirthDate();
        Assert.assertEquals(expected, catDate);

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEatFood(){
        //Given
        String name = "chichi";
        Date catDate = new Date();
        int id = 02;
        Food food = new Food();


        //When
        Cat cat = new Cat(name, catDate, id);

       // System.out.println(cat.getNumberOfMealsEaten());

        //Then
        int expected = cat.getNumberOfMealsEaten();
        int actual = 0;
        Assert.assertEquals(expected,actual);

    }



    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        //Given
        String name = "chichi";
        Date catDate = new Date();
        int id = 02;

        //When
        Cat cat = new Cat(name, catDate, id);

        //Then
        int expectedId = cat.getId();
        Assert.assertEquals(expectedId, id);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testAnimalInheritance(){
        //Given
        String name = "chichi";
        Date catDate = new Date();
        int id = 02;
        Cat cat = new Cat(name, catDate, id);

//       Cat cat = new Cat();

        //Then

        Assert.assertTrue(cat instanceof Cat);

    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

@Test
    public void testMammalInheritance() {
    //  Given

    String name = "chichi";
    Date catDate = new Date();
    int id = 02;
    Cat cat = new Cat(name, catDate, id);
    Assert.assertTrue(cat instanceof Mammal);

}

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
