package ssii.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString

public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull // lombok
    private String role;

    @NonNull // lombok
    private Float pourcentage;

    @ToString.Exclude
    @ManyToOne(optional = false)
    @NonNull
    private Personne personne;

    @ToString.Exclude
    @ManyToOne(optional = false)
    @NonNull
    private Projet projet;

}


