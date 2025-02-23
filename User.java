import java.util.Vector;
import java.util.List;
import java.awt.Image;

public class User {
    private int _iD;
    private String _username;
    private String _password;
    private String _email;
    private Image _profilePicture;
    private List<Payment> _savedPaymentMethods;
    private Double _distancePreference;
    private String _userID;
    public Vector<Payment> _payment = new Vector<Payment>();
    public Vector<Ticket> _ticket = new Vector<Ticket>();
    public Vector<Review> _review = new Vector<Review>();
    public Vector<Booking> _booking = new Vector<Booking>();
    public Vector<Email> __email = new Vector<Email>();

    public Boolean login() {
        throw new UnsupportedOperationException();
    }

    public Boolean createAccount() {
        throw new UnsupportedOperationException();
    }

    public Boolean editProfile() {
        throw new UnsupportedOperationException();
    }

    public List<Event> viewEventHistory() {
        throw new UnsupportedOperationException();
    }

    public Boolean addReview(Event aEvent, Review aReview) {
        throw new UnsupportedOperationException();
    }

    public int getID() {
        return this._iD;
    }

    public void setID(int aID) {
        this._iD = aID;
    }

    public String getUsername() {
        return this._username;
    }

    public void setUsername(String aUsername) {
        this._username = aUsername;
    }

    public void setPassword(String aPassword) {
        this._password = aPassword;
    }

    public String getEmail() {
        return this._email;
    }

    public void setEmail(String aEmail) {
        this._email = aEmail;
    }

    public Image getProfilePicture() {
        return this._profilePicture;
    }

    public void setProfilePicture(Image aProfilePicture) {
        this._profilePicture = aProfilePicture;
    }

    public List<Payment> getSavedPaymentMethods() {
        throw new UnsupportedOperationException();
    }

    public void setSavedPaymentMethods(List<Payment> aSavedPaymentMethods) {
        throw new UnsupportedOperationException();
    }

    public Double getDistancePreference() {
        return this._distancePreference;
    }

    public void setDistancePreference(Double aDistancePreference) {
        this._distancePreference = aDistancePreference;
    }

    public String getUserID() {
        return this._userID;
    }

    public void setUserID(String aUserID) {
        this._userID = aUserID;
    }
}