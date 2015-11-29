import java.util.Map;
import java.util.HashMap;

public class DictionaryComparison {
  public static void main(String[] args) {
    long start = System.nanoTime();
    long hashStart = System.nanoTime();

    Map<String, Object> hash = new HashMap<String, Object>();

    for (int i = 0; i < 9999; i++) {
      hash.put(Integer.toString(i), i);
    }

    long hashFinish = System.nanoTime();
    long dictStart = System.nanoTime();

    Dictionary dict = new Dictionary();

    for (int i = 0; i < 9999; i++) {
      dict.set(Integer.toString(i), i);
    }

    long dictFinish = System.nanoTime();

    log("HashMap took %.1f ms.", (hashFinish - hashStart)/1e6);
    log("Dictionary took %.1f ms.", (dictFinish - dictStart)/1e6);

    long finish = System.nanoTime();
    log("Everything took %.1f ms.", (finish - start)/1e6);
  }

  public static void log(String str, double time) {
    System.out.printf(str+"\n", time);
  }
}
