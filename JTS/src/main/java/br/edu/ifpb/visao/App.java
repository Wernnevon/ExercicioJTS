package br.edu.ifpb.visao;

import br.edu.ifpb.modelo.Figura;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

public class App {
    public static void main(String[] args) throws ParseException {
        Printer printer = new Printer();
        Figura figura1, figura2;
        Geometry geometry;
        WKTReader reader = new WKTReader();
        figura1 = new Figura("FiguraA", reader.read("POLYGON((11 11, 11 22, 22 22, 22 11, 11 11))"));
        figura2 = new Figura("FiguraB", reader.read("POLYGON((8 8, 8 16, 16 8, 8 8))"));
        printer.printPredicates(figura1, figura2);
    }
}
