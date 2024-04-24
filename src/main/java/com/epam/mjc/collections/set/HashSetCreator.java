package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer elem : sourceList) {
            set.add(elem);
            if (elem % 2 == 0) {
                while (elem % 2 == 0) {
                    elem /= 2;
                    set.add(elem);
                }
            } else {
                set.add(elem * 2);
            }
        }
        return set;
    }
}
