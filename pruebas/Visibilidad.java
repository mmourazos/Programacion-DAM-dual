package pruebas;

public class Visibilidad {

    private int privado;

    public StringBuffer sf;

    public Visibilidad() {
        this.sf = new StringBuffer("Hola");
    }

    public Visi2 setPrivado(int privado) {
        Visi2 v = new Visi2();
        v.setPrivado(privado);
        return v;
    }

    public int getPrivado() {
        return privado;
    }

    @Override
    public String toString() {
        return String.format("%d%n", privado);
    }

    private class Visi2 extends Visibilidad {
        public Visi2 setPrivado(int privado) {
            super.privado = privado;
            return this;
        }

    }

    public static void main(String[] args) {
        Visibilidad v = new Visibilidad();

        Visi2 v2 = v.setPrivado(9);


        System.out.println(v);
        System.out.println(v2);

        StringBuffer sf1 = new StringBuffer();
        StringBuffer sf2 = new StringBuffer();

        sf1.append("Hola mundo");
        sf2.append(sf1);

        if (sf1.compareTo(sf2) == 0) {
            System.out.printf("%s es igual a %s.%n", sf1, sf2);
        } else {
            System.out.printf("%s es distinto a %s.%n", sf1, sf2);
        }

    }

}


