package certifiedronski.jarkomdat.ibs.service;

import org.springframework.stereotype.Service;

import certifiedronski.jarkomdat.ibs.model.Mahasiswa;
import certifiedronski.jarkomdat.ibs.repository.MahasiswaRepository;

import java.util.List;

@Service
public class MahasiswaService {

    private final MahasiswaRepository mahasiswaRepository;

    public MahasiswaService(MahasiswaRepository mahasiswaRepository) {
        this.mahasiswaRepository = mahasiswaRepository;
    }

    public List<Mahasiswa> getAllMahasiswa() {
        return mahasiswaRepository.findAll();
    }

    public Mahasiswa getMahasiswaById(Long id) {
        return mahasiswaRepository.findById(id)
                                  .orElseThrow(() -> new IllegalArgumentException("Mahasiswa tidak ditemukan"));
    }

}

