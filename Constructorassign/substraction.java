package com.sgtest.Constructorassign;
class Substractiontwo
{


    Substractiontwo(int a[][],int b[][]) {
        int c[][] = new int[a.length][b.length];

        for ( int i = 0; i < a.length; i++)
        {
            for ( int j = 0; j < a[i].length; j++)
            {
                c[i][j] = a[i][j] - b[i][j];

            }

        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for ( int j = 0; j < a[i].length; j++) {

                sum = sum + c[i][j];
            }
            System.out.println("sum of nubbers" + sum);
        }
    }

}
public class substraction
{

    public static void main(String[] args)
    {
        int a[][]={{12,3,45},{6,23,6},{5,9,21}};
        int b[][]={{6,23,6},{6,1,2},{9,2,5}};
        Substractiontwo s1=new Substractiontwo(a,b);
    }
}

