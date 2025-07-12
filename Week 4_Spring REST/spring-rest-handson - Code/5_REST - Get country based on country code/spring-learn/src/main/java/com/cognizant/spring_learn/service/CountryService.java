package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    private List<Country> countryList = new ArrayList<>();

    @Value("classpath:country.xml")
    private Resource countryResource;

    @PostConstruct
    public void loadCountriesFromXml() {
        try {
            Document document = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder().parse(countryResource.getInputStream());

            NodeList nodes = document.getElementsByTagName("country");
            for (int i = 0; i < nodes.getLength(); i++) {
                Element element = (Element) nodes.item(i);
                String code = element.getElementsByTagName("code").item(0).getTextContent();
                String name = element.getElementsByTagName("name").item(0).getTextContent();
                countryList.add(new Country(code.toUpperCase(), name));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Country getCountry(String code) {
        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
