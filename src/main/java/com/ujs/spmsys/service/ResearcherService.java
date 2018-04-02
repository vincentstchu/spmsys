package com.ujs.spmsys.service;
import com.ujs.spmsys.core.CommonService;
import com.ujs.spmsys.core.ServiceException;
import com.ujs.spmsys.entity.Researcher;


public interface ResearcherService extends CommonService<Researcher>{
    Researcher findByName(String name) throws Exception;
}
