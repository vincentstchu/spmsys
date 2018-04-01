package com.ujs.spmsys.service;
import com.ujs.spmsys.core.CommonService;
import com.ujs.spmsys.entity.Reseacher;

public interface ReseacherService extends CommonService<Reseacher>{
    Reseacher findByName(String name);
}
