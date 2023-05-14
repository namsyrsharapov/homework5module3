public class HashSet {
    private final int capacity = 256;
    private int size = 0;
    private Node[] table = new Node[capacity];
    private static class Node {
        private Object value;
        private Node next;

        public Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    private int hash(Object obj) {
        return Math.abs(obj.hashCode() % capacity);
    }
    public boolean add(Object obj) {
        if (contains(obj)) {
            return false;
        }
        int index = hash(obj);
        Node newNode = new Node(obj, table[index]);
        table[index] = newNode;
        size++;
        return true;
    }
    public boolean remove(Object obj) {
        int index = hash(obj);
        Node head = table[index];
        if (head != null && head.value.equals(obj)) {
            table[index] = head.next;
            size--;
            return true;}
        while (head != null) {
            Node next = head.next;
            if (next != null && next.value.equals(obj)) {
                head.next = next.next;
                size--;
                return true;
            }
            head = next;
        }
        return false;
    }
    public boolean contains(Object obj) {
        int index = hash(obj);
        Node head = table[index];
        while (head != null) {
            if (head.value.equals(obj)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
    public int size() {
        return size;
    }
}