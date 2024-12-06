package hospitalappointment.domain;

import hospitalappointment.AppointmentApplication;
import hospitalappointment.domain.AppointmentCanceled;
import hospitalappointment.domain.AppointmentCreated;
import hospitalappointment.domain.AppointmentUpdated;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
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

    private Long patientId;

    private Long doctorId;

    private Date appointmentDate;

    private String status;

    private String createdAt;

    private String updatedAt;

    private String symptom;

    @PostPersist
    public void onPostPersist() {
        AppointmentCreated appointmentCreated = new AppointmentCreated(this);
        appointmentCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    @PreUpdate
    public void onPreUpdate() {
        AppointmentUpdated appointmentUpdated = new AppointmentUpdated(this);
        appointmentUpdated.publishAfterCommit();

        AppointmentCanceled appointmentCanceled = new AppointmentCanceled(this);
        appointmentCanceled.publishAfterCommit();
    }

    public static AppointmentRepository repository() {
        AppointmentRepository appointmentRepository = AppointmentApplication.applicationContext.getBean(
            AppointmentRepository.class
        );
        return appointmentRepository;
    }
}
//>>> DDD / Aggregate Root
