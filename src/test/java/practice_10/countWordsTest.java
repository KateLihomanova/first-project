package practice_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class countWordsTest extends task10Test {

    public static Stream<Arguments> stringWords() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of("asdfe", 1),
                Arguments.of("asdf ghjc jn", 3),
                Arguments.of(" ", 0),
                Arguments.of("s", 1));
    }

    @ParameterizedTest
    @MethodSource("stringWords")
    public void countWordsInString(String myString, int lengthString) {
        assertEquals(task.countWords(myString), lengthString);
    }
}
