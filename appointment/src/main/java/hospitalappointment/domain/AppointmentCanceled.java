package hospitalappointment.domain;

import hospitalappointment.domain.*;
import hospitalappointment.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class AppointmentCanceled extends AbstractEvent {

    private Long id;
    private String appointmentId;
    private Long patientId;
    private String status;

    public AppointmentCanceled(Appointment aggregate) {
        super(aggregate);
    }

    public AppointmentCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
