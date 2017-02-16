package ch01.sec03;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/12/5 0005.
 */
public class ResizingArrayStack<Item> implements Iterable<Item>{
    private Item[] a = (Item[]) new Object[1];//栈元素
    private int N = 0;
    public boolean isEmpty(){
        return N==0;
    }
    public int size() {
        return N;
    }
    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i=0;i<N;i++)
            temp[i] = a[i];
        a = temp;
    }
    public void push(Item item){
        if (N == a.length) resize(2 * a.length);
        a[N++] = item;
    }
    public Item pop(){
        Item item = a[--N];
        a[N] = null;
        if (N>0 && N == a.length/4) resize(a.length/2);
        return item;
    }
    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayInterator();
    }
    private class ReverseArrayInterator implements Iterator<Item>{
        //支持后进先出的迭代
        private int i = N;

        public boolean hasNext() {
            return i > 0;
        }

        public Item next() {
            return a[--i];
        }

        public void remove() {
        }
    }
}
