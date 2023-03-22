package ej3;

public class Client {
    public static void main(String[] args) {
        Archivo a = new Archivo("HolaMundo", "txt");
        a.addOracion("Hola Mundo, buenas tardes");
        a.addOracion("buenos dias hola mundo");

        Archivo b = new Archivo("Adios", "txt");
        b.addOracion("Que lastima pero Adios, me despido de ti y me voy");
        b.addOracion("Ven y cuentame la verdad, ten piedad, y dime por que");

        Archivo c = new Archivo("Importante", "docx");
        c.addOracion("L is for the way you Look at me");
        c.addOracion("O is for the Only One I see");
        c.addOracion("V is Very Very extraordinary");
        c.addOracion("E is Even more than anyone that your adore");
        c.addOracion("And LOVE is all that I can give to you");

        Folder d = new Folder("Textos");
        d.addArchivo(a);
        d.addArchivo(b);

        Folder f = new Folder("Canciones");
        f.addArchivo(c);

        UnidadDisco e = new UnidadDisco("C:");
        e.addFolder(f);
        e.addFolder(d);

        e.show();
    }
}
