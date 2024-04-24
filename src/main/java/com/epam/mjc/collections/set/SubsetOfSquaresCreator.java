package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> set = new TreeSet<>();
        for (Integer elem : sourceList) {
            set.add(elem * elem);
        }
        return set.subSet(lowerBound, true, upperBound, true);
    }
}
