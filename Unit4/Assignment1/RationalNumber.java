package Assignment1;

public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(){
        numerator = 0;
        denominator = 1;
    }
    public RationalNumber(int a, int b){
        numerator = a;
        denominator = b;
    }

    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int a){
        numerator = a;
    }

    public void setDenominator(int b){
        denominator = b;
    }

    public String toString(){
        if(numerator % denominator == 0)
            return ""+(numerator/denominator);
        else
            return numerator+"/"+denominator;   
    }

    public RationalNumber multiplication(RationalNumber a){
        return new RationalNumber(this.numerator*a.numerator, this.denominator*a.denominator);
    }
}
