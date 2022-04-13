import java.util.*;

public class dataStructures {
    public static void main(String[] args) {
        //ARRAY
        System.out.println("__ARRAY__");
        int[] scores = new int[4];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++)
            scores[i]=in.nextInt();

        for(int i = 0; i < scores.length; i++)
            System.out.print(scores[i] + " ");
        System.out.println();

        //ARRAY LIST
        System.out.println();
        System.out.println("__ARRAY LIST__");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(32);
        numbers.add(45);
        numbers.add(84);
        numbers.add(91);
        System.out.println(numbers);

        //LINKED LIST
        System.out.println();
        System.out.println("__LINKED LIST__");
        LinkedList<String> names  = new LinkedList<String>();
        LinkedList<String> moreNames = new LinkedList<String>();
        names.add("Farhan");
        names.add("Enver");
        names.add("Ege");
        names.add("Baris");
        names.add("Mirza");
        names.add("Nilufer");
        names.addFirst("Timothy");
        names.addLast("Jimothy");

        moreNames.add("Tom");
        moreNames.add("Bob");
        moreNames.add("Jim");
        moreNames.add("Tim");
        moreNames.add("Dwight");

        names.addAll(3, moreNames);

        System.out.println(names);
        System.out.println(moreNames);

        //DICTIONARY
        System.out.println();
        System.out.println("__DICTIONARY__");
        Dictionary dict = new Hashtable();
        dict.put(101, "Sydney");
        dict.put(102, "Brisbane");
        dict.put(103, "Melbourne");
        dict.put(104, "Perth");
        dict.put(105, "Lismore");
        dict.put(106, "Mount Gambier");
        dict.put(107, "Nelson Bay");
        dict.put(108, "Canberra");

        System.out.println(dict);

        //HASH MAP
        System.out.println();
        System.out.println("__HASH MAP__");
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Pineapple");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //HASH TABLE
        System.out.println();
        System.out.println("__HASH TABLE__");
        Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
        hashTable.put(100, "Lolita");
        hashTable.put(102, "Summertime Sadness");
        hashTable.put(101, "Born to Die");
        hashTable.put(103, "Florida Kilos");
        System.out.println("Before remove: " + hashTable);
        hashTable.remove(101);
        System.out.println("After remove: " + hashTable);
        System.out.println(hashTable.getOrDefault(100, "Not found"));
        System.out.println(hashTable.getOrDefault(104, "Not found"));
        hashTable.putIfAbsent(105, "Diet Mountain Dew");

        //QUEUE
        System.out.println();
        System.out.println("QUEUE");
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("The greatest");
        queue.add("Dealer");
        queue.add("Off To The Races");
        queue.add("Blue Jeans");
//        System.out.println("Head of the queue: " + queue.element());
        System.out.println("Head of the queue: " + queue.peek());
        System.out.println();
        System.out.println("Iterating queue...");
        Iterator itr = queue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //STACK
        System.out.println();
        System.out.println("__STACK__");
        Stack stk = new Stack();
        System.out.println("Stack empty or not: " + stk.empty());
        stk.push(32);
        stk.push(12);
        stk.push(3);
        stk.push(83);
        stk.push(72);
        System.out.println(stk.peek());
        stk.pop();
        System.out.println(stk.peek()); 

    }
}
