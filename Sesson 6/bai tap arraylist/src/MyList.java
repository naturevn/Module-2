import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length)
            ensureCapa();
        elements[size++] = elements;
    }

    public void add(int index, E element) {
        if (size == elements.length)
            ensureCapa();
        if (index < 0 || index > elements.length) {
            System.out.println("Index khong hop le");
        }
        else if (index<size || index<elements.length){
            elements[size++]=elements;
        }else {
                elements[size++]=0;
                for (int i=size;i>=index;i--){
                    elements[i+1]=elements[i];
            }
                elements[index]=element;
        }
    }
}
