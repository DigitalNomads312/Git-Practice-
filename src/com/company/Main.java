package com.company;

public class Main {

    public static void main(String[] args) {

//        System.out.println("changes on my project");
        String str = "Azamat";
        System.out.println(reverse(str));
        System.out.println("new sout");

    }

    public static String reverse (String str) {
        String reversed = "";
        for( int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;

    }

    public static boolean isPolendrom(String str){
        String str1 = reverse(str);
        if(str.equals(str1)){
            return true;
        }else {

        }return false;
    }

 public static int sum (int a , int b){
        return a + b;
 }

}
