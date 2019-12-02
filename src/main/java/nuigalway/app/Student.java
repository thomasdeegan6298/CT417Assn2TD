package nuigalway.app;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.joda.time.Period;

public class Student {
	private String name;
	private Integer age;
	private DateTime DOB;
	private long ID;
	private String username;
	private ArrayList<Course> regCourses;
	private ArrayList<Module> regMods;
	
	public Student(String name, DateTime DOB, long ID, ArrayList<Course> regCourses, ArrayList<Module> regMods) {
		this.name = name;
		Period period = new Period(DOB, DateTime.now());
		this.age = period.getYears();
		this.DOB = DOB;
		this.ID = ID;
		this.regCourses = regCourses;
		this.regMods = regMods;
		this.username = setUsername(name, age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public DateTime getDOB() {
		return DOB;
	}

	public void setDOB(DateTime dOB) {
		DOB = dOB;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getUsername() {
		return username;
	}

	public ArrayList<Course> getRegCourses() {
		return regCourses;
	}

	public void setRegCourses(ArrayList<Course> regCourses) {
		this.regCourses = regCourses;
	}

	public ArrayList<Module> getRegMods() {
		return regMods;
	}

	public void setRegMods(ArrayList<Module> regMods) {
		this.regMods = regMods;
	}

	public String setUsername(String ainm, Integer aois) {
		String uName = ainm+aois.toString();
		return uName;
	}
}
