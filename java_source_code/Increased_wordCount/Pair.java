package n7.projet;

import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

public class Pair implements PairFunction<String, String, Integer> {
    public Tuple2<String, Integer> call(String word) {
        int a=0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 10; k++) {
                    a=a+i+j+k;
                    a=a-i-j-k;
                }
            }
        }
        return new Tuple2<String, Integer>(word, a+1);
    }

}