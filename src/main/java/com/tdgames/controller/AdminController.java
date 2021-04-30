package com.tdgames.controller;

import com.tdgames.entity.Empleado;
import com.tdgames.entity.Tareas;
import com.tdgames.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;



@Controller
public class AdminController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/admin")
    public String listEmpleados(Model model) {
        model.addAttribute("empleados", empleadoService.listaEmpleados());
        return "empleados";

    }
}

