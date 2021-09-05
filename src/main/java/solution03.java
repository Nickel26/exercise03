import java.util.Scanner;

public class solution03 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution
     *  Copyright 2021 Nicholas Lopes
     */
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        //Prompt user for quote
        //Store quote input in string
        //Prompt user for author of quote
        //Store author input in string
        //Display output prompt with author and quote strings
        System.out.print("What is the quote?");
        String quote = in.nextLine();

        System.out.print("Who said it?");
        String author = in.nextLine();

        System.out.print(author + " says, \"" + quote + "\"");
    }
}
