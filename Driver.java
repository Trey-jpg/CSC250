import java.util.Scanner;
public class Driver 
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner vowelCounter = new Scanner(System.in);
        System.out.println("Enter a word to find how many vowels.");

        String s = vowelCounter.nextLine();
        System.out.println(count);
        
        for(int i = s.length()-1; i >= 0; i--)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.print(count);

    }
}