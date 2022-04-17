package com.transport.internshiptest.repository;

import com.transport.internshiptest.model.BusLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusLineRepository extends CrudRepository<BusLine, Integer> {
}
