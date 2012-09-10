package org.rti.zcore.dar.gen.report;

import org.rti.zcore.EncounterData;
import org.rti.zcore.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import java.sql.Timestamp;
import org.rti.zcore.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean PatientConditionReport generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2012-02-10
 *         Time: 14:53:27
 *         Form Name: Health
 *         Form Id: 136
 */

/**
 * @hibernate.joined-subclass table="patient_condition"
 * @hibernate.joined-subclass-key column="id"
 */
public class PatientConditionReport extends EncounterData {

private transient Float weight;	//weight field2168
private String weightR;
private transient Float height;	//height field2169
private String heightR;
private transient Float bmi_calculated;	//bmi_calculated field2289
private String bmi_calculatedR;
private transient Integer who_screen;	//who_screen field2277
private String who_screenR;
private transient Integer cd4count;	//cd4count field2278
private String cd4countR;
private transient Integer tb_status;	//tb_status field2290
private String tb_statusR;
private transient String oi_indications;	//oi_indications field2292
private String oi_indicationsR;


 /**
  * @return
  * @hibernate.property column="weight"
  */
    public Float getWeight() {
        return this.weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }



    public String getWeightR() {
        return this.weightR;
    }

    public void setWeightR(String weightR) {
        this.weightR = weightR;
    }



 /**
  * @return
  * @hibernate.property column="height"
  */
    public Float getHeight() {
        return this.height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }



    public String getHeightR() {
        return this.heightR;
    }

    public void setHeightR(String heightR) {
        this.heightR = heightR;
    }



 /**
  * @return
  * @hibernate.property column="bmi_calculated"
  */
    public Float getBmi_calculated() {
        return this.bmi_calculated;
    }

    public void setBmi_calculated(Float bmi_calculated) {
        this.bmi_calculated = bmi_calculated;
    }



    public String getBmi_calculatedR() {
        return this.bmi_calculatedR;
    }

    public void setBmi_calculatedR(String bmi_calculatedR) {
        this.bmi_calculatedR = bmi_calculatedR;
    }



 /**
  * @return
  * @hibernate.property column="who_screen"
  */
    public Integer getWho_screen() {
        return this.who_screen;
    }

    public void setWho_screen(Integer who_screen) {
        this.who_screen = who_screen;
    }



    public String getWho_screenR() {
        return this.who_screenR;
    }

    public void setWho_screenR(String who_screenR) {
        this.who_screenR = who_screenR;
    }



 /**
  * @return
  * @hibernate.property column="cd4count"
  */
    public Integer getCd4count() {
        return this.cd4count;
    }

    public void setCd4count(Integer cd4count) {
        this.cd4count = cd4count;
    }



    public String getCd4countR() {
        return this.cd4countR;
    }

    public void setCd4countR(String cd4countR) {
        this.cd4countR = cd4countR;
    }



 /**
  * @return
  * @hibernate.property column="tb_status"
  */
    public Integer getTb_status() {
        return this.tb_status;
    }

    public void setTb_status(Integer tb_status) {
        this.tb_status = tb_status;
    }



    public String getTb_statusR() {
        return this.tb_statusR;
    }

    public void setTb_statusR(String tb_statusR) {
        this.tb_statusR = tb_statusR;
    }



 /**
  * @return
  * @hibernate.property column="oi_indications"
  */
    public String getOi_indications() {
        return this.oi_indications;
    }

    public void setOi_indications(String oi_indications) {
        this.oi_indications = oi_indications;
    }



    public String getOi_indicationsR() {
        return this.oi_indicationsR;
    }

    public void setOi_indicationsR(String oi_indicationsR) {
        this.oi_indicationsR = oi_indicationsR;
    }



}