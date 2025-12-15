package practice_12;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {
    @Test
    void testAddAndGetAll() {
        EntityManager<Person> manager = new EntityManager<>();
        Person person = new Person("Kate", 34, true);
        manager.addElement(person);
        List<Person> people = manager.getAll();
        assertEquals(1, people.size());
        assertEquals("Kate", people.get(0).getName());
    }

    @Test
    void testRemove() {
        EntityManager<Person> manager = new EntityManager<>();
        Person person = new Person("Ivan", 31, false);
        manager.addElement(person);
        assertTrue(manager.remove(person));
        assertFalse(manager.remove(person));
    }

    @Test
    void testFilterByAge() {
        EntityManager<Person> manager = new EntityManager<>();
        manager.addElement(new Person("Sasha", 20, true));
        manager.addElement(new Person("Dasha", 35, false));
        manager.addElement(new Person("Petya", 50, true));
        List<Person> result = manager.filterData(person -> person.getAge() >= 30 && person.getAge() <= 40);
        assertEquals(1, result.size());
        assertEquals("Dasha", result.get(0).getName());
    }

    @Test
    void testFilterByName() {
        EntityManager<Person> manager = new EntityManager<>();
        manager.addElement(new Person("Klava", 28, true));
        manager.addElement(new Person("klava", 31, false));
        List<Person> result = manager.filterData(person -> person.getName().equalsIgnoreCase("Klava"));
        assertEquals(2, result.size());
    }

    @Test
    void testFilterByActivity() {
        EntityManager<Person> manager = new EntityManager<>();
        manager.addElement(new Person("Tom", 33, true));
        manager.addElement(new Person("Mary", 41, false));
        List<Person> result = manager.filterData(person -> person.isActive() == true);
        assertEquals(1, result.size());
        assertEquals("Tom", result.get(0).getName());
    }

}


