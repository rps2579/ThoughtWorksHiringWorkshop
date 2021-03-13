package main.bookCricket.playerTypes;

import java.util.Random;

abstract class Player {

	protected final Random random;
	protected int currScore;

	public Player() {
		random = new Random();
	}

	public int generateScoreForBall() {
		this.currScore = this.random.nextInt(10);
		return this.currScore;
	}
	
	public int getCurrScore() {
		return currScore;
	}

}
