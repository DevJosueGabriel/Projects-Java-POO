public class Lampada{
    boolean estadoDaLampada;

    public void acender(){
        estadoDaLampada = true;
        System.out.println("A lampada foi acesa!");
    }
    public void apagar(){
        estadoDaLampada = false;
        System.out.println("A lampada foi apagada!");
    }
}
