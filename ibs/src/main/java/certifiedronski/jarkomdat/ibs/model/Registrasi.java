package certifiedronski.jarkomdat.ibs.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Registrasi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "mahasiswa_id", nullable = false)
    private Mahasiswa mahasiswa;

    @ManyToOne(optional = false)
    @JoinColumn(name = "mata_kuliah_id", nullable = false)
    private MataKuliah mataKuliah;

    @Column(nullable = false)
    private String semester;
}

