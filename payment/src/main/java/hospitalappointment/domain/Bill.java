package hospitalappointment.domain;

import hospitalappointment.PaymentApplication;
import hospitalappointment.domain.PaymentCompleted;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Bill_table")
@Data
//<<< DDD / Aggregate Root
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long billId;

    private Long patientId;

    private Long medicalRecordId;

    private Long amount;

    private Boolean status;

    private String createdAt;

    private String completionTime;

    @PostPersist
    public void onPostPersist() {
        PaymentCompleted paymentCompleted = new PaymentCompleted(this);
        paymentCompleted.publishAfterCommit();
    }

    public static BillRepository repository() {
        BillRepository billRepository = PaymentApplication.applicationContext.getBean(
            BillRepository.class
        );
        return billRepository;
    }
}
//>>> DDD / Aggregate Root
