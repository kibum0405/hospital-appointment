package hospitalappointment.infra;

import hospitalappointment.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class MedicalInformationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MedicalInformation>> {

    @Override
    public EntityModel<MedicalInformation> process(
        EntityModel<MedicalInformation> model
    ) {
        return model;
    }
}
