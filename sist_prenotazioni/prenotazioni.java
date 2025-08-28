
public class prenotazioni {
    String cliente;
    String data;
    int postiRichiesti;
    boolean validaPrenotazione;

    public prenotazioni(String cliente, String data, int postiRichiesti){
        this.cliente=cliente;
        this.data=data;
        this.postiRichiesti=postiRichiesti;
    }
    public String getCliente(){
        return cliente;
    }
    public String getdata(){
        return data;
    }
    public int getpostiRichiesti(){
        return postiRichiesti;
    }

    public void stampaDettagli(){
        System.out.println("Cliente: " + cliente + ", Data: " + data + ", Numero di posti richiesti: " + postiRichiesti);
    }
    public void controllaPrenotazione(){
        if (validaPrenotazione){
            System.out.println("Prenotazione valida");
        }
        else{
            System.out.println("Prenotazione non valida");
        }
    }
    public boolean validaPrenotazione(){
        return validaPrenotazione=true;
    }
}

