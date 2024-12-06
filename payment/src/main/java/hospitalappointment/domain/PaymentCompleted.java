package hospitalappointment.domain;

import hospitalappointment.domain.*;
import hospitalappointment.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentCompleted extends AbstractEvent {

    private Long id;
    private Long billId;
    private Long amount;
    private Boolean status;
    private String completionTime;

    public PaymentCompleted(Bill aggregate) {
        super(aggregate);
    }

    public PaymentCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
