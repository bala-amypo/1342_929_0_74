package com.example.demo.newservice;

import java.util.List;

import com.example.demo.entity.Student;
import com.example.demo.newentity.NewfileEntity;

import jakarta.validation.Valid;

public interface NewfileService {
    NewfileEntity savedata(NewfileEntity newfile);
    NewfileEntity getidval(Long id);
    List<NewfileEntity> getall();
    NewfileEntity update(Long id,@Valid Student student);
    void delete(Long id);
    Student update(Long id, @Valid Student student);


}
