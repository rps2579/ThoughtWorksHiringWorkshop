package test.bookCricket.playerTypes;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.bookCricket.playerTypes.BATSMAN_TYPE;
import main.bookCricket.playerTypes.Batsman;

public class BatsmanTest {

	@Test
	public void testHitterPerBallScore() {
		List<Integer> expectedResultSet = new ArrayList<>();
		expectedResultSet.add(0);
		expectedResultSet.add(4);
		expectedResultSet.add(6);

		Batsman batsman = new Batsman(BATSMAN_TYPE.Hitter);
		for (int i=0; i<10; i++) {
			int score = batsman.generateScoreForBall();
			assertTrue(expectedResultSet.contains(score));
		}
		
	}
	
	@Test
	public void testDefensivePerBallScore() {
		List<Integer> expectedResultSet = new ArrayList<>();
		expectedResultSet.add(0);
		expectedResultSet.add(1);
		expectedResultSet.add(2);
		expectedResultSet.add(3);

		Batsman batsman = new Batsman(BATSMAN_TYPE.Defensive);
		for (int i=0; i<10; i++) {
			int score = batsman.generateScoreForBall();
			assertTrue(expectedResultSet.contains(score));
		}

	}

	@Test
	public void testNormalBatsmanPerBallScore() {
		Batsman batsman = new Batsman(BATSMAN_TYPE.Normal);
		
		for (int i=0; i<10; i++) {
			int score = batsman.generateScoreForBall();
			assertTrue(0 <= score && score <= 9);
		}
	}
	
}
