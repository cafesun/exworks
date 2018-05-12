package com.solartech.ex;


import java.util.EnumSet;

public class ExEnumSetDemo {


    public static void main(String[] args) {
        EnumSet<EnumStyle> oEnumSet = EnumSet.of(EnumStyle.STYLE_BOLD,
                EnumStyle.STYLE_ITALIC);
        if (oEnumSet.contains(EnumStyle.STYLE_ITALIC)) {
            System.out.println("Italic");
        } else {
            System.out.println("Non Italic");
        }

    }

}
