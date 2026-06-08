package com.doctor.appoinment.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctor.appoinment.Entities.Subscribe;
import com.doctor.appoinment.Repository.SubscribeRepository;

@Service
public class SubscribeService {

    @Autowired
    SubscribeRepository subscribeRepository;

    public boolean saveSubscribe(Subscribe subscribe) {
        if (subscribe != null) {
            subscribeRepository.save(subscribe);
            return true;
        } else {
            return false;
        }
    }
}
