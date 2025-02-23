public class Review {
    private int _iD;
    private Integer _rating;
    private String _comment;
    private User _user;
    public User _user;
    public Event _event;

    public Boolean submitReview() {
        throw new UnsupportedOperationException();
    }

    public int getID() {
        return this._iD;
    }

    public void setID(int aID) {
        this._iD = aID;
    }

    public Integer getRating() {
        return this._rating;
    }

    public void setRating(Integer aRating) {
        this._rating = aRating;
    }

    public String getComment() {
        return this._comment;
    }

    public void setComment(String aComment) {
        this._comment = aComment;
    }

    public User getUser() {
        return this._user;
    }

    public void setUser(User aUser) {
        this._user = aUser;
    }
}