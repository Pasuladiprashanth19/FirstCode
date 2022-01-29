public class ArrayDemo
{
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {2, 3, 5};
        int c[] = {3, 5, 6, 7};

        int d[][] = {
                {1, 2, 3, 4},
                {2, 3, 4,},
                {3, 5, 6, 7},
        };

        for (int k[] : d) {
            for (int l : k) {
                System.out.print(" " + k);
            }
            System.out.println();
        }
    }
    }
