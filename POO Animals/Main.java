public class Main {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        c.locomover();

        Cachorro dog = new Cachorro();
        dog.locomover();
        dog.emitirSom();
        dog.alimentar();
        dog.latir();

        System.out.println("\n");
        Tartaruga t = new Tartaruga();
        t.locomover();
        t.emitirSom();
        t.alimentar();
    }
}
