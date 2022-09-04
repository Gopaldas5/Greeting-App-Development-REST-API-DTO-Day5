package com.bridgelabz.greetingappdevelopmentdto_day4.repository;

import com.bridgelabz.greetingappdevelopmentdto_day4.model.GreetingData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepo extends JpaRepository<GreetingData, Integer> {
}
