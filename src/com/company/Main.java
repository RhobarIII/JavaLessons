package com.company;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static boolean hasWon=false;
    static int i=0;

    public static void main(String[] args)
    {

    GameLoop();

    }
    private static boolean Game(int value)
    {
        Scanner inputValue =new Scanner(System.in);
        int valueToGuess= inputValue.nextInt();
        if(value>valueToGuess)
            System.out.println("Liczba Jest Większa\n");
        else if(value<valueToGuess)
            System.out.println("Liczba jest Mniejsza\n");
        else
        {
            System.out.println("Brawo odgadłeś liczbę");
            return true;
        }
        return false;
    }
    private static int GenerateNumber(int Range)
    {
        Random rand=new Random();
        int value= rand.nextInt(Range);
        return value;
    }
    private static void GameLoop()
    {
        int value;
        value=GenerateNumber(102-1);
        while(hasWon==false && i<5)
        {
            hasWon=Game(value);
            i++;
        }
        if(hasWon==false)
            System.out.println("Zgadywana liczba wynosiła5: "+value);
        System.out.println("\nLiczba prób: "+i);


    }


}
