package com.khrd.test_jpa_generatetypetable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class ExampleEntityController {

    @Autowired
    private ExampleEntityService service;

    @PostMapping
    public ExampleEntity createEntity(@RequestBody ExampleEntity entity) {
        return service.saveExampleEntity(entity);
    }

    @GetMapping("/{id}")
    public ExampleEntity getEntity(@PathVariable Long id) {
        return service.getExampleEntity(id);
    }
}
