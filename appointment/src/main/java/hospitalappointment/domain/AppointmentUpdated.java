package hospitalappointment.domain;

import hospitalappointment.domain.*;
import hospitalappointment.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AppointmentUpdated extends AbstractEvent {

    private Long id;
    private Long appointmentId;
    private Long patientId;
    private Long doctorId;
    private Date appointmentDate;
    private String status;

    public AppointmentUpdated(Appointment aggregate) {
        super(aggregate);
    }

    public AppointmentUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
