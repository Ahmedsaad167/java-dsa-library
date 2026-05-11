package dsa.hash;

public class HashTable {
    private DataItem[] hashArray;
    private int size;
    private DataItem nonItem;

    public HashTable(int size) {
        this.size = size;
        hashArray = new DataItem[size];
        nonItem = new DataItem(-1);
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void insert(int value) {
        DataItem newItem = new DataItem(value);
        int index = hashFunction(value);
        while (hashArray[index] != null && hashArray[index].data != -1) {
            index++;
            index %= size;
        }
        hashArray[index] = newItem;
    }

    public boolean find(int key) {
        int index = hashFunction(key);
        while (hashArray[index] != null) {
            if (hashArray[index].data == key)
                return true;
            index++;
            index %= size;
        }
        return false;
    }

    public void display() {
        System.out.print("Hash Table: ");
        for (DataItem item : hashArray) {
            if (item == null || item.data == -1)
                System.out.print("null  ");
            else
                System.out.print(item.data + "  ");
        }
        System.out.println();
    }
}
