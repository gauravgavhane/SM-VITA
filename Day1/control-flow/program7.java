/*
7) using nested for loop display following :

A  a
A  b
A  c

B  a
B  b
B  c

C  a
C  b
C  c

*/

class program7
{
    public static void main(String arg[])
    {
        char ch1 = 'A';
        char ch2 = 'a';

        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= 3; j++)
            {
                System.out.println(ch1+"  "+ch2);
                ch2++;
            }
            ch1++;
            ch2 = 'a';
            System.out.println();
        }
    }
}