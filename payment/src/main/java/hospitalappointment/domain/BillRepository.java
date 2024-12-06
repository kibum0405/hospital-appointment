package hospitalappointment.domain;

import hospitalappointment.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "bills", path = "bills")
public interface BillRepository
    extends PagingAndSortingRepository<Bill, Long> {}
