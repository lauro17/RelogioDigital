package Util;

import java.awt.Color;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Analise em Curso
 */
public class UtilTransparente {

    public void aplicaTransparencia(JFrame frame) {
        frame.setUndecorated(true);
        frame.setBackground(new Color(0, 0, 0, 0));
    }

}
