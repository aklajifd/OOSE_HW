import java.util.Vector;

public class AIRecommendation {
	private int _iD;
    private List<Event> _eventHistory;
    private List<Event> _recommendedEvents;
    public Vector<Event> _event = new Vector<Event>();

    public List<Event> generateRecommendations(User aUser) {
    throw new UnsupportedOperationException();
    }

    public int getID() {
  	return this._iD;
    }

    public void setID(int aID) {
 	this._iD = aID;
    }

    public List<Event> getEventHistory() {
	throw new UnsupportedOperationException();
    }

    public void setEventHistory(List<Event> aEventHistory) {
 	throw new UnsupportedOperationException();
    }

    public List<Event> getRecommendedEvents() {
	throw new UnsupportedOperationException();
    }

    public void setRecommendedEvents(List<Event> aRecommendedEvents) {
	throw new UnsupportedOperationException();
    }
}