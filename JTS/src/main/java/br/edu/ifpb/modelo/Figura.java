package br.edu.ifpb.modelo;

import org.locationtech.jts.geom.Geometry;

public class Figura {

    private String nome;
    private Geometry geometria;

    public Figura(String nome, Geometry geometria) {
        this.nome = nome;
        this.geometria = geometria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "nome='" + nome + '\'' +
                ", geometria=" + geometria +
                '}';
    }
}

