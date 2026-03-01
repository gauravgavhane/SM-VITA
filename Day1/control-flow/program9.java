// Patterns
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

* * * * 
 * * * 
  * * 
   * 


    * 
   * * 
  * * * 
 * * * * 
  * * * 
   * * 
    * 
    
    
*/

class program9
{
    public static void main(String arg[])
    {
        System.out.println();
        System.out.println("Pattern 1 : ");
        System.out.println();

        for(int i=1; i<=5; i++) 
        { 
            for(int j=1; j<=5-i; j++) 
            { 
                System.out.print(" "); 
            } 
            for(int k = 1; k<=i; k++) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        }
        
        System.out.println(); 
        System.out.println("Pattern 2 : ");
        System.out.println();

        for(int i=4; i>=1; i--) 
        { 
            for(int j=1; j<=5-i; j++) 
            { 
                System.out.print(" "); 
            } 
            for(int k = 1; k<=i; k++) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        }

        System.out.println();
        System.out.println("Pattern 3 : ");
        System.out.println();

        for(int i=1; i<=5; i++) 
        { 
            for(int j=1; j<=5-i; j++) 
            { 
                System.out.print(" "); 
            } 
            for(int k = 1; k<=i; k++) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        }
        for(int i=4; i>=1; i--) 
        { 
            for(int j=1; j<=5-i; j++) 
            { 
                System.out.print(" "); 
            } 
            for(int k = 1; k<=i; k++) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        }
    }
}