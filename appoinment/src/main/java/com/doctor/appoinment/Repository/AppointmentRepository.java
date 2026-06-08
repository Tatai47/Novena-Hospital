package com.doctor.appoinment.Repository;

import org.springframework.data.repository.CrudRepository;

import com.doctor.appoinment.Entities.Appointments;

public interface AppointmentRepository extends CrudRepository<Appointments, Integer> {

    public Appointments findById(int id);
}
