/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Akira
 */
public class Student {
    
    private int id;
    private String name;
    private String grade;
    
    //konstruktor
    public Student(){
    }
    
    public Student(int id, String name, String grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        
    }
    
    //proses get set
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void SetName(String name){
        this.name = name;
    }
    
    public String getGrade(){
        return grade;
    }
    
    public void setName(String grade){
        this.grade = grade;
    }
}
