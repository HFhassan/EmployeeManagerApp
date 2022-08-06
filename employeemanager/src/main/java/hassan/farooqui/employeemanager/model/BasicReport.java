package hassan.farooqui.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class BasicReport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String cmId;
    private String cmName;
    private String symbol;
    private String margin;
    private  String exposure;


    public BasicReport() {
    }

    public  BasicReport(String cmId, String cmName, String symbol, String margin, String exposure)
    {
        this.cmId   = cmId;
        this.cmName = cmName;
        this.symbol = symbol;
        this.margin = margin;
        this.exposure = exposure;
    }

    public  Long getId ()
    {
        return  id;
    }
    public void setId (Long id)
    {
        this.id= id;
    }
    public String getCmId ()
    {
        return cmId;
    }
    public void setCmId (String cmId)
    {
        this.cmId = cmId;
    }

    public  String getSymbol ()
    {
        return  symbol;
    }
    public void setSymbol (String symbol)
    {
        this.symbol= symbol;
    }
    public String getCmName ()
    {
        return cmName;
    }
    public void setCmName (String cmName)
    {
        this.cmName = cmName;
    }

    public  String getMargin ()
    {
        return  symbol;
    }
    public void setMargin (String margin)
    {
        this.margin= margin;
    }
    public String getExposure ()
    {
        return exposure;
    }
    public void setExposure (String exposure)
    {
        this.exposure = exposure;
    }

    @Override
    public String toString ()
    {
        return "Employee{" +
                "id =" + id+
                ",cmId = '" + cmId+'\''+
                ",cmName = '" + cmName+ '\''+
                ",symbol = '" + symbol+ '\''+
                ",margin = '" + margin+ '\''+
                ",exposure = '" + exposure+'\''+
                '}';
    }
}
