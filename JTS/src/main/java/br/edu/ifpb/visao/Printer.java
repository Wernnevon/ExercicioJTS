package br.edu.ifpb.visao;

import br.edu.ifpb.modelo.Figura;
import br.edu.ifpb.modelo.JtsCompiler;

public class Printer {
    JtsCompiler jtsCompiler = new JtsCompiler();
    public void printPredicates ( Figura figura1, Figura figura2){
        System.out.println("Geometria A igual Geometria B: "+ jtsCompiler.equals(figura1, figura2));
        System.out.println("Geometria A é disjunta a Geometria B: "+ jtsCompiler.disjoint(figura1, figura2));
        System.out.println("Geometria A intersecta a Geometria B: "+ jtsCompiler.intersect(figura1, figura2));
        System.out.println("Geometria A toca a Geometria B: "+ jtsCompiler.touches(figura1, figura2));
        System.out.println("Geometria A cruza a Geometria B: "+ jtsCompiler.crosses(figura1, figura2));
        System.out.println("Geometria A está dentro da Geometria B: "+ jtsCompiler.within(figura1, figura2));
        System.out.println("Geometria A contem a Geometria B: "+ jtsCompiler.contains(figura1, figura2));
        System.out.println("Geometria A sobrepõe a Geometria B: "+ jtsCompiler.overlaps(figura1, figura2));
        System.out.println("Geometria A cobre a Geometria B: "+ jtsCompiler.covers(figura1, figura2));
        System.out.println("Geometria A é coberta pela Geometria B: "+ jtsCompiler.coveredBy(figura1, figura2));
        System.out.println("\n \n");
        System.out.println("Geometria B igual Geometria A: "+ jtsCompiler.equals(figura2, figura1));
        System.out.println("Geometria B  é disjunta a Geometria A: "+ jtsCompiler.disjoint(figura2, figura1));
        System.out.println("Geometria B  intersecta a Geometria A: "+ jtsCompiler.intersect(figura2, figura1));
        System.out.println("Geometria B  toca a Geometria A: "+ jtsCompiler.touches(figura2, figura1));
        System.out.println("Geometria B  cruza a Geometria A: "+ jtsCompiler.crosses(figura2, figura1));
        System.out.println("Geometria B  está dentro da Geometria A: "+ jtsCompiler.within(figura2, figura1));
        System.out.println("Geometria B contem a Geometria A: "+ jtsCompiler.contains(figura2, figura1));
        System.out.println("Geometria B  sobrepõe a Geometria A: "+ jtsCompiler.overlaps(figura2, figura1));
        System.out.println("Geometria B  cobre a Geometria A: "+ jtsCompiler.covers(figura2, figura1));
        System.out.println("Geometria B  é coberta pela Geometria A: "+ jtsCompiler.coveredBy(figura2, figura1));
    }
}
