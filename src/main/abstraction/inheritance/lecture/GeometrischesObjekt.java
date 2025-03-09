package main.abstraction.inheritance.lecture;

public class GeometrischesObjekt {

    double berechneFlaeche() {
        return 0;
    }

    double berechneUmfang() {
        return 0;
    };
}

class Punkt extends GeometrischesObjekt {
    double x, y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
        
    }

    @Override
    double berechneFlaeche() {
        return 0;
    }

    @Override
    double berechneUmfang() {
        return 0;
    }
}

class Strecke extends GeometrischesObjekt {
    Punkt a, b;

    public Strecke(Punkt a, Punkt b) {
        this.a = a;
        this.b = b;
    }

    double laenge() {
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }

    @Override
    double berechneFlaeche() {
        return 0;
    }

    @Override
    double berechneUmfang() {
        return laenge();
    }
}

class Mehreck extends GeometrischesObjekt {
    Punkt[] eckpunkte;

    public Mehreck(Punkt[] eckpunkte) {
        this.eckpunkte = eckpunkte;
    }

    @Override
    double berechneFlaeche() {
        // Implementierung für allgemeines Polygon
        return 0;
    }

    @Override
    double berechneUmfang() {
        double umfang = 0;
        for (int i = 0; i < eckpunkte.length; i++) {
            Punkt p1 = eckpunkte[i];
            Punkt p2 = eckpunkte[(i + 1) % eckpunkte.length];
            umfang += new Strecke(p1, p2).laenge();
        }
        return umfang;
    }
}

class Viereck extends Mehreck {
    public Viereck(Punkt a, Punkt b, Punkt c, Punkt d) {
        super(new Punkt[] { a, b, c, d });
    }
}

class Rechteck extends Viereck {
    double breite, hoehe;

    public Rechteck(Punkt a, double breite, double hoehe) {
        super(a, new Punkt(a.x + breite, a.y), new Punkt(a.x + breite, a.y + hoehe), new Punkt(a.x, a.y + hoehe));
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    double berechneFlaeche() {
        return breite * hoehe;
    }

    @Override
    double berechneUmfang() {
        return 2 * (breite + hoehe);
    }
}

class Quadrat extends Rechteck {
    public Quadrat(Punkt a, double seitenlaenge) {
        super(a, seitenlaenge, seitenlaenge);
    }
}

class Dreieck extends Mehreck {
    public Dreieck(Punkt a, Punkt b, Punkt c) {
        super(new Punkt[] { a, b, c });
    }

    @Override
    double berechneFlaeche() {
        double s = berechneUmfang() / 2;
        double a = new Strecke(eckpunkte[0], eckpunkte[1]).laenge();
        double b = new Strecke(eckpunkte[1], eckpunkte[2]).laenge();
        double c = new Strecke(eckpunkte[2], eckpunkte[0]).laenge();
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
