package Model;


public class ListEvents {

  private static EventNode head; 
  private static int numEvents;
  private static int index;

 
  	public ListEvents() {
  		
  	
  		numEvents = 0;
  		head = null;
  		index=0;
  	
  }  
  	
  	
	
  	public boolean isEmpty() {
	    return numEvents == 0;
	 }  

	 public static int size() {
	    return numEvents;
	 }  
	 
	 
	 private static EventNode find(int index) {
		 
		 EventNode curr = head;
		 
		    for (int a = 0; a < index; a++) {
		      curr = curr.getNext();
		    } 
		    
		    return curr;
	 } 

	
		   
		   
	public static Event get(int index) {

		EventNode curr = find(index);
		Event dataEvent= curr.getEvent();
	      return dataEvent;
	} 

		   
	public static void add(int index, Event event)   {
			   
			  if (index >= 0 && index <= numEvents+1) {
			    	
			    	if (index == 0) { 
			    	  
			    		EventNode newReservation = new EventNode(event, head);
				        head = newReservation;
			        } 
			      
			    	else {
			    	  
			    		EventNode previuos = find(index-1); 
			    		EventNode newEvent = new EventNode(event, previuos.getNext());
			    		previuos.setNext(previuos);
			    	} 
			      
			    	numEvents ++;
			      
			   } 
	}  

	public static void remove(int index) {
			   
			   if (index >= 0 && index <= numEvents) {
    	
				   if (index == 0) {
       
					   head = head.getNext();
				   } 
      
				   else {
					   EventNode prev = find(index-1);
					   EventNode curr = prev.getNext(); 
				       prev.setNext(curr.getNext());
				   } 
				   numEvents--;
			   }
	}   

		   
	public void removeAll() {
			  
	 head = null;
	 numEvents = 0;
	} 
	
	
	
	public static void addFirst(Event event)   {

		EventNode newEvent = new EventNode(event, head);
		head = newEvent;
		
	} 
	
	public static void addLast(Event event)   {
		
		EventNode newReservation = new EventNode();
		EventNode prev = new EventNode();
		 prev = find(numEvents); 
		newReservation = new EventNode(event, prev.getNext());
        prev.setNext(newReservation);
	} 
	
	
	
   private static void removeEvent(int id) {
		 
	   EventNode curr = head;
		 
		 while (curr != null) {

		        if ((curr.getEvent().getEventId()== id)) {

		        	remove( index);

		        }

		        curr = curr.getNext();

		        index++;    

  
		  }
   }
   }