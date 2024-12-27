package hospitalappointment.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import hospitalappointment.AppointmentApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Appointment_table")
@Data
//<<< DDD / Aggregate Root
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long appointmentId;

    private String name;

    private Long patientId;

    private Long doctorId;

    private Date appointmentDate;

    private String status;

    private String createdAt;

    private String updatedAt;

    private String symptom;

    @PrePersist
    public void onPrePersist() {}

    @PreUpdate
    public void onPreUpdate() {}

    public static AppointmentRepository repository() {
        AppointmentRepository appointmentRepository = AppointmentApplication.applicationContext.getBean(
            AppointmentRepository.class
        );
        return appointmentRepository;
    }

    //<<< Clean Arch / Port Method
    public void createAppointment() {
        //implement business logic here:

        AppointmentCreated appointmentCreated = new AppointmentCreated(this);
        appointmentCreated.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void updateAppointment() {
        //implement business logic here:

        AppointmentUpdated appointmentUpdated = new AppointmentUpdated(this);
        appointmentUpdated.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void cancelAppointment() {
        //implement business logic here:

        AppointmentCanceled appointmentCanceled = new AppointmentCanceled(this);
        appointmentCanceled.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
