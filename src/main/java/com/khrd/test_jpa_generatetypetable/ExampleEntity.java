package com.khrd.test_jpa_generatetypetable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ExampleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "student_gen")
    @TableGenerator(name = "student_gen",
            table = "employee",
            pkColumnName = "name",
            valueColumnName = "id",
            pkColumnValue = "PK_Employee",
            allocationSize = 1)
    private Integer id;
    private String name;
    private Integer score;
}
