package andrehsvictor.imatch.user;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Document(collection = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 2503539284980056450L;

    @Id
    private UUID id = UUID.randomUUID();

    private String name;
    private String email;
    private String passwordHash;
    private boolean emailVerified = false;
    private String avatarUrl;
    private String bio;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

}
