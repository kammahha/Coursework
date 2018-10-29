package coursework;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("pls enter n o players: ");
	    Scanner in = new Scanner(System.in);
	    int nofPlayers = in.nextInt();
	    int nofCards = 8 * nofPlayers, index = 0;
	    boolean isFile = true;

	    // Here we check if the pack is valid and enter the values of the cards into cards array

        File inputFile = new File("pack.txt");
        int [] cards = new int [nofCards];
        try {
            Scanner input = new Scanner(inputFile);
            while (input.hasNextLine())
            {
                cards[index] = input.nextInt();
                index ++;
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid pack: Pack is too long");
            System.out.println(e.toString());
        }
        catch (Exception e)
        {
            System.out.println("The input file was not found");
            System.out.println(e.toString());
            isFile = false;
        }
        if (isFile == true && index != nofCards)
        {
            System.out.println("Invalid pack: Pack is too short");
        }
    }
}
