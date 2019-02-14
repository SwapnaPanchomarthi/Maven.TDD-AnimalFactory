package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testAnimalCreateDog(){
        String name = "Blacky";
        Date myDate = new Date();

         Dog myDog = AnimalFactory.createDog("Blacky", new Date());
         String expectedName = myDog.getName();
         Date expectedDate = myDog.getBirthDate();


        Assert.assertEquals(expectedDate, myDate );
        Assert.assertEquals(expectedName, name);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testAnimalCreateCat(){
        String name = "Billy";
        Date myDate = new Date();

        Cat myCat = AnimalFactory.createCat("Billy", new Date());
        String expectedName = myCat.getName();
        Date expectedDate = myCat.getBirthDate();


        Assert.assertEquals(expectedDate, myDate );
        Assert.assertEquals(expectedName, name);
    }
/*    private AnimalFactory animalFactory;


    @Before
  public void setup(){
        animalFactory = new AnimalFactory();

    }

    @Test
    public void */
}
