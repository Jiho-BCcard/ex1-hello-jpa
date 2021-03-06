package hellojpa;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.logging.Logger;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "Member")
public class Member {

    @Id
    private Long id;
    private String name;

}
