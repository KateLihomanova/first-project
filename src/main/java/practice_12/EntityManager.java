package practice_12;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
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
    public List<T> filterData(Predicate<T> filter) {
        return entities.stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

}
