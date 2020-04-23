/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-22 19:43:53
 * @modify date 2020-04-22 19:43:53
 * @desc User Entity
 */
package com.gagan.shoppingcartservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Stores User credentials
 * Inherited by Customer 
 *  @see Customer
 */
@Entity
@Table(name = "shopping_user_table")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    /**
     * USer name is teh [rimary key]
     */
    @Id
    @Column(name = "username")
    private String username;
    /**
     * Password
     */
    @Column(name = "password")
    private String password;

    /**
     * Default COsnturctor
     */
    public User() {}

    /**
     * Parameteried constructor
     */
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }


}