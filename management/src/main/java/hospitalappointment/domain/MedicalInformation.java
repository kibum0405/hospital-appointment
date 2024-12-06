package hospitalappointment.domain;

import hospitalappointment.ManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MedicalInformation_table")
@Data
//<<< DDD / Aggregate Root
public class MedicalInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long recordId;

    private Long patientId;

    private Long doctorId;

    private String diagnosis;

    private String treatment;

    private String createdAt;

    private String updatedAt;

    private Boolean status;

    public static MedicalInformationRepository repository() {
        MedicalInformationRepository medicalInformationRepository = ManagementApplication.applicationContext.getBean(
            MedicalInformationRepository.class
        );
        return medicalInformationRepository;
    }
}
//>>> DDD / Aggregate Root
