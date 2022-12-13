package Ut;

public class tcounter {
    public static String charcount(String input){
        return String.valueOf(input.length());
    }
    public static String wordcount(String input2){
        return input2.trim().split("\\W").length;
    }

}
