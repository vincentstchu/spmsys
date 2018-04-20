package com.ujs.spmsys;

import com.ujs.spmsys.entity.Crossproject;
import com.ujs.spmsys.service.ResCrosProjectService;
import com.ujs.spmsys.service.impl.ResCrosProjectServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTests {

    @Autowired
    private ResCrosProjectServiceImpl resCrosProjectService;
    private List projects = new ArrayList<Crossproject> ();
    private Logger logger = LoggerFactory.getLogger(ServiceTests.class);

    @Test
    public void doTest() throws Exception {
        projects = resCrosProjectService.findAllByAuthorName("vince");
    }
    @After
    public void doShow() throws Exception {
        for(int i=0;i<projects.size();i++) {
            logger.info(projects.get(i).getClass().getName());
            System.out.println(projects.get(i).getClass().getName());
        }
    }
}
