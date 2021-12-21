public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList () {
    super();
  }

  public OrderedArrayList (int startingCapacity) {
    super(startingCapacity);
  }

  private int whereToPlace(T value){
    int i = 0;
    if (size() == 0) {
      return 0;
    }
    while (i < size()) {
      if (get(i).compareTo(value) >= 0) {
        return i;
      } else {
        i++;
      }
    }
    return i;
  }

  //will still add the element, but it will ignore the index.
  public void add(int index, T element) {
    super.add(whereToPlace(element), element);
  }

  /* will remove the element at the index and return it, along
  with adding the element to the correct position as described above */
  public T set(int index, T element) {
    super.remove(index);
    super.add(whereToPlace(element), element);
    return element;
  }



}
