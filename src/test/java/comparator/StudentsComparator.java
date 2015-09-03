package comparator;

import com.lits.team2.StudentDTO;
import java.util.Comparator;

public class StudentsComparator implements Comparator<StudentDTO>  {

	public int compare(StudentDTO student1, StudentDTO student2) {
		// sort by first name
		int result = student1.getFirstName().compareTo(student2.getFirstName());
		if(0 != result){
			return result;
		}		  
	    // if first name equal, sort by last name
		result = student1.getLastName().compareTo(student2.getLastName());
		if(0 != result){
			return result;
		}
		// if last name equal, sort by course
	    result = student1.getCourse().compareTo(student2.getCourse());
	    if(0 != result){
			return result;
		}
	    // if course equal, sort by age
	    result = student1.getAge() - student2.getAge();
	    if(0 != result){
			return result;
		}
	    // if all the above is equal the data identical
	    return 0;
	}
}
