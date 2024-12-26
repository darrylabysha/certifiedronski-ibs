package certifiedronski.jarkomdat.ibs.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class MataKuliah {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String kodeMk;

    @Column(nullable = false)
    private String namaMk;

    @Column(nullable = false)
    private int sks;
}

