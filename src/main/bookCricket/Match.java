package main.bookCricket;

import main.bookCricket.playerTypes.Batsman;
import main.bookCricket.playerTypes.Bowler;

/**
 * @author Pranay
 *
 */
public class Match {

	Batsman batsman;
	Bowler bowler;

	public Match(Batsman batsman, Bowler bowler) {
		this.batsman = batsman;
		this.bowler = bowler;
	}
	
	/**
	 * @return score of batsman <br>
	 *         or <br>
	 *         <strong>-1</strong> if batsman is out
	 */
	public int eventBall() {
		System.out.println("Batsman: " + batsman.generateScoreForBall());
		System.out.println("Bowler: " + bowler.generateScoreForBall());

		if (bowler.getCurrScore() == batsman.getCurrScore())
			return -1;
		else
			return batsman.getCurrScore();
	}

	/**
	 * 
	 * @param noOfOvers 
	 * @param target
	 * @return <strong>true</strong> if batsman wins <br>
	 *         <strong>false</strong> otherwise
	 */
	public boolean runMatch(int noOfOvers, int target) {
		int score = 0;
		int ballDetail;

		System.out.println("=====================" + batsman.getBatsmanType().getType() + "=====================");
		System.out.print("Target: " + target);
		for (int i = 0; i < 6 * noOfOvers; i++) {
			System.out.println("\nOver: " + ((i+1)/6+1) + ", Ball: " + (i + 1)%6);

			ballDetail = this.eventBall();
			if (ballDetail == -1)
				return false;

			score += ballDetail;
			if (score > target)
				return true;
		}
		return false;
	}
	
	public void announceResult(boolean matchResult) {
		System.out.println(matchResult ? "\nBatsman has won.\n" : "\nBatsman has lost.\n");
	}
	
}
