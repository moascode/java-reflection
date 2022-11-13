package com.moascode.fields;

import java.lang.reflect.*;
public class ArrayReader {

    public static Object getArrayElement(Object array, int index) {
        int length = Array.getLength(array);
        if (index >= 0) {
            return Array.get(array, index);
        }
        return Array.get(array, length+index);
    }
}
