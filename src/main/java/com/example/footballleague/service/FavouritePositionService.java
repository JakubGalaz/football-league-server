package com.example.footballleague.service;



import com.example.footballleague.model.FavouritePosition;

import java.util.List;
import java.util.Optional;

public interface FavouritePositionService {

    FavouritePosition save(FavouritePosition favouritePosition);
    List<FavouritePosition> favouritePositionList();

    Optional<FavouritePosition> findFirstById(String id);

    void deleteFavouritePositionById(String id);
}
