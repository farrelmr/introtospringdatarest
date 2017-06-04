package com.javabullets.springdata.jparest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

@PreAuthorize("hasRole('ROLE_USER')")
public interface ParkrunCourseRepository extends CrudRepository<ParkrunCourse, Long> {
	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	ParkrunCourse save(ParkrunCourse parkrunCourse);
}