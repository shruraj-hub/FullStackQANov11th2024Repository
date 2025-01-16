package com.sgtest.Constructorassign;
class FiboSum
{
    FiboSum(int n)
    {
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("sum of first 10 fib number are "+sum);
    }
}

public class fibonociSum
{
    public static void main(String[] args)
    {
        FiboSum s = new FiboSum(10);
    }
}


