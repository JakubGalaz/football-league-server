package com.example.footballleague.controller;


import com.example.footballleague.model.FavouritePosition;
import com.example.footballleague.service.FavouritePositionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class FavouritePositionController {

private final FavouritePositionService favouritePositionService;

    public FavouritePositionController(FavouritePositionService favouritePositionService) {
        this.favouritePositionService = favouritePositionService;
    }


    @PostMapping("/saveFavouritePosition")
    public ResponseEntity create(@RequestBody FavouritePosition favouritePosition)
    {
        System.out.println("CREATE favourite postion");
        return ResponseEntity.ok(favouritePositionService.save(favouritePosition));
    }






@DeleteMapping("/deleteFavouritePosition/{id}")
    public void delete(@PathVariable("id") String id){
        System.out.println("delete favourite position");
        favouritePositionService.deleteFavouritePositionById(id);
}

    @GetMapping("/favouritePositions")
            public List<FavouritePosition> favouritePositionList()
            {
            return favouritePositionService.favouritePositionList();
            }



}
