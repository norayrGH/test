package com.company;

public class Main extends Thread {

    public static void main(String[] args) {
        String str = "StudyTonight";
        str.concat(".com");
        str = str.toUpperCase();
        str.replace("TONIGHT","today");
        System.out.println(str); /* sadadaw*/
    }
    public void run()
    {
        System.out.print("Thread ");
    }
}
