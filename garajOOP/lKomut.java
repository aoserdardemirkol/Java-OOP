package com.garajOOP;

import java.util.HashMap;

public class lKomut implements islemsecInterface {

    @Override
    public String islemSec(String islem, Garaj grj, int tip, int garajBoyut) {
        HashMap<Integer, Integer> aracAlan = new HashMap<>();
        aracAlan.put(1, 1);
        aracAlan.put(2, 1);
        aracAlan.put(3, 2);
        aracAlan.put(4, 3);
        aracAlan.put(5, 5);
        aracAlan.put(6, 8);

        HashMap<Integer, String> aracIsim = new HashMap<>();
        aracIsim.put(1, "Bisiklet");
        aracIsim.put(2, "Motorsiklet");
        aracIsim.put(3, "Araba");
        aracIsim.put(4, "Kamyonet");
        aracIsim.put(5, "Otobüs");
        aracIsim.put(6, "Tır");


        if (grj.getAracList().size() == 0){
            return ("---------- Garaj Boş");
        }
        return ("---------- Liste: " + grj.getAracList() + " Yer Durumu: " + grj.getYer());
    }
}
