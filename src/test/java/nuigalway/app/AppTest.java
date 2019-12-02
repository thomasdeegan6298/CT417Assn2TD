package nuigalway.app;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Test;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * Unit test for Assignment 2 CT417 Thomas Deegan.
 */
public class AppTest 
{
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Module> modules = new ArrayList<Module>();
    
    private DateTime start = DateTime.parse("01/09/2016 00:00:00", DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));
    private DateTime end = DateTime.parse("01/06/2020 00:00:00", DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));
    private Course compEng;
	
    private Module softEng;
    private Module ML;
    private Module DSP;
    private Module SoC;
    private Module TSA;
    
    private Student me;
    private Student him;
    private Student her;
    private Student them;
    
    private DateTime dob0 = DateTime.parse("27/06/1998 00:00:00", DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));
    private DateTime dob1 = DateTime.parse("15/04/1999 00:00:00", DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));
    private DateTime dob2 = DateTime.parse("02/06/1996 00:00:00", DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));
    private DateTime dob3 = DateTime.parse("30/03/1997 00:00:00", DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));
    
    @Test
    public void shouldAnswerWithTrue()
    {
    	softEng = new Module("Software Engineering", "CT417", students, courses);
    	ML = new Module("Machine Learning", "CT4101", students, courses);
    	DSP = new Module("Digital Signal Processing", "EE445", students, courses);
    	SoC = new Module("System on Chip Design", "EE452", students, courses);
    	TSA = new Module("Telecommunications", "EE453", students, courses);
    	
    	modules.add(softEng);
    	modules.add(ML);
    	modules.add(DSP);
    	modules.add(SoC);
    	modules.add(TSA);
    	
    	me = new Student("Thomas Deegan", dob0, 16446562, courses, modules);
    	him = new Student("John Smith", dob1, 16446563, courses, modules);
    	her = new Student("Stephanie Kenny", dob2, 16446564, courses, modules);
    	them = new Student("Alex Jones", dob3, 16446565, courses, modules);
    	
    	students.add(me);
    	students.add(him);
    	students.add(her);
    	students.add(them);
    	
    	compEng = new Course("ECE", modules, students, start, end);
    	courses.add(compEng);
    	
    	boolean failed = false;
    	
    	for(Course c : courses) {
    		ArrayList<Student> studs = c.getEnrolStuds();
    		for(Student s : studs) {
    			if(!(s.getUsername().equals("ThomasDeegan21") || s.getUsername().equals("JohnSmith20") || s.getUsername().equals("StephanieKenny23") || s.getUsername().equals("AlexJones22"))) {
    				failed = true;
    				System.out.println(s.getUsername());
    			}
    		}
    	}
    	
    	if(!failed) {
    		assertTrue( true );
    	}else {
    		assertTrue( false );
    	}
    }
}
