package homework214;

public class EpamListImp implements EpamList{
    private Object[] elements;
    private int capacity;
    private int index;
    private static final int DEFAULT_CAPACITY = 50;


    public EpamListImp(){
        this(DEFAULT_CAPACITY);
    }

    public EpamListImp(int capacity){
        this.elements = new Object[capacity];
        this.capacity = capacity;
        this.index = 0;
    }

    @Override
    public void add(Object o) {
        if(this.index == this.capacity){
            this.capacity *= 2;
            Object[] temp = new Object[this.capacity];
            for (int i = 0; i < this.index; i++) {
                temp[i] = this.elements[i];
            }
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

            for (int j = i; j < this.index - 1; j++) {
                this.elements[j] = this.elements[j + 1];
            }
        }
        this.index--;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < this.index; i++) {
            if(o.equals(this.elements[i])){
                return this.remove(i);
            }
        }
        return false;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= this.index){
            return "index out of bounds";
        }
        return this.elements[index];

    }

    @Override
    public void printAllContext() {
        for (int i = 0; i < this.index; i++) {
            System.out.println(this.elements[i]);
        }
    }
}
