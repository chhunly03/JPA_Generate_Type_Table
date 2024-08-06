package com.khrd.test_jpa_generatetypetable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleEntityRepository extends JpaRepository<ExampleEntity, Long> {
}
