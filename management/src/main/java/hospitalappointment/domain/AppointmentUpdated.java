package hospitalappointment.domain;

import hospitalappointment.domain.*;
import hospitalappointment.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AppointmentUpdated extends AbstractEvent {

    private Long id;
    private Long appointmentId;
    private Long patientId;
    private Long doctorId;
    private Date appointmentDate;
    private String status;
}
