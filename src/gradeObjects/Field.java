package gradeObjects;

/**
 * 
 * @author Victoria Mueller
 * 
 * Field contains all entries of a certain section
 * of grades(such as quizzes or homework) that make up a partial
 * percentage of the overall grade in a class
 * with the option to drop the lowest entry if specified.
 *
 */

public class Field {
	private String name;//the name of this field (ex: "Quizzes")
	private double weight; //the percentage(in decimal) of the overall grade this field makes up (ex: 0.30)
	private int numEntries;
	private int currEntry;
	private double entries[];
	private boolean dropLowest;//true if this field drops the lowest entry, false if not
	
	public Field(String name, int numEntries, double weight){
		this.name = name;
		this.weight = weight;
		this.numEntries = numEntries;
		currEntry = 0;
		entries = new double[this.numEntries];
		
		for(int i = 0; i < this.numEntries; i++){
			entries[i] = 0.0;
		}
	}
	
	public Field(Field other){
		name = other.name;
		weight = other.weight;
		numEntries = other.numEntries;
		entries = other.entries;
		dropLowest = other.dropLowest;
		currEntry = 0;
		
	}

	public String getName(){
		return name;
	}
	
	public void addEntry(double entry){
		entries[currEntry] = entry;
		currEntry++;
	}

	public String toString(){
		String str = name + ": " + (weight * 100) + "%\n";
		for(int i = 0; i < numEntries; i ++){
			str = str.concat(entries[i] + " ");
		}
		return str + "\n";
	}

}
