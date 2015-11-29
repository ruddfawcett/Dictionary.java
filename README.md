Dictionary.java
===

**Full Disclaimer:** I am *fully* aware of `Map`, `HashMap`, etc.  I am also aware of the `java.util.Dictionary` superclass.  Also, `Dictionary` is *not* type safe, and is probably not the best reimplementation.

## Why
I built this just to play around with `ArrayList`, and try to reimplement an existing technology.  `Dictionary` is (on average) **much** slower than `HashMap` (especially with large data sets), so it's not exactly a drop in replacement (or recommended as one).

## What
`Dictionary` exposes the following:

```java
public Object get(String key);

public void set(String key, Object value);

public void remove(String key);
public void empty();

public int size();
public boolean isEmpty();

public ArrayList<String> keys();
```

## How
`Dictionary.java` uses two `ArrayList`s to track keys and objects, which are matched by an array index.

|index  | keys       | objects      |
|-------|------------|--------------|
|0      | "key"      | "object"     |
|1      | "another"  | 18           |
|2      | "one more" | `Dictionary` |
|3      | "etc"      | `ArrayList`  |

## License
Dictionary.java is available under the MIT license. See the LICENSE file for more info.
