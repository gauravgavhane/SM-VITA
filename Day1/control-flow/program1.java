//	display a table of a particular number    

import java.util.*;

class program1
{
    public static void table(int num)
    {
        int i = 0, Result = 0;

        for(i = 1; i <= 10; i++)
        {
            Result = num * i;
            System.out.print(Result+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        {
            Scanner sobj = new Scanner(System.in);

            int no = 0;

            System.out.println("Enter number : ");
            no = sobj.nextInt();

            table(no);
        }
    }
}