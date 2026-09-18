import java.util.Scanner;
// Sorting branch update
public class task2
 {
    static void sort(int a[])
     {
        for (int i = 0; i < 4; i++) 
            {
            for (int j = 0; j < 4 - i; j++)
                 {
                if (a[j] > a[j + 1]) 
                    {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    static void findValues(int a[]) 
    {
        System.out.println("Second Lowest: " + a[1]);
        System.out.println("Second Highest: " + a[3]);
    }
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 different numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Original Array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        sort(a);
        System.out.println("Sorted Array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        findValues(a);
        sc.close();
    }
}