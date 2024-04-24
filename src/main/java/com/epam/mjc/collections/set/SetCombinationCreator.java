package com.epam.mjc.collections.set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new TreeSet<>();
        for (String elem : firstSet) {
            if (secondSet.contains(elem) && !thirdSet.contains(elem)) {
                set.add(elem);
            }
        }
        for (String elem : thirdSet) {
            if (!firstSet.contains(elem) && !secondSet.contains(elem)) {
                set.add(elem);
            }
        }
        return set;
    }
}
