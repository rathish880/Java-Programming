
import java.math.BigDecimal;
import java.math.BigInteger;
public class LargeNumbers {
    public static void main(String[] args) {

        //  BIG INTEGER  //

        // BigInteger bi=new BigInteger("1");
        // for(int i=2;i<=10;i++){
        //     bi=bi.multiply(BigInteger.valueOf(i));
        // }
        // System.out.println(bi);

        //  BIG DECIMAL  //

        // double x=0.04;
        // double y=0.03;
        // System.out.println(x-y);
        BigDecimal x=new BigDecimal("0.04");
        BigDecimal y=new BigDecimal("0.03");
        System.out.println(x.subtract(y));

        // BigInteger z=new BigInteger("7");
        // System.out.println(z.negate());
        // int ab=7;
        // System.out.println(~ab);


        //constants
        BigInteger con=BigInteger.ONE;
        System.out.println(con);


    }
}
