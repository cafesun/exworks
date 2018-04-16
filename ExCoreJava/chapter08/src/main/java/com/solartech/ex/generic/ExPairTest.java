package com.solartech.ex.generic;

public class ExPairTest {

    public static void main(String[] args) {
        ExPair<String> oPair = new ExPair("hello", "World");
        System.out.println("new ExPair() ");
        String[] arNames = {"Harry", "Jack", "John"};
        String strName = ExArrayAlg.getMiddle(arNames);
        System.out.println(strName);

        ExPair<String> oPairMinMax = ExArrayAlg.getMinMax(arNames);
        System.out.printf("min = %s, max = %s \n", oPairMinMax.getFirst(), oPairMinMax.getSecond());
//        ExPair<String> oPairError = ExArrayAlg.getMinMax("111", 0 ,null);

        return;
    }
}
