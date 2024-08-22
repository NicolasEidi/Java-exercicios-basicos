public class minhaTV {
    boolean estado = false;
    int canal = 21;
    int volume = 50;

    public void mudaEstado(){
        estado = !estado;
    }

    public void aumentaVolume(){
        volume++;
    }
     
    public void diminuiVolume(){
        volume--;
    }

    public void mudaCanal(int novoCanal){
        canal = novoCanal;
    }
}
