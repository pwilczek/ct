package name.wilu;

import java.util.Arrays;
import java.util.List;

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
        assert result.contains(42);
        assert result.contains(6);
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
     * @return List of numbers which are duplicated, null values are skipped.
     */
    List<Integer> execute(List<Integer> numbers);
}
