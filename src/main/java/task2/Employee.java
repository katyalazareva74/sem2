package task2;

import java.util.UUID;

@Table(name = "users")
public class Employee {
    @Column(name = "id", primaryKey = true)
    private UUID id;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;

    public Employee(String username, String email) {
        this.username = username;
        this.email = email;
        this.id = UUID.randomUUID();
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public UUID getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
