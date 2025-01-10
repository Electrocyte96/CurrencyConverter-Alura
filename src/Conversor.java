public class Conversor {
    ConsultaConversion consultar = new ConsultaConversion();
    RespuestaConversion tazasDeCambio = consultar.consultaHTTP();

    public double convertir(int accion, double monto){
        if(accion == 1){
            return monto * tazasDeCambio.getConversion_rates().get("ARS");
        } else if (accion == 2) {
            return monto / tazasDeCambio.getConversion_rates().get("ARS");
        } else if (accion == 3) {
            return monto * tazasDeCambio.getConversion_rates().get("BRL");
        } else if (accion == 4) {
            return monto / tazasDeCambio.getConversion_rates().get("BRL");
        } else if (accion == 5) {
            return monto * tazasDeCambio.getConversion_rates().get("COP");
        } else if (accion == 6) {
            return monto / tazasDeCambio.getConversion_rates().get("COP");
        }
        return 0;
    }
}
