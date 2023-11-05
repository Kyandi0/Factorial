import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {

    public static BigInteger iterative(int number){
        BigInteger result = BigInteger.ONE;
        for(int i=1; i<= number; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger recursive(int number){
        if(number == 0){
            return BigInteger.ONE;
        }
        else {
            BigInteger numerBigInteager = BigInteger.valueOf(number);
            return numerBigInteager.multiply(recursive(number-1));
        }
    }

    public static BigInteger stream(int number){
        return IntStream.rangeClosed(1, number)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }

    public static void main(String[] args) {
            System.out.println(iterative(5));
            System.out.println(recursive(5));
            System.out.println(stream(5));
        }
    }
