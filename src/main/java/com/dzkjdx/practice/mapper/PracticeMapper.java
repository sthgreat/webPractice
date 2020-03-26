package com.dzkjdx.practice.mapper;

import com.dzkjdx.practice.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface PracticeMapper {

    @Insert("insert into practice values (#{sId},#{sName}, #{sScore},#{classNum},#{school})")
    int AddStudentByInnotation(Student s); //insert插入后得到自增主键

    int addStudent(Student s);

    @Select("select * from practice where s_name = #{name}")
    Student selectStudentByNameInnotation(@Param(value = "name") String name);

    Student selectStudentByName(@Param(value = "name") String name);
}
