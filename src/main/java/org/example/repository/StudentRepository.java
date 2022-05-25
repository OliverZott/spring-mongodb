package org.example.repository;

import org.example.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for queries. Same as JPARepository
 * - Variants: see github https://github.com/OliverZott/udemy-spring-boot/tree/master/src/main/java/org/velosaurus/demo/springbootdemo/dao)
 * <p>
 * Repository vs DAO
 * -----------------
 * DAO:             (REST)Controller-Service-DAO --> database
 * (e.g.https://github.com/OliverZott/udemy-spring-hibernate/blob/master/spring-hibernate-Employee/src/main/java/controller/Main.java)
 * Repository:      (REST)Controller-Service-Repository --> database
 */

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
