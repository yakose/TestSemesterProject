package units;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "type" )
public class User implements Serializable{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private int id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Calendar birthDate;

    public User(){}

    public User(int id){
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }
}
