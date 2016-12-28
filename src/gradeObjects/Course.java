package gradeObjects;

public class Course {

	private String name;
	private Field fields[];
	private int numFields;
	
	public Course(String name, int numFields){
		this.name = name;
		this.numFields = numFields;
		fields = new Field[numFields];
	}
	
}
