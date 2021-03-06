package org.rti.zcore.dar.gen.openmrs;

import org.rti.zcore.openmrs.OpenMRSEncounter;
import org.rti.zcore.openmrs.OpenMrsMultiValue;
import org.rti.zcore.openmrs.OpenMrsValue;

/**
 * JavaBean PatientCondition generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2012-09-14
 *         Time: 11:43:50
 *         Form Name: Health
 *         Form Id: 136
 */

/**
 * @hibernate.joined-subclass table="patient_condition"
 * @hibernate.joined-subclass-key column="id"
 */
public class PatientCondition extends OpenMRSEncounter {

private OpenMrsValue weight;	//weight field2168
private OpenMrsValue height;	//height field2169
private OpenMrsValue bmi_calculated;	//bmi_calculated field2289
private OpenMrsValue who_screen;	//who_screen field2277
private OpenMrsValue cd4count;	//cd4count field2278
private OpenMrsValue tb_status;	//tb_status field2290
private OpenMrsValue oi_indications;	//oi_indications field2292


 /**
  * @return
  * @hibernate.property column="weight"
  */
    public OpenMrsValue getWeight() {
        return this.weight;
    }

    public void setWeight(OpenMrsValue weight) {
        this.weight = weight;
    }





 /**
  * @return
  * @hibernate.property column="height"
  */
    public OpenMrsValue getHeight() {
        return this.height;
    }

    public void setHeight(OpenMrsValue height) {
        this.height = height;
    }





 /**
  * @return
  * @hibernate.property column="bmi_calculated"
  */
    public OpenMrsValue getBmi_calculated() {
        return this.bmi_calculated;
    }

    public void setBmi_calculated(OpenMrsValue bmi_calculated) {
        this.bmi_calculated = bmi_calculated;
    }





 /**
  * @return
  * @hibernate.property column="who_screen"
  */
    public OpenMrsValue getWho_screen() {
        return this.who_screen;
    }

    public void setWho_screen(OpenMrsValue who_screen) {
        this.who_screen = who_screen;
    }





 /**
  * @return
  * @hibernate.property column="cd4count"
  */
    public OpenMrsValue getCd4count() {
        return this.cd4count;
    }

    public void setCd4count(OpenMrsValue cd4count) {
        this.cd4count = cd4count;
    }





 /**
  * @return
  * @hibernate.property column="tb_status"
  */
    public OpenMrsValue getTb_status() {
        return this.tb_status;
    }

    public void setTb_status(OpenMrsValue tb_status) {
        this.tb_status = tb_status;
    }





 /**
  * @return
  * @hibernate.property column="oi_indications"
  */
    public OpenMrsValue getOi_indications() {
        return this.oi_indications;
    }

    public void setOi_indications(OpenMrsValue oi_indications) {
        this.oi_indications = oi_indications;
    }





}
