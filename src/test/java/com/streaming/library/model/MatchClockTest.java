package com.streaming.library.model;

import com.streaming.library.model.util.ClassTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Class to contain the unit test(s) for the {@link MatchClock} object.
 *
 * @see MatchClock
 */
public class MatchClockTest implements ClassTest {
    private final Integer REMAINING_SECONDS = 90;
    private MatchClock matchClock;

    @BeforeEach
    @Override
    public void setUp() {
        matchClock = new MatchClock(REMAINING_SECONDS);
    }

    @Test
    public void testMatchClock() {
        assertNotNull(matchClock);
        assertEquals(REMAINING_SECONDS, matchClock.getRemainingSeconds());
        assertEquals(Boolean.FALSE, matchClock.isExpired());
    }

    @Test
    public void testAdvance() {
        Integer secondsToAdvance = 5;

        matchClock.advance(secondsToAdvance);

        assertEquals(REMAINING_SECONDS - secondsToAdvance, matchClock.getRemainingSeconds());
        assertEquals(Boolean.FALSE, matchClock.isExpired());
    }

    @Test
    public void testAdvanceToZero() {
        matchClock.advance(REMAINING_SECONDS);

        assertEquals(0, matchClock.getRemainingSeconds());
        assertEquals(Boolean.TRUE, matchClock.isExpired());
    }

    @Test
    public void testReset() {
        Integer timeToReset = 5;

        matchClock.reset(timeToReset);

        assertEquals(timeToReset, matchClock.getRemainingSeconds());
        assertEquals(Boolean.FALSE, matchClock.isExpired());
    }
}
