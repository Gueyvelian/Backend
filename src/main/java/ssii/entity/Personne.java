package ssii.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.ArrayList;
import java.util.List;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricule;

    @Column(nullable = false)
    @NonNull // lombok
    private String nom;

    @Column(nullable = false)
    @NonNull // lombok
    private String prenom;

    @Column(nullable = false)
    @NonNull // lombok
    private String poste;

    @ToString.Exclude
    @ManyToOne
    private Personne superieur;

    @ToString.Exclude
    @OneToMany(mappedBy = "superieur")
    private List<Personne> subordone = new ArrayList<>();

    @ToString.Exclude
    @OneToMany(mappedBy = "personne", cascade = CascadeType.ALL)
    @NonNull
    private List<Participation> participations = new ArrayList<>();

}
