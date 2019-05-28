package com.example.LadyJanesApp.Models;
import org.hibernate.validator.constraints.Email;
import javax.validation.constraints.NotNull;


public class Client {

    @NotNull
    private String password;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String username;

    private int clientId;
    private static int nextId = 1;


    public Client(){
        clientId = nextId;
        nextId++;
    }

    public Client(String password, String email, String username) {
        this.password = password;
        this.email = email;
        this.username = username;
    }

    public String getPassword() {return password;}

    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public int getClientId() {return clientId;}

    public void setClientId(int clientId) {this.clientId = clientId;}

    public static int getNextId() {return nextId;}

    public static void setNextId(int nextId) {Client.nextId = nextId;}
}
