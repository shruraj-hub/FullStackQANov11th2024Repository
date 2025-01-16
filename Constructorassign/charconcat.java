package com.sgtest.Constructorassign;
class concat {
    concat(char b[][]) {

        for (int i = 0; i < b[2].length; i++)
        {
            System.out.print(b[i] [2]+ " ");
        }
        System.out.println();
    }
}
public class charconcat {
    public static void main(String[] args) {
        char b[][] = {{'c', 'f', 'g'}, {'e', 'w', 'r'}, {'w', 'r', 't'}};
        concat c1=new concat(b);




    }
}


