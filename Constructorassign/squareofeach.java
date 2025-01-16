package com.sgtest.Constructorassign;
class square
{
    square(int a[][])
    {
        for (int i = 0; i < a.length; i++)
        {
            for(int j=0;j<a[i].length;j++)
            {

                System.out.print((a[i][j] * a[i][j])+" ");
            }
            System.out.println();
        }

    }
}
public class squareofeach {
    public static void main(String[] args) {
        int a[][]={{2,4,5},{5,7,9},{5,7,1}};
        square sq=new square(a);
    }
}
