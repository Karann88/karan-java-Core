package Rev;

public class Main {
    public static void main(String[] args) {
    //     Rancho list = new Rancho();
    //     list.insertFirst(14);
    //     list.insertFirst(16);
    //     list.insertFirst(18);
    //     list.insertFirst(22);
    //     list.insertLast(44);
    //     list.insert(16, 65);
    //     list.display();
    //     list.deleteFirst();
    //     list.display();
    //     System.out.println(list.deleteLast());
    //     list.display();
    //     System.out.println(list.delete(2));
    //     list.display();

    // CLL list = new CLL();
    // list.insert(12);
    // list.insert(22);
    // list.insert(33);
    // list.insert(55);
    // list.delete(22);
    // list.display();

    RecLL list = new RecLL();
    list.insertFirst(4);
    list.insertFirst(8);
    list.insertFirst(12);
    list.insertFirst(16);
    list.display();
    list.insertRec(20, 2);
    list.display();
    
    }
}
