package com.example.footballleague.service;

import com.example.footballleague.model.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    Team save(Team team);
    List<Team> teamList();
    void deleteTeamById(String id);
    Team update(Team team);

    Optional<Team> findFirstById(String id);

}
