class Calculator
{
static double powerInt(int n1,int n2)
{
return Math.pow(n1,n2);
}
static double powerDouble(double n1,int n2)
{
return Math.pow(n1,n2);
}
}
public class TestCalculator
{
public static void main(String args[])
System.out.println(Calculator.powerInt(8,4));
System.out.println(Calculator.powerDouble(8.2,2));
}
}

