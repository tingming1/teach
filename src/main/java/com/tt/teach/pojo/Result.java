package com.tt.teach.pojo;

import org.springframework.context.annotation.Primary;

import java.io.Serializable;
import java.security.PrivateKey;

public class Result implements Serializable {
    private  Integer resultNo;
    private  Integer   studentNo;
    private  Integer       subjectNo;
    private String  examDate;
    private  Integer       studentResult;

    public void setResultNo(int resultNo) {
        this.resultNo = resultNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public void setSubjectNo(int subjectNo) {
        this.subjectNo = subjectNo;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    public void setStudentResult(int studentResult) {
        this.studentResult = studentResult;
    }
}
