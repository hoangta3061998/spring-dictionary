package com.codegym.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryRepository implements GeneralRepository<String> {

    Map<String,String> dictionary = new HashMap<>();
    {
        dictionary.put("hello","xin chao");
        dictionary.put("man","dan ong");
        dictionary.put("food","thuc an");
    }


    @Override
    public Map<String,String> findAll() {
        return dictionary;
    }

    @Override
    public String search(String key) {
        return dictionary.get(key);
    }
}
