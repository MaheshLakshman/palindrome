class Palindrome
{
    public static void main(String args[])
    {
        String name = "malayalam";
        String reverse = reverse(name);
        if(name.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome !");
        }
        
    }

    protected static String reverse(String revname)
    {
        int len = revname.length();
        String reverse = "";
        for(int i = len - 1; i >= 0; i--)
        {
            reverse += revname.charAt(i);
        }
        return reverse;
    }
}