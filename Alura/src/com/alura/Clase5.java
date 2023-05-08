package com.alura;

import model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase5 {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Ruby", 30);
        Curso curso2 = new Curso("PHP", 10);
        Curso curso3 = new Curso("JavaScrip", 20);
        Curso curso4 = new Curso("Java", 50);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

        //Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
        //System.out.println(cursos);

        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println(cursoList);

    }
}
