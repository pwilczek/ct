package name.wilu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Add -ea to VM options before running to enable assertions
 */
public class AppRunner {
    public static void main(String[] args) {
        //
        DuplicatesFinder algo = null;
        //
        List<Integer> result = new App(algo).compute(Arrays.asList(
                17, 42, 12, 6, -12, null, 0, 6, -9, 42, null, 1, 6, -42
        ));
        //
        assert result.size() == 2;
        assert result.get(0) == 42;
        assert result.get(1) == 6;
    }
}

class App {
    //
    private final DuplicatesFinder algo;

    App(DuplicatesFinder algo) {
        this.algo = algo;
    }

    List<Integer> compute(List<Integer> numbers) {
        return algo.execute(numbers);
    }
}

/**
 * Interface for algo detecting duplicates
 */
interface DuplicatesFinder {
    /**
     * @return List of numbers which are duplicated in the same order
     * they appeared in passed list, null values are skipped.
     */
    List<Integer> execute(List<Integer> numbers);
}
