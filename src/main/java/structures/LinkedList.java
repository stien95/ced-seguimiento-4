package structures;

public class LinkedList<K, V> {
    private Node<K, V> first;
    private Node<K, V> last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }
    public  void add(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        Node<K, V> lastNode = last;
        last = newNode;
        if (first == null) {
            first = newNode;
        } else {
            lastNode.setNext(newNode);
        }
    }
    public V get(K key) {
        Node<K, V> current = first;
        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }
}
