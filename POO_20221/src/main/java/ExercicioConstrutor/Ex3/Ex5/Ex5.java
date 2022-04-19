package ExercicioConstrutor.Ex3.Ex5;

public class Ex5 {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        
        tv.estadoTV();
        
        tv.setLigaDesliga();
        tv.estadoTV();
        
        tv.setCanal(50);
        tv.estadoTV();
        
        tv.silenciaTV();
        tv.estadoTV();
        
        tv.setLigaDesliga();
        tv.estadoTV();
        
        tv.setLigaDesliga();
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