public class Main {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("apple");
        set.add("orange");
        set.add("banana");
        set.add("pear");
        set.add("lemon");
        set.add("peach");

        System.out.println("set contains apple: " + set.contains("apple"));
        System.out.println("set contains pear: " + set.contains("pear"));
        System.out.println("set contains orange: " + set.contains("orange"));
        System.out.println("set contains banana: " + set.contains("banana"));
        System.out.println("set contains pineapple: " + set.contains("pineapple"));
        System.out.println("set contains grape: " + set.contains("grape"));
        System.out.println("set size: " + set.size());
    }
}
