package dev.edcan.kosmoschallenge.controller;

import dev.edcan.kosmoschallenge.model.Appointment;
import dev.edcan.kosmoschallenge.repository.DoctorRepository;
import dev.edcan.kosmoschallenge.service.DoctorService;
import dev.edcan.kosmoschallenge.service.OfficeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller

public class AppController {

  Logger logger = LoggerFactory.getLogger(AppController.class);

  DoctorService doctorService;

  OfficeService officeService;

  @Autowired
  public AppController(DoctorService doctorService, OfficeService officeService) {
    this.officeService = officeService;
    this.doctorService = doctorService;
  }

  @GetMapping("/")
  public String home() {
    logger.info("[Se he solicitado home]");
    return "index";
  }

  @GetMapping("/crear-cita")
  public String crearCita(Model model) {

    logger.info("[Se he solicitado la creación de una cita]");

    model.addAttribute("doctors", doctorService.findAll());
    model.addAttribute("offices", officeService.findAll());
    return "crear-cita";
  }

  @PostMapping("/confirmarCita")
  public String processForm(@ModelAttribute("formData") Appointment appointment) {

    System.out.println("Received form data: " + appointment.toString());

    return "redirect:/";
  }
}
