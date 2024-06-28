import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Maxmin
 */
public class Maxmin {

    public static void main(String[] args) {

       int max=Stream.of(3,6,9,2,7,67,9,4).max(Comparator.comparing(Integer::valueOf)).get();

       Integer min =Stream.of(4,6,8,1,0,5,-1,9).min(Comparator.comparing(Integer::valueOf)).get();
        
       String maxx=Stream.of("r","m","p").max(Comparator.comparing(String::valueOf)).toString();

        System.err.println("max value is "+max);
        System.out.println("min value is "+min);
         System.out.println("max value is "+maxx);
    }
}