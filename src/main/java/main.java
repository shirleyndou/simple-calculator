public class main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5,4));

        System.out.println(calc.addModified(1,2,3,4));

        System.out.println(calc.multiply(-1,3));

        System.out.println(calc.multipleModified(2,4,5));
    }
}
