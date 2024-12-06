package hospitalappointment.infra;

import hospitalappointment.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AppointmentHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Appointment>> {

    @Override
    public EntityModel<Appointment> process(EntityModel<Appointment> model) {
        return model;
    }
}
