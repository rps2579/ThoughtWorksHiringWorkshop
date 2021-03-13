package test.bookCricket.playerTypes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.bookCricket.playerTypes.Bowler;

public class BowlerTest {

	@Test
	public void testBowlerPerBallScore() {
		Bowler bowler = new Bowler();
		
		for (int i=0; i<10; i++) {
			int score = bowler.generateScoreForBall();
			assertTrue(0 <= score && score <= 9);
		}
	}
	
}
