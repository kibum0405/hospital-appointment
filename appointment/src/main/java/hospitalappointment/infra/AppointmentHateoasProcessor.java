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
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/createappointment"
                )
                .withRel("createappointment")
        );
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/updateappointment"
                )
                .withRel("updateappointment")
        );
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/cancelappointment"
                )
                .withRel("cancelappointment")
        );

        return model;
    }
}
