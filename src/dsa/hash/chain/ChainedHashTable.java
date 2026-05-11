package dsa.hash.chain;

public class ChainedHashTable {
    private SortedList[] hashArray;
    private int size;

    public ChainedHashTable(int size) {
        this.size = size;
        hashArray = new SortedList[size];

        for (int i = 0; i < size; i++) 
            hashArray[i] = new SortedList();
    }

    public int hashFunction(int key) {
        return key % size;
    }

    public void insert(int value) {
        int index = hashFunction(value);
        hashArray[index].insert(value);
    }

    public boolean delete(int key) {
        int index = hashFunction(key);
        return hashArray[index].delete(key);
    }

    public boolean find(int key) {
        int index = hashFunction(key);
        return hashArray[index].find(key);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + ". ");
            hashArray[i].display();
        }
    }
}
