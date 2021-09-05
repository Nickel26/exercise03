import java.util.Scanner;

public class solution03 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution
     *  Copyright 2021 Nicholas Lopes
     */
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("What is the quote?");
        String quote = in.nextLine();

        System.out.print("Who said it?");
        String author = in.nextLine();

        System.out.printf(author + " says, \"" + quote + "\"");
    }
}
