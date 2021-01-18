package com.example.demo.sym.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.cmm.utl.Box;
import com.example.demo.sts.service.Grade;
import com.example.demo.sts.service.GradeVo;
import java.util.Vector;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}