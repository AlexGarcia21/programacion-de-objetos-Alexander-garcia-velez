package edu.alex.reto2.caja.process;


public class Calculoscaja {
    /**
     * declaramos variables para poder las usarlas nuevamente para el proceso de
     * el resumen y se vuelvan a guardar cuando el usuario ingrese nuevamente
     * su pedido.
     * Tambien puse los enunciados aqui para que el CLI se vea lo mas  limpio posible.
     */
    public static double comprasCajas = 0;
    public static double ventascajas = 0;
    public static double montoencaja = 0;
    public static double cantidadComprasCaja = 0;
    public static double cantidadVentasCaja = 0;


    public static double comprarCajas(double numerodecajas, double costo){
        double monto = numerodecajas * costo;
        /**
         * utilizamos unas variables comulativas "+=" "-="
         * para asi poder acumular las entradas del usuario
         */
    comprasCajas += monto;
    montoencaja -= monto;
    cantidadComprasCaja += numerodecajas;
        System.out.println("La compra realizada por " + numerodecajas + " cajas al precio de " + costo + "pesos es igual a " + monto);
        return monto;
    }


    public static double venderCajas(double numerodecajasavender, double costodelascajasavender) {
        double monto = numerodecajasavender * costodelascajasavender;
        ventascajas += monto;
        montoencaja += monto;
        cantidadVentasCaja += numerodecajasavender;
        System.out.println("La venta realizada por " + numerodecajasavender + " cajas al precio de " + costodelascajasavender + " es igual a " + monto);
        return monto;
    }

    public static void mostrarResumen(){
        System.out.println("Cantidad total de cajas compradas: " +cantidadComprasCaja);
        System.out.println("Cantidad total de cajas vendidas: " +cantidadVentasCaja);
        System.out.println("Ingresos generados por ventas : " +ventascajas);
        System.out.println("Egresos generados por compras : " +comprasCajas);
        System.out.println("Monto en caja : " +montoencaja);
    }
}



