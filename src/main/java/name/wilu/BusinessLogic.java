package name.wilu;

import java.util.List;

/**
 * That executes complex business logic.
 * Needs to stay as it is.
 */
public class BusinessLogic {
    public void execute(List<Integer> numbers) {
        assert numbers.size() == 2;
        assert numbers.contains(42);
        assert numbers.contains(6);
    }
}
