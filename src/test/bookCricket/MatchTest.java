package test.bookCricket;

import org.junit.Test;

import main.bookCricket.Match;
import main.bookCricket.playerTypes.BATSMAN_TYPE;
import main.bookCricket.playerTypes.Batsman;
import main.bookCricket.playerTypes.Bowler;

public class MatchTest {

	@Test
	public void testNormalBatsman() {
		Batsman batsman = new Batsman(BATSMAN_TYPE.Normal);
		Bowler bowler = new Bowler();

		Match match = new Match(batsman, bowler);

		match.announceResult(match.runMatch(2, 30));
	}

	@Test
	public void testHitter() {
		Batsman batsman = new Batsman(BATSMAN_TYPE.Hitter);
		Bowler bowler = new Bowler();

		Match match = new Match(batsman, bowler);

		match.announceResult(match.runMatch(1, 25));
	}
	
	@Test
	public void testDefensive() {
		Batsman batsman = new Batsman(BATSMAN_TYPE.Defensive);
		Bowler bowler = new Bowler();

		Match match = new Match(batsman, bowler);

		match.announceResult(match.runMatch(3, 13));
	}

}
