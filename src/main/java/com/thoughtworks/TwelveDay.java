package com.thoughtworks;

public class TwelveDay {

    public static void main(String[] args) {
        System.out.println("Welcome");

        for (int day = 1; day <= 12; day++) {
            System.out.print("On the ");

            switch (day) {
                case 1:
                    System.out.print("first");
                    break;
                case 2:
                    System.out.print("second");
                    break;
                case 3:
                    System.out.print("third");
                    break;
                case 4:
                    System.out.print("fourth");
                    break;
                case 5:
                    System.out.print("fifth");
                    break;
                case 6:
                    System.out.print("sixth");
                    break;
                case 7:
                    System.out.print("seventh");
                    break;
                case 8:
                    System.out.print("eighth");
                    break;
                case 9:
                    System.out.print("ninth");
                    break;
                case 10:
                    System.out.print("tenth");
                    break;
                case 11:
                    System.out.print("eleventh");
                    break;
                case 12:
                    System.out.print("twelfth");
                    break;
            }
            System.out.print(" day of Christmas my true love gave to me:");
            switch (day) {
                case 12:
                    System.out.print("Twelve drummers drumming, ");
                case 11:
                    System.out.print("Eleven pipers piping, ");
                case 10:
                    System.out.print("Ten lords a leaping, ");
                case 9:
                    System.out.print("Nine ladies dancing, ");
                case 8:
                    System.out.print("Eight maids a milking, ");
                case 7:
                    System.out.print("Seven swans a swimming, ");
                case 6:
                    System.out.print("Six geese a laying, ");
                case 5:
                    System.out.print("Five golden rings, ");
                case 4:
                    System.out.print("Four calling birds, ");
                case 3:
                    System.out.print("Three French hens, ");
                case 2:
                    System.out.print("Two turtle doves, and ");
                default:
                    System.out.print("A partridge in a pear tree. ");
            }
            System.out.println("\n");
        }
    }

}
