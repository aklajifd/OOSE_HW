public class Payment {
    private int _iD;
    private Double _amount;
    private String _paymentMethod;
    public User _user;
    public GuestAccount _guestAccount;
    public Booking _booking;

    public Payment processPayment() {
        throw new UnsupportedOperationException();
    }

    public int getID() {
        return this._iD;
    }

    public void setID(int aID) {
        this._iD = aID;
    }

    public Double getAmount() {
        return this._amount;
    }

    public void setAmount(Double aAmount) {
        this._amount = aAmount;
    }

    public String getPaymentMethod() {
        return this._paymentMethod;
    }

    public void setPaymentMethod(String aPaymentMethod) {
        this._paymentMethod = aPaymentMethod;
    }
}