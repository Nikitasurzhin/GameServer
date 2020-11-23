
package controller;


public class member {
        private String uname,password,email;

    public member() {
        super();
    }

    public member(String uname, String password, String email) {
        super();
        this.uname = uname;
        this.password = password;
        this.email = email;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        
}
