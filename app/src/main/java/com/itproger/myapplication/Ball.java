package com.itproger.myapplication;

public class Ball {
    public int znach;
    public String ima;
    static String otwet;

    public Ball(int znach, String ima) {//конструктор
        this.znach = znach;
        this.ima = ima;
    }

    public static Ball ballA = new Ball(0, "а");
    public static Ball ballB = new Ball(0, "б");
    public static Ball ballC = new Ball(0, "с");
    public static Ball ballD = new Ball(0, "ди");

    public static Ball[] spisok = new Ball[]{ballA, ballB, ballC, ballD};
}