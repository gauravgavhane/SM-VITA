// Display all prime numbers between 3 to 30

import java.util.*;

class program6
{
    public static boolean ChkPrime(int iNo)
    {
        boolean bFlag = false;

        int iCnt = 0;

        for(iCnt = 2; iCnt <= iNo/2; iCnt++)
        {
            if(iNo% iCnt == 0)
            {
                bFlag = true;
            }
        }
        return bFlag;
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
            System.out.println(iValue+" is not prime number");
        }
        else
        {
            System.out.println(iValue+ " is a prime number");
        }
    }
}