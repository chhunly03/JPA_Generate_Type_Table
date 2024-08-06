package com.khrd.test_jpa_generatetypetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleEntityService {

    @Autowired
    private ExampleEntityRepository repository;

    public ExampleEntity saveExampleEntity(ExampleEntity entity) {
        return repository.save(entity);
    }

    public ExampleEntity getExampleEntity(Long id) {
        return repository.findById(id).orElse(null);
    }
}
