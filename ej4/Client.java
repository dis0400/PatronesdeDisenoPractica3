package ej4;

public class Client {
    public static void main(String[] args) {
        Usuario a = new Usuario("Luisa Marino", "Aajasksnsd123");
        Usuario b = new Usuario("Ian Martinez", "Aajasksnsd123");
        Usuario c = new Usuario("Alba Laura", "Aajasksnsd123");

        Proxy p = new Proxy();

        p.addUsuario(a).addUsuario(b).addUsuario(c);

        p.login("Luis Mario", "Aajasksnsd123");
        p.login("Alba Laura", "Aajasksnsd123");
        p.login("Ian Martinez", "Aajasksnsd123");
        p.login("Ian Martinez", "223");
    }
}
