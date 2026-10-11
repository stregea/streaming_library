package com.streaming.library.model.record;

import com.streaming.library.model.util.RecordTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Class to contain the unit test(s) for the {@link Team} record.
 *
 * @see Team
 */
public class TeamTest implements RecordTest {

    /**
     * Test basic assertions against the {@link Team} record.
     */
    @Test
    @Override
    public void testRecord() {
        UUID id = UUID.randomUUID();
        String name = "Test Team";
        List<Player> players = new ArrayList<>();

        Team team = new Team(id, name, players);

        assertNotNull(team);
        assertEquals(id, team.id());
        assertEquals(name, team.name());
        assertEquals(players, team.players());
    }
}
