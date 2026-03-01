// accept a number and display whether it is prime or not.

import java.util.*;

class program8
{
    public static boolean ChkPrime(int iNo)
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 2; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt ==0)
            {
                iCount++;
                break;
            }
        }

        if(iCount == 0)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        bRet = ChkPrime(iValue);
        if(bRet == true)
        {
            System.out.println(iValue+ " is a prime number");
        }
        else
        {
            System.out.println(iValue+ " is not a prime number");
        }
    }
}