package com.example.jpademo.dao;

import com.example.jpademo.domain.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRepository extends JpaRepository<user,Integer> {

    //ctrl+o 查看继承的方法
    List<user> findById(int id);

}