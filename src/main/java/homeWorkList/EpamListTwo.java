package homeWorkList;




public interface EpamListTwo<E> {
    void add(E o);
    int size();

    boolean remove(int i);


    //bonus
    boolean remove(E o);

    E get(int index);


    void printAllContext();
}