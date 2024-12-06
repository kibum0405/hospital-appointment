package hospitalappointment.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import hospitalappointment.config.kafka.KafkaProcessor;
import hospitalappointment.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    MedicalInformationRepository medicalInformationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AppointmentUpdated'"
    )
    public void wheneverAppointmentUpdated_진료정보변경(
        @Payload AppointmentUpdated appointmentUpdated
    ) {
        AppointmentUpdated event = appointmentUpdated;
        System.out.println(
            "\n\n##### listener 진료정보변경 : " + appointmentUpdated + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AppointmentCanceled'"
    )
    public void wheneverAppointmentCanceled_진료정보변경(
        @Payload AppointmentCanceled appointmentCanceled
    ) {
        AppointmentCanceled event = appointmentCanceled;
        System.out.println(
            "\n\n##### listener 진료정보변경 : " + appointmentCanceled + "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
