package com.timothy_g;

public class Increment {

    public static void main(String[] args) {

	    // demo showing prefix vs. postfix
        int i = 8;
        System.out.printf("i before postincremnet: %d%n", i);
        System.out.printf("         postincremnet: %d%n", i++);
        System.out.printf(" i after postincremnet: %d%n", i);

        //skip a line
        System.out.println();

        i = 8;
        System.out.printf("i before preincremnet: %d%n", i);
        System.out.printf("         preincremnet: %d%n", ++i);
        System.out.printf(" i after preincremnet: %d%n", i);


    }  //end main
} // end class
