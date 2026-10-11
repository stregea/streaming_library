package com.streaming.library.model.record;

import com.streaming.library.enums.Sport;
import com.streaming.library.model.util.RecordTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static com.streaming.library.model.util.Helper.generateTeam;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Class to contain the unit test(s) for the {@link Match} record.
 *
 * @see Match
 */
public class MatchTest implements RecordTest {

    /**
     * Test basic assertions against the {@link Match} record.
     */
    @Test
    @Override
    public void testRecord() {
        UUID id = UUID.randomUUID();
        Sport sport = Sport.SOCCER;
        Team homeTeam = generateTeam();
        Team awayTeam = generateTeam();

        Match match = new Match(id, sport, homeTeam, awayTeam);

        assertNotNull(match);
        assertEquals(id, match.id());
        assertEquals(sport, match.sport());
        assertEquals(homeTeam, match.homeTeam());
        assertEquals(awayTeam, match.awayTeam());
    }
}
