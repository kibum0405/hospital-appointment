package hospitalappointment.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import hospitalappointment.NotificationApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
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
        NotificationRepository notificationRepository = NotificationApplication.applicationContext.getBean(
            NotificationRepository.class
        );
        return notificationRepository;
    }
}
//>>> DDD / Aggregate Root
