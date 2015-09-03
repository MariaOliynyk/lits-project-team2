package comparator;

import com.lits.team2.StudentDTO;
import java.util.Comparator;

public class StudentsComparator implements Comparator<StudentDTO>  {

	public int compare(StudentDTO students1, StudentDTO students2) {
		// sort by first name
		int result = students1.getFirstName().compareTo(students2.getFirstName());
		if(0 != result){
			return result;
		}		  
	    // if first name equal, sort by last name
		result = students1.getLastName().compareTo(students2.getLastName());
		if(0 != result){
			return result;
		}
		// if last name equal, sort by course
	    result = students1.getCourse().compareTo(students2.getCourse());
	    if(0 != result){
			return result;
		}
	    // if course equal, sort by age
	    result = students1.getAge() - students2.getAge();
	    if(0 != result){
			return result;
		}
	    // if all the above is equal the data identical
	    return 0;
	}
}
