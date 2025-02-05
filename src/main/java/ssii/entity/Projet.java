package ssii.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
    private Integer code;

    @NotBlank
    @NonNull // lombok
    private String nom;

    @NotBlank
    @NonNull // lombok
    private LocalDate debut;

    private java.time.LocalDate fin;

    @OneToMany(mappedBy = "projet")
    @NonNull
    private List<Participation> participations = new ArrayList<>();
}
