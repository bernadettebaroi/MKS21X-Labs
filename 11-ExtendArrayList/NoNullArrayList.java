import java.util.*;
import java.io.*;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList () {
    super();
  }

  public NoNullArrayList (int startingCapacity) {
    super(startingCapacity);
  }

  public T get(int index) {
    if (super.get(index) == null) {
      throw new IllegalArgumentException ("Error Message");
    } else {
      return super.get(index);
    }
  }

  public T set(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException ("Error Message");
    } else {
      return super.set(index, element);
    }
  }

  public void add(int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException ("Error Message");
    } else {
      super.add(index, element);
    }
  }

  public boolean add(T element) {
    if (element == null) {
      throw new IllegalArgumentException ("Error Message");
    } else {
      super.add(element);
      return true;
    }
  }
}
