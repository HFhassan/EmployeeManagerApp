package hassan.farooqui.employeemanager.rms.model;


import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Finance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String cmId;
    private String cmName;
    private String symbol;
    private double margin;
    private  double exposure;

    private double exposureDemand;


    public Finance() {
    }

    public  Finance(String cmId, String cmName, String symbol, double margin, double exposure, double exposureDemand)
    {
        this.cmId   = cmId;
        this.cmName = cmName;
        this.symbol = symbol;
        this.margin = margin;
        this.exposure = exposure;
        this.exposureDemand =exposureDemand;
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

    public  double getMargin ()
    {
        return  margin;
    }
    public void setMargin (double margin)
    {
        this.margin= margin;
    }
    public double getExposureDemand ()
    {
        return exposureDemand;
    }
    public void setExposureDemand (double exposureDemand)
    {
        this.exposureDemand = exposureDemand;
    }
    public double getExposure ()
    {
        return exposure;
    }
    public void setExposure (double exposure)
    {
        this.exposure = exposure;
    }

    @Override
    public String toString ()
    {
        return "Finance{" +
                "id =" + id+
                ",cmId = '" + cmId+'\''+
                ",cmName = '" + cmName+ '\''+
                ",symbol = '" + symbol+ '\''+
                ",margin = '" + margin+ '\''+
                ",exposure = '" + exposure+'\''+
                ",exposureDemand='"+ exposureDemand+'\''+
                '}';
    }
}
