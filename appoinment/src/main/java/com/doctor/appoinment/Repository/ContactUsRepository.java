package com.doctor.appoinment.Repository;

import org.springframework.data.repository.CrudRepository;

import com.doctor.appoinment.Entities.ContactUs;

public interface ContactUsRepository extends CrudRepository<ContactUs, Integer> {

    public ContactUs findById(int id);
}
