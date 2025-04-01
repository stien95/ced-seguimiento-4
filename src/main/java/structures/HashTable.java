package structures;

public class HashTable<K, V> {

    private final LinkedList<K, V>[] table;
    private int capacity;
    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }
    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int index = this.hash(key);
        table[index].add(key, value);
    }
    public V get(K key) {
        int index = this.hash(key);
        return table[index].get(key);
    }
}
