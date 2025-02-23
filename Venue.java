public class Venue {
    private int _iD;
    private String _name;
    private String _location;
    private Image _image;
    public Event _event;

    public String getVenueDetails() {
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

    public String getLocation() {
        return this._location;
    }

    public void setLocation(String aLocation) {
        this._location = aLocation;
    }

    public Image getImage() {
        return this._image;
    }

    public void setImage(Image aImage) {
        this._image = aImage;
    }
}