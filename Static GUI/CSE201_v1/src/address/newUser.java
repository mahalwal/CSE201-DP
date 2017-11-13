/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Mahalwal's
 */
public class newUser implements Serializable{
    public String username, fullname, password, repassword, email, type;

    public newUser(String username, String fullname, String email, String password, String repassword, String type) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.repassword = repassword;
        this.email = email;
        this.type = type;
    }

    @Override
    public String toString() {
        return "newUser{" + "username=" + username + ", fullname=" + fullname + ", password=" + password + ", repassword=" + repassword + ", email=" + email + ", type=" + type + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final newUser other = (newUser) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
}