package com.company;

import java.util.EnumSet;

class Main {
    // an enum named Size
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);

        System.out.println("EnumSet: " + sizes);
    }
/* EnumSet<Size> sizes = EnumSet.allOf(Size.class);
*Burada Size.class, Boyut numaralandırmasını gösterir. */
}
