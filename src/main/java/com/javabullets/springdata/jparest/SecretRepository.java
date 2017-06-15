package com.javabullets.springdata.jparest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.security.access.prepost.PreAuthorize;

@PreAuthorize("hasRole('ROLE_USER')")
public interface SecretRepository extends CrudRepository<Secret, Long> {
}