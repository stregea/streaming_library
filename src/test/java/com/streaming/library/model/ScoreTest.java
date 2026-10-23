package com.streaming.library.model;

import com.streaming.library.model.record.Team;
import com.streaming.library.model.util.ClassTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.streaming.library.model.util.Helper.generateTeam;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Class to contain the unit test(s) for the {@link Score} object.
 *
 * @see Score
 */
public class ScoreTest implements ClassTest {

    private static final Team HOME_TEAM = generateTeam();
    private static final Team AWAY_TEAM = generateTeam();
    private static final List<Team> TEAMS = List.of(HOME_TEAM, AWAY_TEAM);
    private Score score;

    /**
     * Set up the test environment before each test case.
     */
    @BeforeEach
    @Override
    public void setUp() {
        score = new Score(TEAMS);
    }

    /**
     * Test basic assertions against the {@link Score} object.
     */
    @Test
    public void testScore() {
        assertNotNull(score);
        assertEquals(0, score.getScore(HOME_TEAM));
        assertEquals(0, score.getScore(AWAY_TEAM));
    }

    /**
     * Test the addPoints method of the {@link Score} object.
     */
    @Test
    public void testAddPoints() {
        Integer pointsToAdd = 1;

        assertNotNull(score);

        // Validate the Team has a starting Score of 0.
        assertEquals(0, score.getScore(HOME_TEAM));

        // Add 1 point to the team.
        score.addPoints(HOME_TEAM, pointsToAdd);

        // Validate the point was added.
        assertEquals(pointsToAdd, score.getScore(HOME_TEAM));
    }

    /**
     * Test the addPoints method of the {@link Score} object when null values are provided.
     */
    @Test
    public void testAddPointsThrowException() {
        Integer pointsToAdd = 1;
        assertNotNull(score);

        assertThrows(NullPointerException.class, () -> score.addPoints(null, pointsToAdd));
        assertThrows(NullPointerException.class, () -> score.addPoints(HOME_TEAM, null));
    }
}
