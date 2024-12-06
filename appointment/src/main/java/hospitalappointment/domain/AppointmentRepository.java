package hospitalappointment.domain;

import hospitalappointment.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "appointments",
    path = "appointments"
)
public interface AppointmentRepository
    extends PagingAndSortingRepository<Appointment, Long> {}
