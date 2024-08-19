package DiaAnyo;

class DiaAnyo {

    // atrivutos-propiedades
    private int mes;
    private int dia;

    public DiaAnyo(int d, int m){ // constructor

        dia = d; //se declara el dia con la letra d
        mes = m; // se declara el mes con la letra m

    }

    public boolean igual (DiaAnyo d){ // metodo tipo booleano
        if ((dia == d.dia) && (mes == d.mes)){ // compara si el dia y el mes ingresados son los mismos
        return true;
        }
        else{
        return false;
        }
    }

    public void visualizar(){ // metodo sin retorno
        System.out.println("mes = " + mes + " , dia = " + dia); // se imprimen los dias y meses ingresados
    }
    
}
