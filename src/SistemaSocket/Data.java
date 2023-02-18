package SistemaSocket;

import java.text.DateFormat;
import java.util.Date;

public class Data {

    Date data = new Date();
    DateFormat dataF = DateFormat.getDateInstance();
    String dataFormatada = dataF.format(data);

    public String toString() {
        return dataFormatada;
    }
}
