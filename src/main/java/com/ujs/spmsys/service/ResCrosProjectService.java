package com.ujs.spmsys.service;

import com.ujs.spmsys.core.CommonService;
import com.ujs.spmsys.entity.Crossproject;
import java.util.List;

public interface ResCrosProjectService extends CommonService<Crossproject> {
    List<Crossproject> findAllByAuthorName(String name);
    Crossproject findAllByName(String name);
}
