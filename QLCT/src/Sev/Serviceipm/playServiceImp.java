/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sev.Serviceipm;

import database.DatabaseHelper;
import entity.player;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class playServiceImp implements WareHouse<player, String> {

    @Override
    public void create(player en) {
        String sql = "insert into player(playername,year,sex,clothersnumber,nationality,phone,email,salaly, password,role)"
                + "values(?,?,?,?,?,?,?,?,?,?)";
        DatabaseHelper.executeUpdate(sql, en.getPlayername(),
                en.getYear(),
                en.isSex(),
                en.getClothersnumber(),
                en.getNationality(),
                en.getPhone(),
                en.getEmail(),
                en.getSalaly(),
                en.getPassword(),
                en.isRole());

    }
    public player selectEmail(String email_) {
        String sql = "Select Email from player where role = 0";
        List<player> listEmail = selectbySQL(sql, email_);
        if (listEmail.isEmpty()) {
            return null;
        }
        return listEmail.get(0);
    }
    @Override
    public void update(player en) {
        String sql = "UPDATE player set playername=?,year=?,sex=?,clothersnumber=?,nationality=?,phone=?,email=?,salaly=?, password=?,role=? WHERE idPlayer =?";
        DatabaseHelper.executeUpdate(sql,
                en.getPlayername(),
                en.getYear(),
                en.isSex(),
                en.getClothersnumber(),
                en.getNationality(),
                en.getPhone(),
                en.getEmail(),
                en.getSalaly(),
                en.getPassword(),
                en.isRole(),
                en.getIdPlayer()
        );

    }

    @Override
    public void delete(String key) {
        String sql = "delete from player where idPlayer =?";
        DatabaseHelper.executeUpdate(sql, key);

    }

    @Override
    public List<player> selectALL() {
        return selectbySQL("Select * from player");
    }

    @Override
    public player select_by_id(String key) {
        String sql = "Select * from player where idPlayer =?";
        List<player> list = selectbySQL(sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);

    }

    public List<player> Select_By_Name(String name) {
        String sql = "Select * from player where playername like '%" + name + "%'";
        return selectbySQL(sql);
    }

    @Override
    public List<player> selectbySQL(String sql, Object... arg) {
        List<player> listPlay = new ArrayList<>();
        try {
            ResultSet rs = DatabaseHelper.executeQuery(sql, arg);
            while (rs.next()) {
                player pl = new player();
                pl.setPlayername(rs.getString("playername"));
                pl.setYear(rs.getDate("year"));
                pl.setSex(rs.getBoolean("sex"));
                pl.setClothersnumber(rs.getString("clothersnumber"));
                pl.setNationality(rs.getString("nationality"));
                pl.setPhone(rs.getString("phone"));
                pl.setEmail(rs.getString("email"));
                pl.setSalaly(rs.getString("salaly"));
                pl.setPassword(rs.getString("password"));
                pl.setRole(rs.getBoolean("role"));
                pl.setIdPlayer(rs.getString("idPlayer"));
                listPlay.add(pl);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPlay;

    }

}
