package com.dzkjdx.practice.mapper;

import com.dzkjdx.practice.PracticeApplicationTests;
import com.dzkjdx.practice.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void batchInsert() {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student("aaa", 89, 3, "电子科技");
        studentList.add(student);
        studentList.add(student);
        studentList.add(student);
        practiceMapper.BatchInsert(studentList);
    }

    @Test
    public void fanWeiSelect() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(92);
        l.add(97);
        List<Student> students = practiceMapper.FanWeiSelect(l);
        System.out.println(students.toString());
    }
}