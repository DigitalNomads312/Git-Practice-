package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("changes on my project");
        String str = "Azamat";
        System.out.println(reverse(str));
    }

    public static String reverse (String str) {
        String reversed = "";
        for( int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;

    }

}
