package hospitalappointment.domain;

import hospitalappointment.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "medicalInformations",
    path = "medicalInformations"
)
public interface MedicalInformationRepository
    extends PagingAndSortingRepository<MedicalInformation, Long> {}
