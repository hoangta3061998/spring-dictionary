package com.codegym.service;

import com.codegym.repository.DictionaryRepository;

import java.util.Map;

public class DictionaryService implements GeneralService<String> {

    DictionaryRepository dictionaryRepository = new DictionaryRepository();

    @Override
    public Map<String, String> findAll() {
        return dictionaryRepository.findAll();
    }

    @Override
    public String search(String s) {
        return dictionaryRepository.search(s);
    }
}
