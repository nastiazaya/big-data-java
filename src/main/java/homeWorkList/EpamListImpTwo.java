package homeWorkList;


public class EpamListImpTwo<E> implements EpamListTwo<E> {
    private Object[] elements;
    private int capacity;
    private int index;
    private static final int DEFAULT_CAPACITY = 50;


    public EpamListImpTwo(){
        this(DEFAULT_CAPACITY);
    }

    public EpamListImpTwo(int capacity){
        this.elements = new Object[capacity];
        this.capacity = capacity;
        this.index = 0;
    }

    @Override
    public void add(E o) {
        if(this.index == this.capacity){
            this.capacity *= 2;
            Object[] temp = new Object[this.capacity];
            if (this.index >= 0) System.arraycopy(this.elements, 0, temp, 0, this.index);
            this.elements = temp;
        }
        this.elements[this.index] = o;
        this.index++;
    }

    @Override
    public int size() {
        return this.index;
    }

    @Override
    public boolean remove(int i) {
        if (i < 0 || i >= this.index){
            return false;
        }
        if(i == this.index - 1){
            this.elements[i] = null;
        }
        else {

            if (this.index - 1 - i >= 0) System.arraycopy(this.elements, i + 1, this.elements, i, this.index - 1 - i);
        }
        this.index--;
        return true;
    }

    @Override
    public boolean remove(E o) {
        for (int i = 0; i < this.index; i++) {
            if(o.equals(this.elements[i])){
                return this.remove(i);
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= this.index){
            throw new IndexOutOfBoundsException();
        }
        return (E) this.elements[index];

    }

    @Override
    public void printAllContext() {
        for (int i = 0; i < this.index; i++) {
            System.out.println(this.elements[i]);
        }
    }
}
