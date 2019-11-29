package nuigalway.app;

import java.util.ArrayList;

public class Module {
	
	private String mName;
	private String mID;
	private ArrayList<Student> studList;
	private ArrayList<Course> assoCourses;
	
	public Module(String mName, String mID, ArrayList<Student> studList, ArrayList<Course> assoCourses) {
		this.mName = mName;
		this.mID = mID;
		this.studList = studList;
		this.assoCourses = assoCourses;
		
		
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmID() {
		return mID;
	}

	public void setmID(String mID) {
		this.mID = mID;
	}

	public ArrayList<Student> getStudList() {
		return studList;
	}

	public void setStudList(ArrayList<Student> studList) {
		this.studList = studList;
	}

	public ArrayList<Course> getAssoCourses() {
		return assoCourses;
	}

	public void setAssoCourses(ArrayList<Course> assoCourses) {
		this.assoCourses = assoCourses;
	}

}
