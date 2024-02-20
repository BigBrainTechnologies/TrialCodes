package basicPrograms;


	import java.util.HashSet;

	public class HashSetDemo {
	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();
	        
	        // Adding elements to the HashSet
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Grapes");
	        set.add("Mango");
	        
	        //I like Mangoes :-) 
	        set.add("Mango");
	        
	        // Printing the HashSet
	        System.out.println("HashSet: " + set);
	        
	        // Removing an element from the HashSet
	        set.remove("Orange");
	        
	        // Checking if an element is present in the HashSet
	        System.out.println("Does the HashSet contain Banana? " + set.contains("Banana"));
	        
	        // Printing the size of the HashSet
	        System.out.println("Size of the HashSet: " + set.size());
	        
	        // Removing all the elements from the HashSet
	        set.clear();
	        
	        // Checking if the HashSet is empty
	        System.out.println("Is the HashSet empty? " + set.isEmpty());
	    }
	}