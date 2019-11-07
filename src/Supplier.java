import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Suppliers")
public class Supplier {
    @Id
    private
    String CompanyName;
    private String Street;
    private String City;
    public Supplier(){}
    public Supplier(String CompanyName, String Street, String City){
        this.CompanyName=CompanyName;
        this.Street=Street;
        this.City=City;
    }
}
