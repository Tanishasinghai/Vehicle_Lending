/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.Details;

/**
 *
 * @author tanis
 */
public class complain {
    private int id;
    private String name;
    private String email;
    private String complain;
    
    complain(){
        
    }

    public complain(int id, String name, String email, String complain) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.complain = complain;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }
}
