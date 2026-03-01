// Write a Java program using a do-while loop to print numbers from 1 to 15, skipping multiples of 3.

class program19
{
    public static void main(String[] args) 
    {
        int i = 1;
        do
        {
            if(i%3 == 0)
            {
                System.out.println("Divisible by 3");
                i++;
                continue;   
            }
            System.out.println(i);
            i++;
        }while(i <= 15);
    }
}