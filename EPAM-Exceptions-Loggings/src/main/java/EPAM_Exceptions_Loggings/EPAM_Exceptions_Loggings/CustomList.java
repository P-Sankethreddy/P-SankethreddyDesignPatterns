package EPAM_Exceptions_Loggings.EPAM_Exceptions_Loggings;

public class CustomList {
	
	
	    public static void main(String[] args) 
	    {
	        DataList<Integer> list = new DataList<>();
	 
	        //Add elements
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        list.add(6);
	        list.add(7);
	        list.add(8);
	        list.add(9);
	        list.add(10);
	        System.out.println(list);

	        System.out.println("Size of the list before modification to the list");
	        System.out.println(list.size());
	         
	        System.out.println(" after Removal of elements from index 2");
	        list.remove(2);
	        System.out.println(list);
	         
	        System.out.println("Getting element with index 0 and 1");
	        System.out.println( list.get(0) );
	        System.out.println( list.get(1) );
	 
	        System.out.println("Size of the list after modification to the list");
	        System.out.println(list.size());
	    }
	
}
