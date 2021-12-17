package Assignment1.q2;

public class RationalNumberTester {
    public static void main(String[] args) {


        RationalNumber rn = new RationalNumber();
        RationalNumber rnOverload = new RationalNumber(1, 5);
        System.out.println(rn.multiplication(rnOverload));
        System.out.println(rn);
    } 
}
