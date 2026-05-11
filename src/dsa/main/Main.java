package dsa.main;

import dsa.hash.HashTable;

public class Main {

    public static void main(String[] args) {
        HashTable table = new HashTable(10);

        table.insert(37);
        table.insert(27);
        table.insert(17);

        table.display();

        table.delete(27);

        table.display();

        System.out.println(table.find(17));
    }
}