package OOPs.generics;

public interface GenericInterface<T> {
    void add(T item);
    T get(int index);
    T remove();
    int size();

}
