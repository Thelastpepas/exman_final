package udem.edu.co.com.controller;

import udem.edu.co.com.modelo.entitys.Lechuga;
import udem.edu.co.com.modelo.entitys.Mora;
import udem.edu.co.com.modelo.entitys.Zanahoria;
import udem.edu.co.com.modelo.interfac.Alimento;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static void lista() {

        List<Alimento> alimentos =new ArrayList<>();
        alimentos.add(new Lechuga(" prueba", "verde","1 mes"));
        alimentos.add(new Lechuga(" prueba2", "verde","1 mes"));
        alimentos.add(new Zanahoria(" prueba_zahoria","naranja", "3 meses"));
        alimentos.add(new Mora("prueba mora", "morada","6 meses"));
        System.out.printf(alimentos.toString());







    }


}
