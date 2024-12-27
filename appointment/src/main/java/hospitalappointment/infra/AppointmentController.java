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

    @RequestMapping(
        value = "/appointments/{id}/createappointment",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Appointment createAppointment(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /appointment/createAppointment  called #####"
        );
        Optional<Appointment> optionalAppointment = appointmentRepository.findById(
            id
        );

        optionalAppointment.orElseThrow(() -> new Exception("No Entity Found"));
        Appointment appointment = optionalAppointment.get();
        appointment.createAppointment();

        appointmentRepository.save(appointment);
        return appointment;
    }

    @RequestMapping(
        value = "/appointments/{id}/updateappointment",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Appointment updateAppointment(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /appointment/updateAppointment  called #####"
        );
        Optional<Appointment> optionalAppointment = appointmentRepository.findById(
            id
        );

        optionalAppointment.orElseThrow(() -> new Exception("No Entity Found"));
        Appointment appointment = optionalAppointment.get();
        appointment.updateAppointment();

        appointmentRepository.save(appointment);
        return appointment;
    }

    @RequestMapping(
        value = "/appointments/{id}/cancelappointment",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Appointment cancelAppointment(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /appointment/cancelAppointment  called #####"
        );
        Optional<Appointment> optionalAppointment = appointmentRepository.findById(
            id
        );

        optionalAppointment.orElseThrow(() -> new Exception("No Entity Found"));
        Appointment appointment = optionalAppointment.get();
        appointment.cancelAppointment();

        appointmentRepository.save(appointment);
        return appointment;
    }
}
//>>> Clean Arch / Inbound Adaptor
