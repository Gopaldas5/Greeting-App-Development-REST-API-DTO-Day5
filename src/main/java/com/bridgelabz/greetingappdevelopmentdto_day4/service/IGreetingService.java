package com.bridgelabz.greetingappdevelopmentdto_day4.service;

import com.bridgelabz.greetingappdevelopmentdto_day4.dto.GreetingDTO;
import com.bridgelabz.greetingappdevelopmentdto_day4.model.GreetingData;

import java.util.List;
import java.util.Optional;

public abstract class IGreetingService {

    public abstract  GreetingData addGreeting(GreetingDTO greetingDTO);
//    public abstract GreetingData addGreeting(GreetingData iGreetingService);

    public abstract Optional<GreetingData> findGreetingID(int id);

    public abstract void deleteGreetingID(int id);

    public abstract List<GreetingData> findAllGreets();
}
