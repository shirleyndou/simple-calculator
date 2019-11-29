import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void addTest(){
        Calculator test = new Calculator();
        int sum = test.add(5,4);
        assertEquals(9, sum);
    }

    @Test
    public void addModifiedTest()
    {
        Calculator test1 = new Calculator();
        int sum1 = test1.addModified(1,2,3,4,5);
        assertEquals(15, sum1);
    }

    @Test
    public void multiplyTest()
    {
        Calculator test2 = new Calculator();
        int product = test2.multiply(-1, 3);
        assertEquals(-3,product);
    }

    @Test
    public void multipleModifiedTest()
    {
        Calculator test4 = new Calculator();
        int product2 = test4.multipleModified(2,4);
        assertEquals(8, product2);
    }

}