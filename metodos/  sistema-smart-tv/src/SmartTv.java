public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumento de volume para:"+volume);

    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuição de voluume para:"+volume);

    }
    public void aumentarCanal(){
        canal++;

    }
    public void diminuirCanal(){
        canal--;

    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}