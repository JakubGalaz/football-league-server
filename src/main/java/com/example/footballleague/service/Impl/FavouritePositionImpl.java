package com.example.footballleague.service.Impl;

import com.example.footballleague.model.FavouritePosition;
import com.example.footballleague.repository.FavouritePositionRepository;
import com.example.footballleague.service.FavouritePositionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FavouritePositionImpl implements FavouritePositionService {
    private final FavouritePositionRepository favouritePositionRepository;

    public FavouritePositionImpl(FavouritePositionRepository favouritePositionRepository) {
        this.favouritePositionRepository = favouritePositionRepository;
    }

        @Override
    public FavouritePosition save(FavouritePosition favouritePosition){

        return favouritePositionRepository.save(favouritePosition);
    }

    @Override
    public List<FavouritePosition> favouritePositionList() {
        return favouritePositionRepository.findAll();
    }

    @Override
    public Optional<FavouritePosition> findFirstById(String id) {
        return favouritePositionRepository.findById(id);
    }

    @Override
    public void deleteFavouritePositionById(String id) {
favouritePositionRepository.deleteById(id);
    }


}
