// Write a Java program using a while loop to print numbers from 1 to 20, skipping numbers divisible by 4.

class program18
{
    public static void main(String[] args) 
    {
        int i = 1;
        while(i <= 20)
        {
            if(i%4 == 0)
            {
                System.out.println("Number divisible by 4");
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}