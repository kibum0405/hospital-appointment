package hospitalappointment.infra;

import hospitalappointment.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class BillHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Bill>> {

    @Override
    public EntityModel<Bill> process(EntityModel<Bill> model) {
        return model;
    }
}
