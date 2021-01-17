package com.company;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


public class Main
{

    public static int n;
    public static int[][] matrixAlpha;
    public static int range = 11;

    /**
     * Generates a random number when called
      * @return randomly generated number
     */

    public static int random()
    {
        Random rand = new Random();
        int num = rand.nextInt(range);
        return num;

    }

    /**
     * The purpose of this method is to generate a n x n square matrix
     * based on the param entered.
     *
     * @param nValue, sets the n x n square matrix size
     * @return a n x n matrix
     */
    public static int[][] matrix(int nValue)
    {
        int[][] matrix =  new int[nValue][nValue];
        for(int i = 0; i < nValue; i ++)
        {
            for(int j = 0; j < nValue; j ++)
            {
                matrix[i][j] = random();
            }
        }
        n = nValue;
        matrixAlpha = matrix;

        return matrix;
    }

    /**
     * Method prints the matrix in question
     */
    public static void print()
    {
        for(int i = 0; i < n; i ++)
        {
            for(int j = 0; j < n; j ++)
            {
                System.out.print(matrixAlpha[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * Method to sort out a Matrix
     *
     * @param  2D matrix
     */

    public static void sort()
    {
        int temp;

        for(int i = 0; i < n; i ++)
        {
            for(int j = 0; j < n; j ++)
            {

            }

        }

    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Matrix Sorting");
        System.out.println("");
        System.out.println("The purpose of this program is to generate a random n x n square matrix,");
        System.out.println("which will be auto-populated by random numbers. Afterwards, the same matrix will be sorted.");
        System.out.println("");
        System.out.println("Please enter a number to determine the size of the n x n matrix: ");

	    while(scan.hasNextLine() || scan.hasNextDouble())
        {

            if(scan.hasNextInt())
            {
                n = scan.nextInt();
                break;
            }
            else
            {
                System.out.println("This is not a valid input, try another valid integer value.");
                n = scan.nextInt();

            }

        }


        System.out.println("This is the " + n + " by " + n + " matrix auto-populated randomly");
        System.out.println("");

	    matrix(n);
	    print();

        System.out.println("Now we will sort the " + n + " by " + n + " matrix.");
        System.out.println("");

    }
}
