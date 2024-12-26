package certifiedronski.jarkomdat.ibs.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Mahasiswa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nim;

    @Column(nullable = false)
    private String nama;

    @Column(nullable = false)
    private String programStudi;

    @Column(nullable = false)
    private int angkatan;
}
