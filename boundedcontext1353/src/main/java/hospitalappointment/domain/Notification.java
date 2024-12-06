package hospitalappointment.domain;

import hospitalappointment.Boundedcontext1353Application;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notification_table")
@Data
//<<< DDD / Aggregate Root
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long notificationId;

    private Long patientId;

    private String message;

    private String createdAt;

    private Boolean status;

    public static NotificationRepository repository() {
        NotificationRepository notificationRepository = Boundedcontext1353Application.applicationContext.getBean(
            NotificationRepository.class
        );
        return notificationRepository;
    }
}
//>>> DDD / Aggregate Root
