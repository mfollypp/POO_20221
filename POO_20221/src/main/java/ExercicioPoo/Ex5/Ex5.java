package ExercicioPoo.Ex5;

public class Ex5 {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        
        tv.estadoTV();
        
        tv.ligaDesligaTV();
        tv.estadoTV();
        
        tv.mudaCanal();
        tv.estadoTV();
        
        tv.silenciaTV();
        tv.estadoTV();
        
        tv.ligaDesligaTV();
        tv.estadoTV();
        
        tv.ligaDesligaTV();
        tv.estadoTV();
        
        tv.silenciaTV();
        tv.estadoTV();
        
        tv.aumentaVolume();
        tv.estadoTV();
        
        tv.aumentaVolume();
        tv.estadoTV();
        
        tv.diminuiVolume();
        tv.estadoTV();
    }
}