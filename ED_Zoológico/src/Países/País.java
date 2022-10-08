public class País{

    public static void main(String[] args) throws Exception{
        
        ISO oIso = new ISO("BRA", "Brasil", 193.946, 8.515767);
    
       
        oIso.setDimKm2(8.515767);
        oIso.setISO("BRA");
        oIso.setNome("Brasil");
        oIso.setPopulacao(193.946);

        oIso.densidadePopulacional(193.946, 8.515767);
    }
}