
package oop.basic;


public class Student {
    
    
    private String st_name;
    private String st_phone;
    private String st_seid;
    private int age;

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_phone() {
        return st_phone;
    }

    public void setSt_phone(String st_phone) {
        this.st_phone = st_phone;
    }

    public String getSt_seid() {
        return st_seid;
    }

    public void setSt_seid(String st_seid) {
        this.st_seid = st_seid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public String getinfo(){
        return st_name +"\n"+ st_phone +"\n"+ st_seid +"\n"+age;
    }
        
    
    
}

