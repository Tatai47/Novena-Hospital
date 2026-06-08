package com.doctor.appoinment.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.doctor.appoinment.Entities.Appointments;
import com.doctor.appoinment.Repository.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    public boolean saveAppointment(Appointments appointment) {
        if (appointment != null) {
            appointmentRepository.save(appointment);
            return true;
        } else {
            return false;
        }
    }
}
