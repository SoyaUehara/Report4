package jp.ac.uryukyu.ie.e195752;

public class Main {
    public static void main(String[] args){
        try {
            String str = null;
            str.length();
        }
        catch (Exception e){
            System.out.println("Exceptionが発生したよ");
            System.out.println(e.getMessage());
        }

    }
}
