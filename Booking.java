import java.util.Vector;

public class Booking {
  private int _iD;
  private User _user;
  private Payment _payment;
  private Event _event;
  private Integer _numOfTickets;
  public Payment _payment;
  public GuestAccount _guestAccount;
  public User _user;
  public Event _event;
  public Email _email;
  public Vector<Ticket> _ticket = new Vector<Ticket>();

  public Boolean completeBooking() {
  	throw new UnsupportedOperationException();
  }

  public int getID() {
	return this._iD;
  }

  public void setID(int aID) {
	this._iD = aID;
  }

  public User getUser() {
	return this._user;
  }

  public void setUser(User aUser) {
	this._user = aUser;
  }

  public Payment getPayment() {
	return this._payment;
  }

  public void setPayment(Payment aPayment) {
	this._payment = aPayment;
  }

  public Event getEvent() {
	return this._event;
  }

  public void setEvent(Event aEvent) {
	this._event = aEvent;
  }

  public Integer getNumOfTickets() {
	return this._numOfTickets;
  }

  public void setNumOfTickets(Integer aNumOfTickets) {
	this._numOfTickets = aNumOfTickets;
  }
}