package com.streaming.library.model.record;

import com.streaming.library.enums.position.Position;
import com.streaming.library.enums.position.soccer.SoccerPosition;
import com.streaming.library.model.util.RecordTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Class to contain the unit test(s) for the {@link Player} record.
 *
 * @see Player
 */
public class PlayerTest implements RecordTest {

    /**
     * Test basic assertions against the {@link Player} record.
     */
    @Test
    @Override
    public void testRecord() {
        UUID id = UUID.randomUUID();
        String name = "Lionel Messi";
        Position position = SoccerPosition.FORWARD;

        Player player = new Player(id, name, position);

        assertNotNull(player);
        assertEquals(id, player.id());
        assertEquals(name, player.name());
        assertEquals(position, player.position());
    }
}
