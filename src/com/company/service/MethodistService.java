package com.company.service;

import com.company.model.Methodist;
import com.company.repository.MethodistRepository;

import java.util.List;

public class MethodistService {
    private MethodistRepository methodistRepository;

    public MethodistService(MethodistRepository methodistRepository) {
        this.methodistRepository = methodistRepository;
    }

    public void addMethodist(List<Methodist> addMethodist) {
        System.out.println("Создать методиста:");
        addMethodist.forEach(methodist -> System.out.println(methodist.toString()));
    }

    public void removeMethodist(List<Methodist> removeMethodist) {
        System.out.println("Удалить методиста:");
        removeMethodist.forEach(methodist -> System.out.println(methodist.toString()));
    }
}
