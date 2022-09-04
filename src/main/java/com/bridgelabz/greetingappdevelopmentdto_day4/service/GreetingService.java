package com.bridgelabz.greetingappdevelopmentdto_day4.service;

import com.bridgelabz.greetingappdevelopmentdto_day4.dto.GreetingDTO;
import com.bridgelabz.greetingappdevelopmentdto_day4.model.GreetingData;
import com.bridgelabz.greetingappdevelopmentdto_day4.repository.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public  class GreetingService extends IGreetingService {
    @Autowired
    GreetingRepo greetingRepo;


//        public GreetingData addGreeting(GreetingData iGreetingService){
//        String msg = "Hello" + " " +iGreetingService.getFirstName()+ " " +iGreetingService.getLastName();
//        iGreetingService.setMessage(msg);
//        return greetingRepo.save(iGreetingService);
//    }
    public Optional<GreetingData> findGreetingID(int id){
        return greetingRepo.findById(id);
    }
    public void deleteGreetingID(int id){
        greetingRepo.deleteById(id);
    }

    public List<GreetingData> findAllGreets(){
        return greetingRepo.findAll();
    }

    public GreetingData addGreeting (GreetingDTO greetingDTO){
        GreetingData greetingObj = new GreetingData(greetingDTO);
        String msg = "Hello" + " " +greetingDTO.getFirstName()+ " " +greetingDTO.getLastName();
        greetingDTO.setMessage(msg);
        return greetingRepo.save(greetingObj);
    }
}
