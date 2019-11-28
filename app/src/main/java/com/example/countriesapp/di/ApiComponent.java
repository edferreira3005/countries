package com.example.countriesapp.di;

import com.example.countriesapp.model.api.CountriesService;
import com.example.countriesapp.viewmodel.ListViewModel;

import dagger.Component;

@Component(modules = {ApiModule.class})
    public interface ApiComponent {

        void inject(CountriesService service);
        void inject(ListViewModel viewModel);
}
