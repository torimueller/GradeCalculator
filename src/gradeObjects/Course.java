package gradeObjects;

/**
 * 
 * @author Victoria Mueller
 *
 * Course contains all the fields that make up the
 * overall grade in a class. 
 */
public class Course {

	private String name;
	private Field fields[];
	private int numFields;
	
	public Course(String name, int numFields){
		this.name = name;
		this.numFields = numFields;
		fields = new Field[numFields];
	}
	
	public void setFields(Field fields[]){
		for(int i = 0; i < numFields; i++){
			this.fields[i] = new Field(fields[i]);
		}
	}
	
	public Field[] getFields(){
		return fields;
	}
	

	public String toString(){
		String str = "";
		for(Field field : fields){
			str = str.concat(field.toString()) + "\n";
		}
		
		return str;
	}
	
}
