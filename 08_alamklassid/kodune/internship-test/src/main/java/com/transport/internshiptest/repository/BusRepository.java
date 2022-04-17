package com.transport.internshiptest.repository;

import com.transport.internshiptest.model.Bus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends CrudRepository<Bus, Integer> {
}
