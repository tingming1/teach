package com.tt.teach.pojo;

import java.io.Serializable;
import java.security.PrivateKey;

public class Grade implements Serializable {
private  Integer gradegradeID;
    private  String gradeName;

    public void setGradegradeID(int gradegradeID) {
        this.gradegradeID = gradegradeID;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}
