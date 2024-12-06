package hospitalappointment.domain;

import hospitalappointment.domain.*;
import hospitalappointment.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class AppointmentCanceled extends AbstractEvent {

    private Long id;
    private String appointmentId;
    private Long patientId;
    private String status;
}
