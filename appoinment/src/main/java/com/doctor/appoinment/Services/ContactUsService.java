package com.doctor.appoinment.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.doctor.appoinment.Entities.ContactUs;
import com.doctor.appoinment.Repository.ContactUsRepository;

@Service
public class ContactUsService {

    @Autowired
    ContactUsRepository contactUsRepository;

    public boolean ContactUs(ContactUs contactUs) {
        if (contactUs != null) {
            contactUsRepository.save(contactUs);
            return true;
        } else {
            return false;
        }
    }
}
