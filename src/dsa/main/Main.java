package dsa.main;

import dsa.hash.chain.ChainedHashTable;

public class Main {

    public static void main(String[] args) {
        ChainedHashTable table = new ChainedHashTable(10);

        table.insert(21);
        table.insert(31);
        table.insert(55);
        table.insert(214);
        table.insert(41);
        table.display();
        table.delete(31);
        
        table.display();
    }
}