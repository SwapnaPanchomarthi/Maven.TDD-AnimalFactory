package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAddDog(){
        DogHouse.clear();
        Dog dog = new Dog("Blacky", new Date(), 003);

       DogHouse.add(dog);
       int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
       public void testRemoveDogId() {
        DogHouse.clear();
        Dog dog1 = new Dog("Blacky", new Date(), 003);
        Dog dog2 = new Dog("Ruby", new Date(), 004);

        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.remove((Integer) 003);
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1, actual);
    }
        // TODO - Create tests for `void remove(Dog dog)`
        @Test
        public void testRemoveDog() {
            DogHouse.clear();
            Dog dog1 = new Dog("Blacky", new Date(), 003);
            Dog dog2 = new Dog("Ruby", new Date(), 004);

            DogHouse.add(dog1);
            DogHouse.add(dog2);
            DogHouse.remove(dog1);

            int actual = DogHouse.getNumberOfDogs();
            Assert.assertEquals(1, actual);
        }
    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void testGetDogById() {
        DogHouse.clear();
        Dog dog = new Dog("Blacky", new Date(), 003);

        DogHouse.add(dog);
       Dog actual = DogHouse.getDogById((Integer)003);

       Assert.assertEquals(dog, actual);

    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void tesGetNumberOfDogs() {
        DogHouse.clear();
        Dog dog1 = new Dog("Blacky", new Date(), 003);
        Dog dog2 = new Dog("Ruby", new Date(), 004);

        DogHouse.add(dog1);
        DogHouse.add(dog2);

        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals((Integer)2, actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
       Integer actual = DogHouse.getNumberOfDogs();
       Assert.assertEquals((Integer)1, actual);

    }
}
