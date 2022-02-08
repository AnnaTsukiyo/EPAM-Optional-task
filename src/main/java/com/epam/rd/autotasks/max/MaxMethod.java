package com.epam.rd.autotasks.max;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        if (values == null || values.length == 0) {
            OptionalInt empty = OptionalInt.empty();
            return empty;
        }
        IntStream intStream = Arrays.stream(values);
        OptionalInt optionalInt = intStream.max();
        int maxAsInt = optionalInt.getAsInt();
        return optionalInt;
    }
}
