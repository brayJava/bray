package com.whiteplanet.mapper.data;

import com.whiteplanet.mapper.model.Doctor;

public class DoctorPhoneData extends Doctor {
    private Integer objPartner;
    private Integer partner;

    public Integer getObjPartner() {
        return objPartner;
    }

    public void setObjPartner(Integer objPartner) {
        this.objPartner = objPartner;
    }

    public Integer getPartner() {
        return partner;
    }

    public void setPartner(Integer partner) {
        this.partner = partner;
    }
}
