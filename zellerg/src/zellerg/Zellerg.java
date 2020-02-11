
package zellerg;


public class Zellerg {

    public static void main(String[] args) {
        //Declaraciones Globales
        int d = ZellerG(28, 2, 1996);
        System.out.println(d);
        String [] arrayDias;
        arrayDias = new String [] {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        System.out.println(arrayDias[d]);
    }
    private static int ZellerG(int Day,int Month, int Year){
        int Zeller;
        Month = (Month + 10) % 12;
        Year = Year -1 * ((Month > 10)?1:0);
        Zeller = (13 * Month - 1) / 5 + 1 + Year % 100 + (Year % 100) / 4 + (-2 * (Year / 100)) + (Year / 400) % 7;
        Zeller = ((Zeller + Day) % 7 + 6) % 7;
        return Zeller;
    }
}
