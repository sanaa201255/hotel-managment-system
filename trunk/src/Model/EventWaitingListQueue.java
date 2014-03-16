package Model;


import java.util.Iterator;



public class EventWaitingListQueue<EventReservation> implements Iterable<EventReservation> {
    private int Number;         // number of elements on queue
    private Node first;    // beginning of queue
    private Node last;     // end of queue

   
    private class Node {
    	
        private EventReservation eventReservation;
        private Node next;
    }

   /**
     * Create an empty queue.
     */
    public EventWaitingListQueue() {
        first = null;
        last  = null;
        Number = 0;
    }

   /**
     * Is the queue empty?
     */
    public boolean isEmpty() {
        return first == null;
    }

   /**
     * Return the number of items in the queue.
     */
    public int size() {
        return Number;     
    }

   /**
     * Return the item least recently added to the queue.
     * @throws java.util.NoSuchElementException if queue is empty.
     */
    public EventReservation peek() {
   
        return first.eventReservation;
    }

   /**
     * Add the item to the queue.
     */
    public void add(EventReservation eventReservation) {
        Node oldlast = last;
        last = new Node();
        last.eventReservation = eventReservation;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        Number++;
        assert check();
    }

   /**
     * Remove and return the item on the queue least recently added.
     * @throws java.util.NoSuchElementException if queue is empty.
     */
    public EventReservation get() {
        if (isEmpty()) ;
        EventReservation eventReservation = first.eventReservation;
        first = first.next;
        Number--;
        if (isEmpty()) last = null;   // to avoid loitering
        assert check();
        return eventReservation;
    }

   /**
     * Return string representation.
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (EventReservation eventReservation : this)
            s.append(eventReservation + " ");
        return s.toString();
    } 

    // check internal invariants
    private boolean check() {
        if (Number == 0) {
            if (first != null) return false;
            if (last  != null) return false;
        }
        else if (Number == 1) {
            if (first == null || last == null) return false;
            if (first != last)                 return false;
            if (first.next != null)            return false;
        }
        else {
            if (first == last)      return false;
            if (first.next == null) return false;
            if (last.next  != null) return false;

            // check internal consistency of instance variable N
            int numberOfNodes = 0;
            for (Node x = first; x != null; x = x.next) {
               numberOfNodes++;
            }
            if (numberOfNodes != Number) return false;

            // check internal consistency of instance variable last
            Node lastNode = first;
            while (lastNode.next != null) {
               lastNode = lastNode.next;
            }
            if (last != lastNode) return false;
        }

        return true;
    } 
 

   /**
     * Return an iterator that iterates over the items on the queue in FIFO order.
     */
    public Iterator<EventReservation> iterator()  {
        return new ListIterator();  
    }

    
    private class ListIterator implements Iterator<EventReservation> {
        private Node current = first;

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public EventReservation next() {
            if (!hasNext());
            EventReservation eventReservation = current.eventReservation;
            current = current.next; 
            return eventReservation;
        }
    }


}


