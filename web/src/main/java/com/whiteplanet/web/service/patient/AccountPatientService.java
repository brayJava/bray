package com.whiteplanet.web.service.patient;

import com.whiteplanet.common.exception.ReturnResult;
import com.whiteplanet.web.entry.LoginBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountPatientService extends BasePatientService{

    public ReturnResult login(LoginBean data) {
        return null;
    }
}
