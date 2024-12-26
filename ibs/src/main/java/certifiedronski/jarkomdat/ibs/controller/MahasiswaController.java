package certifiedronski.jarkomdat.ibs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import certifiedronski.jarkomdat.ibs.model.Mahasiswa;
import certifiedronski.jarkomdat.ibs.service.MahasiswaService;

import java.util.List;

@Controller
@RequestMapping("/")
public class MahasiswaController {

    private final MahasiswaService mahasiswaService;

    public MahasiswaController(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }

    @GetMapping
    public String getAllMahasiswa(Model model) {
        List<Mahasiswa> mahasiswaList = mahasiswaService.getAllMahasiswa();
        model.addAttribute("mahasiswaList", mahasiswaList);
        return "mahasiswa";
    }

    @GetMapping("/mahasiswa/{id}")
    public String getDetailMahasiswa(@PathVariable Long id, Model model) {
        Mahasiswa mahasiswa = mahasiswaService.getMahasiswaById(id);
        model.addAttribute("mahasiswa", mahasiswa);
        return "detail-mahasiswa";
    }
}
