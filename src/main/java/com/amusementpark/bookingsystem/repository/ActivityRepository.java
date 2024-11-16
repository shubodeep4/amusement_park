package com.amusementpark.bookingsystem.repository;

import com.amusementpark.bookingsystem.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
    Activity findByName(String name);
}
