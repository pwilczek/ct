package name.wilu;

import java.util.Arrays;
import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        //
        DuplicatesFinder algo = null;
        //
        List<Integer> result = new App(algo).compute(Arrays.asList(
                17, 42, 12, 6, 12, null, 42, 0, -9, 6, null, 12, 1, -42
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
