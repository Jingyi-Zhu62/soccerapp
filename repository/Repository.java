package com.example.soccerapp.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repository<T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }

    public List<T> filter(Predicate<T> predicate) {
        return items.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public List<T> sort(java.util.Comparator<T> comparator) {
        return items.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}