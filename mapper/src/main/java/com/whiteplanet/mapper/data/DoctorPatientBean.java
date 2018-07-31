package com.whiteplanet.mapper.data;

import com.whiteplanet.mapper.model.Doctor;

/**
 * Created by ningchengzeng on 2017/7/20.
 */
public class DoctorPatientBean extends Doctor {
    private Boolean silent;

    public Boolean getSilent() {
        return silent;
    }

    public void setSilent(Boolean silent) {
        this.silent = silent;
    }
}
