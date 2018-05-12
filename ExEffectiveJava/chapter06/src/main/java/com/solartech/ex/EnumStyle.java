package com.solartech.ex;

/**
 * Font Sytle Enumuration
 */
public enum EnumStyle {

    STYLE_BOLD(1),
    STYLE_ITALIC(2),
    STYLE_UNDERLINE(3),
    STYLE_STRIKETHROHGH(4);

    EnumStyle(int iValue) {
        this.iValue = iValue;
    }

    public int value() {
        return this.iValue;
    }

    private int iValue ;

}
