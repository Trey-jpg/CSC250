public class Driver 
{
    public static void main(String[] args)
    {
        int count = 0;
        String s = "Habakkuk";
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