package ssii.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
private Integer matricule;

    @NotBlank
    @NonNull // lombok
    private Integer ID;
    @NotBlank
    @NonNull // lombok
    private String role;
    @NotBlank
    @NonNull // lombok
    private Float pourcentge;
}


