//  Display all twin prime numbers between 3 to 30
// 	e.g.(3,5)
// 		(5,7)	
// 		(11,13)
// 		(17,19)

class program10
{
    public static void DisplayPrime()
    {
        for(int i = 3; i <= 30; i++)
        {
            if(Prime(i) && Prime(i+2))
            {
                System.out.println("("+i+", "+(i+2)+")");
            }
        }
    }

    public static boolean Prime(int no)
    {
        if(no <= 1)
        {
            return false;
        }
        for(int i = 2; i <= no/2; i++)
        {
            if(no % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        DisplayPrime();
    }
}