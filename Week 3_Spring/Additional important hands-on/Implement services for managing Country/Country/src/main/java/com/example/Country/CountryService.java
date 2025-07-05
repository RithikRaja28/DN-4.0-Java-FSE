package com.example.Country;

import com.example.Country.Country;
import com.example.Country.CountryRepository;
import jakarta.transaction.Transactional;
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

    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(countryCode);
        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found with code: " + countryCode);
        }
        return result.get();
        }

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }
}
