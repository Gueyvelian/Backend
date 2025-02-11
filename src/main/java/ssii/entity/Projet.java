package ssii.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString

public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer code;

    @NotBlank
    @NotEmpty
    @Column(nullable = false, unique = true)
    @NonNull // lombok
    private String nom;

    @Column(nullable = false)
    private LocalDate debut = LocalDate.now();

    private java.time.LocalDate fin;

    @ToString.Exclude
    @OneToMany(mappedBy = "projet", cascade = CascadeType.ALL)
    private List<Participation> participations = new ArrayList<>();
}
