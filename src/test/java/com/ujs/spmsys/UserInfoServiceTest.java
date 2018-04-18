package com.ujs.spmsys;

import com.ujs.spmsys.entity.Userinfo;
import com.ujs.spmsys.service.UserinfoService;
import com.ujs.spmsys.service.impl.UserinfoServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoServiceTest {
    @Autowired
    private UserinfoServiceImpl userinfoService;
    private Userinfo userinfo;

    @Before
    public void before() throws Exception {
        userinfo = new Userinfo();
        userinfo.setAccountid(1);
        userinfo.setName("vince");
        userinfo.setStaffnum(123456);
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        userinfo.setBirthday(format1.parse("1996-11-21"));
        userinfo.setAccounttype("researcher");
        userinfo.setAddress("addr:xxxxx");
        userinfo.setEmail("2718904285@qq.com");
        userinfo.setJob("professor");
    }
    @Test
    public void insertUserinfo() throws Exception {
//        userinfoService.save(userinfo);
    }
}
