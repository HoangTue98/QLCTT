/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sev.Service;

import Business.DTO.playerDTO;
import Sev.Serviceipm.playServiceImp;
import entity.player;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class playService {

    playServiceImp serviceImp = new playServiceImp();

    public void insertNV(player entity) {
        serviceImp.create(entity);
    }

    public List<playerDTO> selectNv() {
        List<player> listStaff = serviceImp.selectALL();
        List<playerDTO> listDTO = new ArrayList<>();
        for (player x : listStaff) {
            playerDTO plDTO = new playerDTO();
            plDTO.setPlayername(x.getPlayername());
            plDTO.setYear(x.getYear());
            plDTO.setSex(x.isSex());
            plDTO.setClothersnumber(x.getClothersnumber());
            plDTO.setNationality(x.getNationality());
            plDTO.setPhone(x.getPhone());
            plDTO.setEmail(x.getEmail());
            plDTO.setSalaly(x.getSalaly());
            plDTO.setPassword(x.getPassword());
            plDTO.setRole(x.isRole());
            listDTO.add(plDTO);
        }
        return listDTO;
    }
        public List<playerDTO> getAll() {
        List<player> listPlayer = serviceImp.selectALL();
        List<playerDTO> listDTO = new ArrayList<>();
        for (player x : listPlayer) {
            playerDTO pDTO = new playerDTO();
            pDTO.setEmail(x.getEmail());
            pDTO.setPassword(x.getPassword());
            listDTO.add(pDTO);
        }
        return listDTO;
    }
            public List<playerDTO> getEmail() {
        List<player> listStaff = serviceImp.selectALL();
        List<playerDTO> listDTO = new ArrayList<>();
        for (player x : listStaff) {
            playerDTO pDTO = new playerDTO();
            pDTO.setEmail(x.getEmail());
            pDTO.setPassword(x.getPassword());
            listDTO.add(pDTO);
        }
        return listDTO;
    }
}
