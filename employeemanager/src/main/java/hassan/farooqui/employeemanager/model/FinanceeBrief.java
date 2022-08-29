package hassan.farooqui.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class FinanceeBrief implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)

    private Long id;
    private String cmName;
    private String symbol;
    private String uin;
    private String exposure;
    private String exposureDemand;
    private String concentrationMargin;
    private String additionalMargin;

    public FinanceeBrief()
    {}
    public FinanceeBrief(
                         String cmName,
                         String symbol,
                         String uin,
                         String exposure,
                         String exposureDemand,
                         String concentrationMargin,
                         String additionalMargin
    )
    {
        this.symbol = symbol;
        this.cmName = cmName;
        this.concentrationMargin = concentrationMargin;
        this.additionalMargin = additionalMargin;
        this.exposure = exposure;
        this.exposureDemand = exposureDemand;
        this.uin = uin;
    }

    public String getAdditionalMargin() {
        return additionalMargin;
    }

    public void setAdditionalMargin(String additionalMargin) {
        this.additionalMargin = additionalMargin;
    }

    public  Long getId ()
    {
        return  id;
    }
    public void setId (Long id)
    {
        this.id= id;
    }

    public String getConcentrationMargin() {
        return concentrationMargin;
    }

    public void setConcentrationMargin(String concentrationMargin) {
        this.concentrationMargin = concentrationMargin;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getExposure() {
        return exposure;
    }

    public void setExposure(String exposure) {
        this.exposure = exposure;
    }

    public String getExposureDemand() {
        return exposureDemand;
    }

    public void setExposureDemand(String exposureDemand) {
        this.exposureDemand = exposureDemand;
    }

    public String getCmName() {
        return cmName;
    }

    public void setCmName(String cmName) {
        this.cmName = cmName;
    }

    public String getUin() {
        return uin;
    }

    public void setUin(String uin) {
        this.uin = uin;
    }
    @Override
    public String toString ()
    {
        return "FinanceeBrief{" +
                "cmId =" + id+
                ",cmName = '" + cmName+'\''+
                ",symbol = '" + symbol+ '\''+
                ",uin = '" + uin+ '\''+
                ",exposure = '" + exposure+ '\''+
                ",exposureDemand = '" + exposureDemand+'\''+
                ",additionalMargin = '" + additionalMargin+'\''+
                ",concentrationMargin = '" + concentrationMargin+'\''+
                '}';
    }


}

