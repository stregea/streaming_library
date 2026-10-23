package com.streaming.library.model.util;

import com.streaming.library.model.record.Player;
import com.streaming.library.model.record.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Helper class to provide utility methods for unit tests.
 */
public class Helper {

    /**
     * Generate a {@link Team} instance with random values for testing purposes.
     *
     * @return a {@link Team} instance with random values.
     */
    public static Team generateTeam() {
        UUID id = UUID.randomUUID();
        String name = UUID.randomUUID().toString();
        List<Player> players = new ArrayList<>();

        return new Team(id, name, players);
    }
}
