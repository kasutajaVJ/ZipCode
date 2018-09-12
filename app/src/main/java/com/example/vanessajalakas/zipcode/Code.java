package com.example.vanessajalakas.zipcode;

import java.util.ArrayList;
import java.util.List;

public class Code {
    private final List<ZipCode> list = new ArrayList<>();

    public Code() {
        for (String[] code : codes) list.add(new ZipCode(code[0], code[1]));
    }

    public List<ZipCode> search(String code, String city) {
        city = city.toLowerCase();
        List<ZipCode> lines = new ArrayList<>();
        for (ZipCode zip : list)
            if (zip.getCode().startsWith(code) && zip.getCity().toLowerCase().contains(city))
                lines.add(zip);
        return lines;

    }

    private static final String[][] codes = {
            {"10115", "Berlin-Mitte"},
            {"10243", "Friedrichshain"},
            {"10318", "Lichtenberg"},
            {"10405", "Prenzlauer Berg"},
            {"10551", "Tiergarten"},
            {"10585", "Charlottenburg"},
            {"10707", "Wilmersdorf"},
            {"10823", "Tempelhof"},
            {"10823", "Schöneberg"},
            {"10961", "Kreuzberg"},
            {"12043", "Neukölln"},
            {"12157", "Steglitz"},
            {"12203", "Lichterfelde"}
    };
}

