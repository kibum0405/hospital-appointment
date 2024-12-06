package hospitalappointment.infra;

import hospitalappointment.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/appointments")
@Transactional
public class AppointmentController {

    @Autowired
    AppointmentRepository appointmentRepository;
}
//>>> Clean Arch / Inbound Adaptor
