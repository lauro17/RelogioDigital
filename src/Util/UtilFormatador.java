/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Analise em Curso
 */
public class UtilFormatador {

    public String retornarHora(Date pData) {
//        Date date = new Date();
        SimpleDateFormat teste = new SimpleDateFormat("hh");
        return teste.format(pData);
    }

    public String retornarMinutos(Date pData) {
       // Date date = new Date();
        SimpleDateFormat teste = new SimpleDateFormat("mm");
        return teste.format(pData);
    }

    public String retornarSegundos(Date pData) {
       // Date date = new Date();
        SimpleDateFormat teste = new SimpleDateFormat("ss");
        return teste.format(pData);
    }

    public String retornarHoraSegundos(Date pData) {
        //Date date = new Date();
        SimpleDateFormat teste = new SimpleDateFormat("hh:mm:ss");
        return teste.format(pData);
    }
    public String retornarDataHora(Date pData) {
        //Date date = new Date();
        SimpleDateFormat teste = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        return teste.format(pData);
    }
}
