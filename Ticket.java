import java.util.Date;

public class Ticket {
    private int _iD;
    private User _user;
    private Event _event;
    private Date _purchaseDate;
    private Double _price;
    public User __user;
    public Event __event;
    public Booking _booking;
    public Email _email;

    public Ticket generateTicket() {
        throw new UnsupportedOperationException();
    }

    public Email sendConEmail(String aRecipient, String aSubject, String aBody, Date aSentDate) {
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

    public Event getEvent() {
        return this._event;
    }

    public void setEvent(Event aEvent) {
        this._event = aEvent;
    }

    public Date getPurchaseDate() {
        return this._purchaseDate;
    }

    public void setPurchaseDate(Date aPurchaseDate) {
        this._purchaseDate = aPurchaseDate;
    }

    public Double getPrice() {
        return this._price;
    }

    public void setPrice(Double aPrice) {
        this._price = aPrice;
    }
}