package com.example.jpademo;

import com.example.jpademo.dao.userRepository;
import com.example.jpademo.domain.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JpademoApplicationTests {


    @Autowired userRepository userRepository;
    @Test
    void contextLoads() {
    }

   /**@Test
    public void testsave(){
        user user = new user();
        user.setB_id(15);
        user.setMonth("2022-09");
        user.setScore(100);
        user.setSchool_id("sw977");


        System.out.println(userRepository.findById(1));

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(userRepository.findAllById(a));

        List<user> alluser = userRepository.findAll();
        for (user b:alluser) {
            System.out.println(b);

        }
    }



    @Test
    public void pagetest(){
        //显示第三页，每页两条数据
        PageRequest pager = PageRequest.of(3, 2);
        Page<user> page = userRepository.findAll(pager);
        List<user> usercontent = page.getContent();
        for (user c:usercontent) {
            System.out.println(c);
        }
    }
    @Test
    public void test1(){
        List<user> usersw97 = userRepository.findBycondition1("2020-01", "sw977");
        for (user d:usersw97) {
            System.out.println(d);
        }
    }

    @Test
    public void test2(){
        List<user> users = userRepository.findBycondition2("2020");
        for (user d:users) {
            System.out.println(d);
        }
    }
*/

}
