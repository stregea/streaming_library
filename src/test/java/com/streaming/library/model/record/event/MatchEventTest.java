package com.streaming.library.model.record.event;

import com.streaming.library.enums.EventType;
import com.streaming.library.enums.Sport;
import com.streaming.library.model.util.RecordTest;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Class to contain the unit test(s) for the {@link MatchEvent} record.
 *
 * @see MatchEvent
 */
public class MatchEventTest implements RecordTest {

    /**
     * Test basic assertions against the {@link MatchEvent} record.
     */
    @Test
    @Override
    public void testRecord() {
        UUID id = UUID.randomUUID();
        UUID matchId = UUID.randomUUID();
        Sport sport = Sport.SOCCER;
        EventType eventType = EventType.GOAL;
        Instant when = Instant.now();
        Map<String, Object> payload = Map.of("key", "value");

        MatchEvent matchEvent = new MatchEvent(id, matchId, sport, eventType, when, payload);

        assertNotNull(matchEvent);
        assertEquals(id, matchEvent.id());
        assertEquals(matchId, matchEvent.matchId());
        assertEquals(sport, matchEvent.sport());
        assertEquals(eventType, matchEvent.eventType());
        assertEquals(when, matchEvent.timestamp());
        assertEquals(payload, matchEvent.payload());
    }
}
