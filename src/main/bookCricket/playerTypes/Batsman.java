/**
 * 
 */
package main.bookCricket.playerTypes;

/**
 * @author Pranay
 *
 */
public class Batsman extends Player {
	
	private BATSMAN_TYPE type;
	
	public Batsman(BATSMAN_TYPE type) {
		super();
		this.type = type;
	}
	
	@Override
	public int generateScoreForBall() {
		currScore = type.getPossibleValues()[random.nextInt(type.getPossibleValues().length)];
		
		return this.currScore;
	}
	
	public BATSMAN_TYPE getBatsmanType() {
		return type;
	}
	
}
