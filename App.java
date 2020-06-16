package company;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Calculator calc = new Calculator();
        System.out.println( "Hello World!" );
		System.out.println( "Let's count sum 3 and 5: "  + calc.getSum(3, 5));
    }
}
