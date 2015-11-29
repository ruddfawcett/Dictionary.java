public class DictionaryTest {
  public static void main(String[] args) {
      Dictionary dict = new Dictionary();

      for (int i = 0; i < 10; i++) {
        dict.set(Integer.toString(i), i);
      }

      log("Dictionary keys: " + dict.keys());
      log("Value for \"key\": " + dict.get("key"));
      log("Dictionary size: " + dict.size());

      dict.empty();

      log("Dictionary: " + dict);
      log("Dictionary empty: " + dict.isEmpty());

      log("\n==================\n");

      String[] keys = {"key", "test"};
      Object[] objects = {"value", 1};

      Dictionary dict1 = new Dictionary(keys, objects);
      log("Dictionary keys: " + dict1.keys());
      log("Value for \"key\": " + dict1.get("key"));
      log("Dictionary size: " + dict1.size());
      log("Dictionary: " + dict1);
      log("Dictionary empty: " + dict1.isEmpty());

      Dictionary dict2 = dict1;

      log("\n==================\n");

      log("dict == dict1: " + dict.equals(dict1));
      log("dict1 == dict2: " + dict1.equals(dict2));
  }

  public static void log(Object x) {
    System.out.println(x);
  }
}
