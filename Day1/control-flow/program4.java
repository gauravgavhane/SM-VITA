//	Display numbers from 3 to 30 except number 24  using loop

class program4
{
    public static void main(String[] args) 
    {
        for(int i = 3; i <= 30; i++)
        {
            if(i == 24)
            {
                continue;
            }
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}