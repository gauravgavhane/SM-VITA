// Write a Java program to print natural numbers but stop when the sum exceeds 100.
// [ Meaning:
// •	You start printing natural numbers:
// 1, 2, 3, 4, 5, …
// •	At the same time, you keep adding them to a running sum.
// •	The moment the sum becomes greater than 100, you stop printing further numbers.]

class program4
{
    public static void main(String arg[])
    {
        int sum = 0, i = 0;

        while(sum <= 100)
        {
            i++;
            sum = sum + i;
            System.out.print(i+"\t");
        }
    }
}