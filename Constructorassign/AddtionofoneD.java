package com.sgtest.Constructorassign;

class addtiononeD
{
    addtiononeD(int a[],int b[])
    {

        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            if(a.length==b.length)
            {
                c[i]=a[i]+b[i];
                System.out.print(c[i]+" ");
            }
        }



    }
}
public class AddtionofoneD {
    public static void main(String[] args) {
        int a[]={1,7,5,7,9};
        int b[]={8,9,2,3,8};
        addtiononeD od=new addtiononeD(a,b);
    }
}
