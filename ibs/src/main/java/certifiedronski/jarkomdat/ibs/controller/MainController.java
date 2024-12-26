package certifiedronski.jarkomdat.ibs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import certifiedronski.jarkomdat.ibs.model.Mahasiswa;
import certifiedronski.jarkomdat.ibs.service.MahasiswaService;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    private String home() {
        return "home";
        
    }

    

}
