public class controleTv {
    public static void main (String [] args) {
        minhaTV televisao = new minhaTV();
        System.out.println("\nAntes das modificacoes");
        System.out.println("Estado da televisao: " + televisao.estado);
        System.out.println("Canal da televisao: " + televisao.canal);
        System.out.println("Volume da televisao: " + televisao.volume);
    
        televisao.mudaEstado();
        televisao.mudaCanal(5);
        televisao.aumentaVolume();
        televisao.aumentaVolume();
        televisao.aumentaVolume();
        televisao.diminuiVolume();

        System.out.println("\nDepois das modificacoes");
        System.out.println("Estado da televisao: " + televisao.estado);
        System.out.println("Canal da televisao: " + televisao.canal);
        System.out.println("Volume da televisao: " + televisao.volume);
    
    }

}
