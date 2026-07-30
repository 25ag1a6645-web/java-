public class RecursionExample
{
    static int Factorial (int n)
    {
        if(n==1)
            return 1;
        else
            return (n*Factorial(n-1));
    }
    public static void main(String[] args)
    {
        System.out.println("Factorial of 5 is:" + Factorial(5));
    }
    
}
