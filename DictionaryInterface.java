import java.util.ArrayList;

public interface DictionaryInterface {
  /**
   * An object for a key.
   * @param  key The key of the object.
   * @return     The object for the key.
   */
  public Object get(String key);

  /**
   * Sets an object for a key.
   * @param  The key for the object.
   * @param  The object for the key.
   */
  public void set(String key, Object value);

  /**
   * Removes an object for a key.
   * @param key The key of the object to remove.
   */
  public void remove(String key);
  /**
   * Empties the dictionary.
   */
  public void empty();

  /**
   * The number of keys in the dictionary.
   * @return The number of keys.
   */
  public int size();
  /**
   * Whether or not the dictionary is empty.
   * @return If the number of keys is greater than zero.
   */
  public boolean isEmpty();

  /**
   * The keys in the dictionary.
   * @return An ArrayList of keys.
   */
  public ArrayList<String> keys();
}
