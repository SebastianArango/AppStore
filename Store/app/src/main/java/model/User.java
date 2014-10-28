package model;

/**
 * Created by igdev on 24/10/14.
 */
public class User {
    private String usr;
    private String pass;

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean ValidatorUser (String usr, String pass){
        if (usr.equalsIgnoreCase("clave") && pass.equalsIgnoreCase("contra1")){

            return true;
        }
        return false;

    }
}
