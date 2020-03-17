package com.example.footballleague.service.Impl;

import com.example.footballleague.model.Team;
import com.example.footballleague.repository.TeamRepository;
import com.example.footballleague.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team save(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public List<Team> teamList() {
        return teamRepository.findAll();
    }

    @Override
    public void deleteTeamById(String id) {

         teamRepository.deleteById(id);
    }

    @Override
    public Optional<Team> findFirstById(String id) {
        return teamRepository.findById(id);
    }

}
