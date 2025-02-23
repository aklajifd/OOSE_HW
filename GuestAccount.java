import java.util.Vector;

public class GuestAccount {
    private int _iD;
    private String _name;
    private String _email;
    private Payment _paymentInfo;
    public Vector<Booking> _booking = new Vector<Booking>();
    public Email _email;
    public Payment _payment;

    public Boolean purchaseAsGuest(Event aEvent, Payment aPayment) {
        throw new UnsupportedOperationException();
    }

    public User registerGuest() {
        throw new UnsupportedOperationException();
    }

    public int getID() {
        return this._iD;
    }

    public void setID(int aID) {
        this._iD = aID;
    }

    public String getName() {
        return this._name;
    }

    public void setName(String aName) {
        this._name = aName;
    }

    public String getEmail() {
        return this._email;
    }

    public void setEmail(String aEmail) {
        this._email = aEmail;
    }

    public Payment getPaymentInfo() {
        return this._paymentInfo;
    }

    public void setPaymentInfo(Payment aPaymentInfo) {
        this._paymentInfo = aPaymentInfo;
    }
}