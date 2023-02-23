/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class player {

    private String idPlayer;
    private String playername;
    private Date year;
    private boolean sex;
    private String clothersnumber;
    private String nationality;
    private String phone;
    private String email;
    private String salaly;
    private String password;
    private boolean role;

    public player() {
    }

    public player(String idPlayer, String playername, Date year, boolean sex, String clothersnumber, String nationality, String phone, String email, String salaly, String password, boolean role) {
        this.idPlayer = idPlayer;
        this.playername = playername;
        this.year = year;
        this.sex = sex;
        this.clothersnumber = clothersnumber;
        this.nationality = nationality;
        this.phone = phone;
        this.email = email;
        this.salaly = salaly;
        this.password = password;
        this.role = role;
    }

    public String getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClothersnumber() {
        return clothersnumber;
    }

    public void setClothersnumber(String clothersnumber) {
        this.clothersnumber = clothersnumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalaly() {
        return salaly;
    }

    public void setSalaly(String salaly) {
        this.salaly = salaly;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "player{" + "idPlayer=" + idPlayer + ", playername=" + playername + ", year=" + year + ", sex=" + sex + ", clothersnumber=" + clothersnumber + ", nationality=" + nationality + ", phone=" + phone + ", email=" + email + ", salaly=" + salaly + ", password=" + password + ", role=" + role + '}';
    }

}
