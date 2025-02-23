public class Email {
	private int _iD;
	private String _subject;
	private String _recipient;
	private String _body;
	private Date _sentDate;
	public User _user;
	public GuestAccount _guestAccount;
	public Ticket _ticket;
	public Booking _booking;

	public Boolean sendEmail() {
		throw new UnsupportedOperationException();
	}

	public int getID() {
		return this._iD;
	}

	public void setID(int aID) {
		this._iD = aID;
	}

	public String getSubject() {
		return this._subject;
	}

	public void setSubject(String aSubject) {
		this._subject = aSubject;
	}

	public String getRecipient() {
		return this._recipient;
	}

	public void setRecipient(String aRecipient) {
		this._recipient = aRecipient;
	}

	public String getBody() {
		return this._body;
	}

	public void setBody(String aBody) {
		this._body = aBody;
	}

	public Date getSentDate() {
		return this._sentDate;
	}

	public void setSentDate(Date aSentDate) {
		this._sentDate = aSentDate;
	}
}