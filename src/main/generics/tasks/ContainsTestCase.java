package main.generics.tasks;

import java.util.Collection;
import java.util.Set;

public class ContainsTestCase<S, T extends Collection<S>> {

    /**
     * Checks for all values v in valuesToCheck if v is contained by the collection c and
     * measures the needed time needed for all checks.
     * @param valuesToAdd
     * @param c
     * @return the time needed for all contains checks
     */
    public long runTest(Set<S> valuesToCheck, T c) {
        long startTime = System.currentTimeMillis();
        for (S value : valuesToCheck)
            c.contains(value);
        return System.currentTimeMillis() - startTime;
    }

}
