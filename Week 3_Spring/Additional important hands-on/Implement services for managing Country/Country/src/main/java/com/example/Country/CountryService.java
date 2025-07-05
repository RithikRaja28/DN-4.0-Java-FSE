package com.example.Country;

import com.example.Country.Country;
import com.example.Country.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.example.Country.CountryRepository;
@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;
    public Optional<Country> getCountryByCode(String code) {
        return countryRepository.findById(code);
    }

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country updateCountry(String code, Country updatedCountry) {
        Optional<Country> existing = countryRepository.findById(code);
        if (existing.isPresent()) {
            existing.get().setName(updatedCountry.getName());
            return countryRepository.save(existing.get());
        } else {
            throw new RuntimeException("Country with code " + code + " not found.");
        }
    }

    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    public List<Country> searchCountriesByPartialName(String name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }
}
