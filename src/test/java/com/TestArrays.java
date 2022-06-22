package com;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
class TestArrays {
    private static final int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    @Test
    void insertElementInAnArray() {
        int posToInsert = 3;
        int[] newArray = new int[intArray.length + 1];
        System.arraycopy(intArray, 0, newArray, 0, posToInsert);
        System.arraycopy(intArray, posToInsert, newArray, posToInsert + 1, newArray.length - posToInsert - 1);
        newArray[posToInsert] = 100;
        log.info(Arrays.toString(newArray));

    }

    @Test
    void removeElementInAnArray() {
        int posToRemove = 3;
        int[] newArray = new int[intArray.length - 1];

        System.arraycopy(intArray, 0, newArray, 0, posToRemove);
        System.arraycopy(intArray, posToRemove + 1, newArray, posToRemove, newArray.length - posToRemove);
        log.info(Arrays.toString(newArray));

    }
}