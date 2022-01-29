package com.deepu;

public class ExpectionDemo {
    public static void main(String[] args) {
         {
            int i,j;
             i = 8;
             j = 9;

            try {
                int k=i/j;
                if (k==0)

                throw new DeepuException("this is not possible");
            }
            catch (DeepuException e)
            {
                System.out.println("error" + e.getMessage());

            }
         }
    }
}

