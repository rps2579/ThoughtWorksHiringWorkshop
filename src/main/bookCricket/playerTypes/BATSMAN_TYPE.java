/**
 * 
 */
package main.bookCricket.playerTypes;

/**
 * @author Pranay
 *
 */
public enum BATSMAN_TYPE {
	
	Defensive("Defensive", new Integer[] {0,1,2,3}), 
	Hitter("Hitter", new Integer[] {0,4,6}), 
	Normal("Normal", new Integer[] {0,1,2,3,4,5,6,7,8,9});
	
	BATSMAN_TYPE(String type, Integer[] possibleValues) {
		this.type = type;
		this.possibleValues = possibleValues;
	}
	
	private String type;
	private Integer[] possibleValues;
	
	public String getType() {
		return type;
	}
	
	public Integer[] getPossibleValues() {
		return possibleValues;
	}
	
}
