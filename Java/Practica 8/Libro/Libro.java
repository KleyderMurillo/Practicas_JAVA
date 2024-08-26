package Libro;

class Libro {

    // atributos - propiedades

    int ISBN;
    String Titulo;
    String Autor;
    int NumPaginas;

    public Libro (int ID, String T, String A, int P){ /*  constructor que declara que 
        tipo de dato se usa y que variable se le asigna */
        ISBN = ID;
        Titulo = T;
        Autor = A;
        NumPaginas = P;
    }

    public void setISBN(int ISBN){  // metodo para asignar el ISBN
        this.ISBN = ISBN;
    }

    public int getISBN (){ // metodo para obtener el ISBN
        return ISBN;
    }

    public void setTitulo(String Titulo){ // metodo para asignar el titulo
        this.Titulo = Titulo;
    }

    public String getTitulo(){ // metodo para obtener el titulo
        return Titulo;
    }

    public void setAutor(String Autor){ // metodo para asignar el autor
        this.Autor = Autor;
    }

    public String getAutor(){ // metodo para obtener el autor
        return Autor;
    }

    public void setNumPaginas(int NumPaginas){ // metodo para asignar el numero de paginas
        this.NumPaginas = NumPaginas;
    }

    public int getNumPaginas(){ // metodo para obtener el numero de paginas
        return NumPaginas;
    }
    
    public String toString(){ // metodo string para imprimir los datos
        return "El libro " + Titulo + " con ISBN de: "+ ISBN + " creado por " + Autor + " tiene " + NumPaginas + " paginas";
    }
}