package OOPs.generics;

public class Main implements GenericInterface<Integer> {
    private CustomGenArrayList<Integer> list = new CustomGenArrayList<>();

    @Override
    public void add(Integer item) {
        list.add(item);
    }

    @Override
    public Integer get(int index) {
        return list.get(index);
    }

    @Override
    public Integer remove() {
        return list.remove();
    }

    @Override
    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.add(10);
        main.add(20);
        main.add(30);
        System.out.println("Element at index 1: " + main.get(1));
        System.out.println("Size of list: " + main.size());
        System.out.println("Removed element: " + main.remove());
        System.out.println("Size of list after removal: " + main.size());
    }

}
