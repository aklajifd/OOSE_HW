import java.util.Vector;

public class Event {
    private int _iD;
    private String _name;
    private Date _date;
    private String _venue;
    private String _genre;
    private Double _price;
    private String _artist;
    public Venue _venue;
    public AIRecommendation _aPRecommendation;
    public Vector<Review> _review = new Vector<Review>();
    public Vector<Booking> _booking = new Vector<Booking>();
    public Vector<Ticket> _ticket = new Vector<Ticket>();

    public String getDetails() {
	throw new UnsupportedOperationException();
    }

    public Boolean addReview(Review aReview) {
	throw new UnsupportedOperationException();
    }

    public List<Event> filterByGenre(List<Event> aEvents, String aGenre) {
	throw new UnsupportedOperationException();
    }

    public List<Event> filterByPrice(List<Event> aEvents, Double aMinPrice, Double aMaxPrice) {
	throw new UnsupportedOperationException();
    }

    public List<Event> filterByVenue(List<Event> aEvents, String aVenue) {
	throw new UnsupportedOperationException();
    }

    public List<Event> filterByDate(List<Event> aEvents, Date aDate) {
	throw new UnsupportedOperationException();
    }

    public List<Event> filterByArtist(List<Event> aEvents, String aArtist) {
	throw new UnsupportedOperationException();
    }

    public int getID(){
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

    public Date getDate() {
	return this._date;
    }

    public void setDate(Date aDate) {
	this._date = aDate;
    }

    public String getVenue() {
	return this._venue;
    }

    public void setVenue(String aVenue) {
	this._venue = aVenue;
    }

    public String getGenre() {
	return this._genre;
    }

    public void setGenre(String aGenre) {
	this._genre = aGenre;
    }

    public Double getPrice() {
	return this._price;
    }

    public void setPrice(Double aPrice) {
	this._price = aPrice;
    }

    public String getArtist() {
	return this._artist;
    }

    public void setArtist(String aArtist) {
	this._artist = aArtist;
    }
}