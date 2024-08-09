package com.dtoexample.dtodemo.repository;

import com.dtoexample.dtodemo.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
