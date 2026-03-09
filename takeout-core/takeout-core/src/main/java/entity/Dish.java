                        package entity;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name= "dish")
public class Dish{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false,length = 100)
        private String name;

        @Column(precision = 10,scale = 2)
        private BigDecimal price;
        private String description;

        @Column(columnDefinition = "tinyint degault 1")
        private Integer status;

        public Dish(){}

        public Long getID() { return id;}
        public void setID(Long id) { this.id = id;}

        public String getName() { return name; }
        public void setName(String name) { this.name = name;}

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
}
