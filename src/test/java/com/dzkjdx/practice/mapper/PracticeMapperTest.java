package com.dzkjdx.practice.mapper;

import com.dzkjdx.practice.PracticeApplicationTests;
import com.dzkjdx.practice.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class PracticeMapperTest extends PracticeApplicationTests {
    @Autowired
    PracticeMapper practiceMapper;

    @Test
    public void addStudentByInnotation() {
        Student s = new Student();
        s.setSchool("电子科技大学");
        s.setSName("jjj");
        s.setSScore(99);
        s.setClassNum(1);
        practiceMapper.AddStudentByInnotation(s);
    }

    @Test
    public void addStudent() {
        Student s = new Student();
        s.setSchool("电子科技大学");
        s.setSName("jjj");
        s.setSScore(99);
        s.setClassNum(1);
        practiceMapper.addStudent(s);
        System.out.println(s.getSId());
    }

    @Test
    public void selectStudentByNameInnotation() {
        Student student = practiceMapper.selectStudentByNameInnotation("jjj");
        System.out.println(student.toString());
    }

    @Test
    public void selectStudentByName() {
        Student student = practiceMapper.selectStudentByName("jjj");
        System.out.println(student.toString());
    }
}