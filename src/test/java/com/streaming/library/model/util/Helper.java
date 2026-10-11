package com.streaming.library.model.util;

import com.streaming.library.model.record.Player;
import com.streaming.library.model.record.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Helper {

    public static Team generateTeam() {
        UUID id = UUID.randomUUID();
        String name = UUID.randomUUID().toString();
        List<Player> players = new ArrayList<>();

        return new Team(id, name, players);
    }
}
