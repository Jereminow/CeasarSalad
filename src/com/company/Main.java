package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
public static String rotate13(String message){
    int key = 13;
    String codedMessage = "";
    for (int i = 0; i< message.length();i++){
        char mChar = message.charAt(i);
        if (mChar == 32){
            codedMessage += " ";
        } else{
            mChar -= 97;
            mChar = (char) ((mChar+key)%26 + 97);
            codedMessage += mChar;
            }

        }

    return codedMessage;
}

public static String code(String message, int key){
    String codedMessage = "";
    key = key % 26 + 26;
    for (int i = 0; i< message.length();i++){
        char mChar = message.charAt(i);
        if (mChar == 32){
            codedMessage += " ";
        } else{
            mChar -= 97;
            mChar = (char) ((mChar+key)%26 + 97);
            codedMessage += mChar;
        }

    }

    return codedMessage;
}
    public static String decode(String message, int key){
        return code(message,-key);
    }



    public static void main(String[] args) {
        System.out.println(rotate13("abc zde"));
        Scanner scan = new Scanner(System.in);
        String m = scan.nextLine();
        int keey = 12;
        System.out.println(code(m,keey));
        System.out.println(decode(code(m,keey),keey));
        File file = new File("data.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String oo = scanner.nextLine();
        System.out.println(rotate13(oo));
    }
}
