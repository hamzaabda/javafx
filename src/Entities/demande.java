/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.sql.Date;
import java.time.LocalDateTime;

/**
 *
 * @author hamza
 */
public class demande  {
    int id_demande;
    int num_demande;
    String  date_demande;
    String type_demande;
    int id_service;
    int id_citoyen;  

    public demande() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "demande{" + "id_demande=" + id_demande + ", num_demande=" + num_demande + ", date_demande=" + date_demande + ", type_demande=" + type_demande + ", id_service=" + id_service + ", id_citoyen=" + id_citoyen + '}';
    }

    public demande( int num_demande,String date_demande, String type_demande, int id_service, int id_citoyen) {
       
        this.num_demande=num_demande;
        this.date_demande = date_demande;
        this.type_demande = type_demande;
        this.id_service = id_service;
        this.id_citoyen = id_citoyen;
    }

   

    public void setNum_demande(int num_demande) {
        this.num_demande = num_demande;
    }

    public void setDate_demande(String date_demande) {
        this.date_demande = date_demande;
    }

    public void setType_demande(String type_demande) {
        this.type_demande = type_demande;
    }

    public void setId_service(int id_service) {
        this.id_service = id_service;
    }

    public void setId_citoyen(int id_citoyen) {
        this.id_citoyen = id_citoyen;
    }

    public int getId_demande() {
        return id_demande;
    }

    public int getNum_demande() {
        return num_demande;
    }

    public String getDate_demande() {
        return date_demande;
    }

    public String getType_demande() {
        return type_demande;
    }

    public int getId_service() {
        return id_service;
    }

    public int getId_citoyen() {
        return id_citoyen;
    }
}
    