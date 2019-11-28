package com.example.countriesapp.model.api;

import com.example.countriesapp.di.DaggerApiComponent;
import com.example.countriesapp.model.CountryModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class CountriesService {

    private static CountriesService instance;

    @Inject
    public CountriesApi api;

    private CountriesService(){
        DaggerApiComponent.create().inject(this);
    }

    public static CountriesService getInstance(){
        if(instance == null)
            instance = new CountriesService();

        return instance;
    }

    public Single<List<CountryModel>> getCountries(){
        return api.getCountries();
    }
}
