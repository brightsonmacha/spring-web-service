package com.brightsonmacha.soapwsdlwebservice.repos;

import com.brightsonmacha.generated.country.Country;
import com.brightsonmacha.generated.country.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        // initialize countries map
        Country country = new Country();

        country.setName("tanzania");
        country.setCapital("Dar es Saalam");
        country.setCurrency(Currency.PLN);
        countries.put(country.getName(), country);

        country = new Country();
        country.setName("uganda");
        country.setCapital("Kampala");
        country.setCurrency(Currency.PLN);
        countries.put(country.getName(), country);

        country = new Country();
        country.setName("kenya");
        country.setCapital("Nairobi");
        country.setCurrency(Currency.PLN);
        countries.put(country.getName(), country);

        country = new Country();
        country.setName("burundi");
        country.setCapital("Kigali");
        country.setCurrency(Currency.PLN);
        countries.put(country.getName(), country);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}