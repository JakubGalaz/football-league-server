package com.example.footballleague.helper;

import com.example.footballleague.model.Goal;
import com.example.footballleague.model.Player;
import com.example.footballleague.model.Protocol;
import com.example.footballleague.model.Team;
import com.example.footballleague.repository.PlayerRepository;
import com.example.footballleague.service.ProtocolService;
import com.example.footballleague.service.TeamService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MongoData {

    public final PlayerRepository playerRepository;
    public final SequenceGeneratorService sequenceGeneratorService;
    public final ProtocolService protocolService;
    public final TeamService teamService;

    public MongoData(PlayerRepository playerRepository, SequenceGeneratorService sequenceGeneratorService, ProtocolService protocolService, TeamService teamService) {
        this.playerRepository = playerRepository;
        this.sequenceGeneratorService = sequenceGeneratorService;
        this.protocolService = protocolService;
        this.teamService = teamService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {

     playerRepository.deleteAll();
        System.out.println("Add Player");

        String id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
       Player player1 = new Player(id, "Jakub", "Gałązka", 23, "Coco Jambo Warszawa", "Napastnik", 12,
              12,2,3);
       id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player2 = new Player(id, "Paweł", "Brożek", 19, "Coco Jambo Warszawa", "Napastnik", 1,
                12,2,3);

        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player3 = new Player(id, "Krzysztof", "Jerzyna", 17, "Coco Jambo Warszawa", "Prawy obrońca", 1,
                2,1,3);

        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player4 = new Player(id, "Maciej", "Nowak", 19, "Coco Jambo Warszawa", "Napastnik", 11,
                13,2,3);

        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player5 = new Player(id, "Artur", "Lewandowski", 29, "Coco Jambo Warszawa", "Lewy Skrzydłowy", 1,
                12,6,2);

        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player6 = new Player(id, "Paweł", "Brożek", 19, "Coco Jambo Warszawa", "Obrońca", 1,
                22,2,3);

        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player7 = new Player(id, "Michał", "Jędrzejczyk", 19, "Coco Jambo Warszawa", "Napastnik", 1,
                12,2,3);

        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player8 = new Player(id, "Jakub", "Cebulka", 24, "Coco Jambo Warszawa", "Napastnik", 12,
                1,2,3);

        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player9 = new Player(id, "Przemek", "Brożek", 19, "Coco Jambo Warszawa", "Napastnik", 1,
                12,2,3);

        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player10 = new Player(id, "Dominik", "Jachaś", 19, "Coco Jambo Warszawa", "Napastnik", 4,
                12,2,3);
        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player11 = new Player(id, "Dominik", "Jachaś", 19, "Coco Jambo Warszawa", "Napastnik", 4,
                12,2,3);
        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player12 = new Player(id, "Dominik", "Jachaś", 19, "Coco Jambo Warszawa", "Napastnik", 4,
                12,2,3);
        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player13 = new Player(id, "Dominik", "Jachaś", 19, "Korona Jurkowice", "Napastnik", 4,
                12,2,3);
        id = String.valueOf(sequenceGeneratorService.generateSequence(Player.SEQUENCE_NAME));
        Player player14 = new Player(id, "Dominik", "Jachaś", 19, "Korona Jurkowice", "Napastnik", 4,
                12,2,3);


        playerRepository.save(player1);
        playerRepository.save(player2);
        playerRepository.save(player3);
        playerRepository.save(player4);
        playerRepository.save(player5);
        playerRepository.save(player6);
        playerRepository.save(player7);
        playerRepository.save(player8);
        playerRepository.save(player9);
        playerRepository.save(player10);
        playerRepository.save(player11);
        playerRepository.save(player12);
        playerRepository.save(player13);
        playerRepository.save(player14);


        Goal goal1 = new Goal("1", player1, player2, 69);
        Goal goal2 = new Goal("2", player3, player2, 11);
        Goal goal3 = new Goal("3", player5, player6, 44);
         Goal hostGoals[] = {goal1,goal2};
         Goal guestGoals[] = {goal3};
         Player hostPlayers[] = {player1,player2,player3};
         Player guestPlayers[] = {player4,player5,player6,player7};

        Protocol protocol1 = new Protocol("1", "Coco Jambo Warszawa", "Korona Jurkowice", hostGoals, guestGoals,
                "Szymon Marciniak", hostPlayers, guestPlayers, "Super mecz");

        protocolService.save(protocol1);


        Team team1 = new Team("1", "Coco Jambo Warszawa", "Jose Mourinho", "Park de prę", hostPlayers);
        Team team2 = new Team("2", "Korona Jurkowice", "Carlo Anceloti", "Estadio Sadnitago Berabeu", guestPlayers);

        teamService.save(team1);
        teamService.save(team2);






//        Player player2 = new Player("sdsadaaqqwe12", "32", "dsadd", 12, "FCB", "Napastnik", 12,
//                12,2,3);
//        Player player3 = new Player("sdsadaaqqwe12", "32", "dsadd", 12, "FCB", "Napastnik", 12,
//                12,2,3);


//
//        playerRepository.save(player1);

    }


}


