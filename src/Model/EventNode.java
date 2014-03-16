package Model;

public class EventNode {
	
  private Event event;
  private EventNode next;
  
  
  public EventNode(){
	  
	  
  }

  public EventNode(Event newEvent) {   
	  
	event = newEvent;
    next = null;
  }

  public EventNode(Event newEvent, EventNode nextEvent) {
	  
	  event = newEvent;
	  next = nextEvent;
  }


public void setEvent(Event newEvent) {
	event = newEvent;
  } 

  public Event getEvent() {
    return event;
  } 

public void setNext(EventNode nextEvent) {
    next = nextEvent;
  } 

  public EventNode getNext() {
    return next;
  } 
} 
