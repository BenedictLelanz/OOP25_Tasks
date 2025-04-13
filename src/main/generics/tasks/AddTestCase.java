package main.generics.tasks;

import java.util.Collection;
import java.util.Set;

public class AddTestCase<S, T extends Collection<S>> {

    /**
     * Adds all values from valuesToAdd to the collection c and meaures the needed time.
     * @param valuesToAdd
     * @param c
     * @return the time needed for all add operations
     */
    public long runTest(Set<S> valuesToAdd, T c) {
        // TODO
        return 0;
    }

}
