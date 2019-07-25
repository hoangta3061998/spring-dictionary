package com.codegym.service;

import java.util.Map;

public interface GeneralService<T> {
    Map<T,T> findAll();
    T search(T t);
}
