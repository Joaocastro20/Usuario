package cadastro.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String perfiluser;

    public Perfil(Long id, String perfiluser) {
        this.id = id;
        this.perfiluser = perfiluser;
    }

    public Perfil() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerfiluser() {
        return perfiluser;
    }

    public void setPerfiluser(String perfiluser) {
        this.perfiluser = perfiluser;
    }
}
