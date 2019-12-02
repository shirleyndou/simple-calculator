public class Calculator {
    public int add(int a, int b)
    {
        return a+b;
    }

    public int addModified(int...a)
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public int multiply(int c, int d)
    {
        return c*d;
    }

    public int multipleModified(int...b) {

        int product =1;
        for(int i=0; i<b.length; i++)
        {
            product *= b[i];
        }

        return product ;
    }

}
