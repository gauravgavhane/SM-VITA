// Write a Java program using any loop to print characters from A to Z, skipping vowels using continue.

class program21
{
    public static void main(String[] args) 
    {
        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
            if((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
            {
                System.out.println(" Skipping Vowel");
                continue;
            }
            System.out.println(ch);
        }
    }
}