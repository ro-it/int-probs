package com.example.FirstSpringJPAProject.Service;

import com.example.FirstSpringJPAProject.model.Baller;

public interface BallerService {
    Baller getBallerById(int id);
    int saveBaller(Baller baller);
    Baller updateBaller(Baller baller);
    String deleteBaller(int id);
}
