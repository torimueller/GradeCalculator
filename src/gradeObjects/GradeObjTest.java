package gradeObjects;

/**
 * 
 * @author Victoria
 *
 *GradeObjTest
 */

public class GradeObjTest {

	public static void main(String[] args) {
		Field fields[] = {new Field("Midterms", 3, .35), new Field("Final", 1, .35)
						, new Field("Quizzes", 5, .3)};
		Course calculus = new Course("Calculus 1", 3);
		
		calculus.setFields(fields);
		
		calculus.addEntryToField(95.0, "Midterms");
		calculus.addEntryToField(80.0, "Quizzes");
		calculus.addEntryToField(90.0, "Quizzes");
		
		System.out.println(calculus.toString());

		
	}

}
