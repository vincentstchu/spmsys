package com.ujs.spmsys.service;
import com.ujs.spmsys.core.CommonService;
import com.ujs.spmsys.core.ServiceException;
import com.ujs.spmsys.entity.Reseacher;

import javax.xml.ws.Service;

public interface ReseacherService extends CommonService<Reseacher>{
    Reseacher findByName(String name) throws Exception;
}
