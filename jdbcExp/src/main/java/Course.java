import jdk.jfr.events.CertificateId;
import sun.jvm.hotspot.gc.shared.Generation;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "Cousers")
public class Course {
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

    public int getDration() {
        return dration;
    }

    public void setDration(int dration) {
        this.dration = dration;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }


    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String name;
    private  int dration;
    private CourseType type;
    private String description;
    private int studentsCount;
    private int price;
    private float pricePerHour;

    public void setI(int id) {
    }
}
