// Write a Java program using a for loop to print numbers from 1 to 25, skipping perfect squares.
// [   1 = 1 × 1 
//   4 = 2 × 2 
//   9 = 3 × 3 
//  16 = 4 × 4 
//   25 = 5 × 5 
// ]

class program20
{
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 25; i++)
        {
            if((i == 1) || (i == 4) || (i == 9) || (i == 16) || (i == 25))
            {
                System.out.println(" Skipping Perfect Square");
                continue;
            }
            System.out.println(i);
        }
    }
}