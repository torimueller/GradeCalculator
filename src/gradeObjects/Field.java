package gradeObjects;

public class Field {
	private String name;
	private int numEntries;
	private double entries[];
	
	public Field(String name, int numEntries){
		this.name = name;
		this.numEntries = numEntries;
		entries = new double[this.numEntries];
		
		for(int i = 0; i < this.numEntries; i++){
			entries[i] = 0.0;
		}
	}

}
