package by.home;

public class Calculator {

    public String doCalc(int numOne, int numTwo, String sign){
        switch (sign){
            case "sum":
                return numOne+" + "+numTwo+" = "+sum(numOne,numTwo);
            case "div":
                return numOne+" / "+numTwo+" = "+div(numOne,numTwo);
            case "dif":
                return numOne+" - "+numTwo+" = "+dif(numOne,numTwo);
            case "mult":
                return numOne+" * "+numTwo+" = "+mult(numOne,numTwo);
        }
        return "Sign doesn't exist in this program!";
    }

    private int sum(int numOne, int numTwo){
        return (numOne+numTwo);
    }
    private int div(int numOne, int numTwo){
        return (numOne/numTwo);
    }
    private int dif(int numOne, int numTwo){
        return (numOne-numTwo);
    }
    private int mult(int numOne, int numTwo){
        return (numOne*numTwo);
    }
}
