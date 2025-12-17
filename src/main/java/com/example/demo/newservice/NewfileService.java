package com.example.demo.newservice;

import java.util.List;

import com.example.demo.newentity.NewfileEntity;

public interface NewfileService {
    NewfileEntity savedata(NewfileEntity newfile);
    NewfileEntity getidval(Long id);
    List<NewfileEntity> getall();
    NewfileEntity update(Long id,NewfileEntity newfile);
    void delete(Long id);


}
