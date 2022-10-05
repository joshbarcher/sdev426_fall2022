package edu.greenriver.sdev.clothingstore.controller;

import edu.greenriver.sdev.clothingstore.model.Clothing;
import edu.greenriver.sdev.clothingstore.service.ClothingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/clothing")
public class ClothingApi
{
    private ClothingService service;

    public ClothingApi(ClothingService service)
    {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<List<Clothing>> getAllClothing()
    {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
