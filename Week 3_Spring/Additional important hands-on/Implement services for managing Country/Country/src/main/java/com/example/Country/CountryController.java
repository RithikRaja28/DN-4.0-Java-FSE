package com.example.Country;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/{code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable String code) {
        return countryService.getCountryByCode(code)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

   @PostMapping
    public ResponseEntity<Country> addCountry(@RequestBody Country country) {
        countryService.addCountry(country);
        return ResponseEntity.status(201).body(country);
    }
    
   @GetMapping("/find")
   public ResponseEntity<Country> findCountryByCode(@RequestParam String code) {
       return countryService.getCountryByCode(code)
               .map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
   }



}