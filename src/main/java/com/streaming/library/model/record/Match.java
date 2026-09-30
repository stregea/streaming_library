package com.streaming.library.model.record;

import com.streaming.library.enums.Sport;

import java.util.UUID;

/**
 * Record that will represent a {@code Match}.
 *
 * @param id       The {@link UUID} of the Match.
 * @param sport    The sport of the match.
 * @param homeTeam The home team.
 * @param awayTeam The away team.
 * @see Sport
 * @see Team
 */
public record Match(UUID id, Sport sport, Team homeTeam, Team awayTeam) {
}
