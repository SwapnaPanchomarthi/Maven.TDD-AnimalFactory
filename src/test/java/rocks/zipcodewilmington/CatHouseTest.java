package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;


/**
 * @author leon on 4/19/18.
 */

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addCatTest() {
        //Given
        CatHouse.clear();
        String name = "chichi";
        Date bday = new Date();
        int id = 2;
        Cat cat = new Cat(name, bday, id);

        //When
        CatHouse.add(cat);

        //Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, actual);

    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCat() {
        //Given
        CatHouse.clear();
        String name = "chichi";
        Date bday = new Date();
        int id = 2;
        int id1 = 3;

        Cat cat1 = new Cat(name, bday, id);
        Cat cat2 = new Cat(name, bday, id1);
        //When
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.remove(2);

        //Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, actual);

    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatIdTest() {
        //Given
        CatHouse.clear();
        String name = "chichi";
        Date bday = new Date();
        int id = 2;
        Cat cat = new Cat(name, bday, id);

        //When
        CatHouse.add(cat);
        CatHouse.remove(cat);

        //Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(0, actual);

    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        //Given
        CatHouse.clear();
        String name = "chichi";
        Date bday = new Date();
        int id = 2;
        Cat cat = new Cat(name, bday, id);
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById((Integer)id);

        //Then
        Assert.assertEquals(cat, actual);


    }

    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test

    public void getNumberOfCatsTest() {
        //Given
        CatHouse.clear();
        String name = "chichi";
        Date bday = new Date();
        int id = 2;
        Cat cat1 = new Cat(name, bday, id);
        CatHouse.add(cat1);
        Cat cat2 = new Cat("Sweety", new Date(), 004);
        CatHouse.add(cat2);
      Integer actual=  CatHouse.getNumberOfCats();

      Assert.assertEquals((Integer)2, actual);
    }

}