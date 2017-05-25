package com.javabullets.springdata.jparest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface ParkrunCourseRepository extends CrudRepository<ParkrunCourse, Long> {
}