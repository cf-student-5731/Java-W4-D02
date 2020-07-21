package bankAccout;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class History {
	private float transaction;
	GregorianCalendar today;
	boolean accepted;
	SimpleDateFormat dateFormat = new SimpleDateFormat("kk:mm dd.MM.yyyy");

	public History(float transaction, boolean accepted) {
		this.transaction = transaction;
		this.today = (GregorianCalendar) Calendar.getInstance();
		this.accepted = accepted;
	}

	public String getTransaction(){
		if(this.accepted) {
			if (this.transaction > 0) {
				return String.format("+%.2f", this.transaction);
			} else {
				return String.format("%.2f", this.transaction);
			}
		} else{
			return String.format("%.2f CANCEL", this.transaction);
		}
	}

	public String getDate(){
		return dateFormat.format(this.today.getTime());
	}
}
