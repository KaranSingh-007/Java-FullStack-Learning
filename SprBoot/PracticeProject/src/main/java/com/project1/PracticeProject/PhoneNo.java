package com.project1.PracticeProject;

public class PhoneNo {

    private String fathername;
    private String mothername;

    public PhoneNo() {
        super();
    }

    public PhoneNo(String fathername, String mothername) {
        this.fathername = fathername;
        this.mothername = mothername;
    }

    public String getfathername() {
        return fathername;
    }

    public String getmothername() {
        return mothername;
    }

    public void setfathername(String fathername) {
        this.fathername = fathername;
    }

    public void setmothername(String mothername) {
        this.mothername = mothername;
    }

    
    @Override
    public String toString(){
        return "PhoneNo [FatherName=" +fathername + ",MotherName=" + mothername + "]";
    }
    
}
