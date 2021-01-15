package com.company;

public class Main {

    public static void main(String[] args) {
	float myMinFloatValue = Float.MIN_VALUE;
	float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minumum value " + myMaxFloatValue);
        System.out.println("Float maximum value " + myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minumum value " + myMaxDoubleValue);
        System.out.println("Double maximum value " + myMinDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);

        double myPounds =  200d;
        double myKilogramy = myPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + myKilogramy);

    }
}
