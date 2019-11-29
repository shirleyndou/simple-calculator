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
        int product = 0;
        int size = b.length -1;
        int update =b[size];
        for (int i = 0; i < b.length-1; ++i){
            product = update*b[size-1];
            update = product;
            size--;
        }

        return product ;
    }

}
