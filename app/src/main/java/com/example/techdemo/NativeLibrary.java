package com.example.techdemo;

public class NativeLibrary {

    public static int Add(int val1, int val2)
    {
        return NativeLibraryAdd(val1, val2);
    }


    public static int Sub(int val1, int val2)
    {
        return NativeLibrarySub(val1, val2);
    }

    public static double Mul(int val1, int val2)
    {
        return NativeLibraryMul(val1, val2);
    }

    public static double Div(int val1, int val2)
    {
        return NativeLibraryDiv(val1, val2);
    }


    public native static int NativeLibrarySub(int val1, int val2);
    public native static int NativeLibraryAdd(int val1, int val2);
    public native static double NativeLibraryMul(int val1, int val2);
    public native static double NativeLibraryDiv(int val1, int val2);

    static {
        System.loadLibrary("NativeLibraryGlue");
    }

}
