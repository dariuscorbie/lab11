public class Factorial
{
   
//Darius was here<(^v^)>

 //recursively calculates the factorial of n
    public static long pureRecursive(int n)
    {
        if (n<=0)
            throw new IllegalArgumentException();
        else if (n==1)
            return n;
        else
            return n*pureRecursive(n-1);
    }

    //uses tail recursion to calculate the factorial of n
    public static long tailRecursive(int n)
    {
        if (n<=0)
            throw new IllegalArgumentException();
        else
            return tail(n,1);

    }

    //private method to assist tailRecursive
    private static long tail(int n, long product)
    {
        if (n==1)
            return product;
        else
            return tail(n-1,n*product);
    }

    //iterative method to calculate the factorial of n
    public static Long iterative (int n)
    {
        long product = 1;
        for (int i=2;i<=n;i++)
            product*=i;
        return product;
    }
}
