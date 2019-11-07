import org.hibernate.HibernateException;
import org.hibernate.Metamodel;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.metamodel.EntityType;

@Entity
@Table(name="Products")
public class Product {
    @Id
    private String productName;
    private Integer UnitsOnStock;
    public Product(){}
    public Product(String name){
        this.productName=name;
    }
    @ManyToOne
    private Supplier supplier;

}
