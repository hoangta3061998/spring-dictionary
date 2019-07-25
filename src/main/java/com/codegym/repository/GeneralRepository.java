package com.codegym.repository;

import java.util.List;
import java.util.Map;

public interface GeneralRepository<T> {

    Map<T,T> findAll();
    T search(T key);
}
