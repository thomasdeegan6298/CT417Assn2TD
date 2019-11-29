package nuigalway.app;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
	
	private String cName;
	private ArrayList<Module> modList;
	private ArrayList<Student> enrolStuds;
	private DateTime startDate;
	private DateTime endDate;
	
	public Course(String cName, ArrayList<Module> modList, ArrayList<Student> enrolStuds, DateTime startDate, DateTime endDate) {
		this.cName = cName;
		this.modList = modList;
		this.enrolStuds = enrolStuds;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public ArrayList<Module> getModList() {
		return modList;
	}

	public void setModList(ArrayList<Module> modList) {
		this.modList = modList;
	}

	public ArrayList<Student> getEnrolStuds() {
		return enrolStuds;
	}

	public void setEnrolStuds(ArrayList<Student> enrolStuds) {
		this.enrolStuds = enrolStuds;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	
}
