class Divisible
{
    public static void main(String[] args)
    {
        int n = 221;

        if (n % 39 == 0)
        {
            System.out.println("221 is divisible by 39");
        }
        else
        {
            if (n % 17 == 0)
            {
                System.out.println("221 is divisible by 17");
            }
            else
            {
                System.out.println("221 is not divisible by 39 or 17");
            }
        }
    }
}