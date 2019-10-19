package br.edu.ifpb.modelo;

public class JtsCompiler {
    public boolean equals (Figura figuraA, Figura figuraB){
        return figuraA.getGeometria().equals(figuraB.getGeometria());
    }
    public boolean disjoint (Figura figuraA, Figura figuraB){
        return figuraA.getGeometria().disjoint(figuraB.getGeometria());
    }
    public boolean intersect (Figura figuraA, Figura figuraB){
        return figuraA.getGeometria().intersects(figuraB.getGeometria());
    }
    public boolean touches (Figura figuraA, Figura figuraB){
        return figuraA.getGeometria().touches(figuraB.getGeometria());
    }
    public boolean crosses (Figura figuraA, Figura figuraB){
        return figuraA.getGeometria().crosses(figuraB.getGeometria());
    }
    public boolean within (Figura figuraA, Figura figuraB){
        return figuraA.getGeometria().within(figuraB.getGeometria());
    }
    public boolean contains (Figura figuraA, Figura figuraB){
        return figuraA.getGeometria().within(figuraB.getGeometria());
    }
    public boolean overlaps (Figura figuraA, Figura figuraB){
        return figuraA.getGeometria().overlaps(figuraB.getGeometria());
    }
    public boolean covers (Figura figuraA, Figura figuraB){
        return figuraA.getGeometria().covers(figuraB.getGeometria());
    }
    public boolean coveredBy (Figura figuraA, Figura figuraB){
        return figuraA.getGeometria().coveredBy(figuraB.getGeometria());
    }
}