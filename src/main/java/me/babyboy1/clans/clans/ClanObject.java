package me.babyboy1.clans.clans;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
public class ClanObject {

    private String name;
    private UUID clanId;
    private UUID leaderId; // Catching Player UUID for Leader
    private Set<UUID> officers, members;
    private int kills, deaths;

    public ClanObject(String name, UUID leaderId) {
        this.name = name;
        this.clanId = UUID.randomUUID();
        this.leaderId = leaderId;
        this.officers = new HashSet<>();
        this.members = new HashSet<>();
    }

}
