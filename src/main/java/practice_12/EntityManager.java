package practice_12;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager <T> {
    private final CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    public void addElement(T entity) {
        entities.add(entity);
    }
    public boolean remove(T entity) {
        return entities.remove(entity);
    }
    public List<T> getAll() {
        return List.copyOf(entities);
    }
    public List<T> filterByAge(int min, int max) {
        return entities.stream()
                .filter(e -> e instanceof Person)
                .map(e -> (Person) e)
                .filter(person -> person.getAge() >= min &&
                        person.getAge() <= max)
                .map(person -> (T) person)
                .collect(Collectors.toList());
    }
    public List<T> filterByName(String name) {
        return entities.stream()
                .filter(e -> e instanceof Person)
                .map(e -> (Person) e)
                .filter(person ->
                        person.getName().equalsIgnoreCase(name))
                .map(person -> (T) person)
                .collect(Collectors.toList());
    }
    public List<T> filterByActivity(boolean active) {
        return entities.stream()
                .filter(e -> e instanceof Person)
                .map(e -> (Person) e)
                .filter(person -> person.isActive() == active)
                .map(person -> (T) person)
                .collect(Collectors.toList());
    }

}
