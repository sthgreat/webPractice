package com.dzkjdx.practice.pojo;

import lombok.Data;

@Data
public class Student {
    int sId;
    String sName;
    int sScore;
    int classNum;
    String school;

    public Student(){

    }

    public Student(String sName, int sScore, int classNum, String school) {
        this.sName = sName;
        this.sScore = sScore;
        this.classNum = classNum;
        this.school = school;
    }
}
