/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sev.Serviceipm;

import java.util.List;

public interface WareHouse<E, K> {
   abstract public void create(E entity);
   abstract public void update(E entity);
   abstract public void delete(K key);
   abstract public List<E> selectALL();
   abstract public E select_by_id(K key);
   abstract public List<E> selectbySQL(String sql, Object... arg);
}
