package com.solartech.ex.generic;

public class ExArrayAlg {

    public static <T> T getMiddle(T... oArray) {
        return oArray[oArray.length / 2];
    }

    public static <T extends Comparable> ExPair<T> getMinMax(T[] oArray) {
        if (null == oArray || 0 == oArray.length) {
            return null;
        }
        T oMin = oArray[0];
        T oMax = oArray[0];
        for (int i = 1; i < oArray.length; i++) {
            if (oMin.compareTo(oArray[i]) > 0) {
                oMin = oArray[i];
            }
            if (oMax.compareTo(oArray[i]) < 0) {
                oMax = oArray[i];
            }
        }
        return new ExPair(oMin, oMax);
    }
}
