/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.StrictMath.sqrt;
/**
 *
 * @author Giovanni
 */
public class Calc {
    private String monitor = "";
    private String risultato;
    
    private boolean som = false;
    private boolean sot = false;
    private boolean mol = false;
    private boolean div = false;
    private boolean divX = false;
    private boolean esp = false;
    private boolean neg = false;
    private boolean rad = false;
    
    
    public String schermo(String str)
    {
        //concateno la nuova stringa alla stringa già presente nel Display
        this.monitor = this.monitor + str;
        return this.monitor;
    }
    
    //metodo che rimuove l'ultimo carattere visualizzato dal monitor
    public String removeLast()
    {
	monitor = monitor.replaceFirst(".$","");
	return this.monitor;
    }
    
    public String comma()
    {
	this.monitor = this.monitor + ".";
        return this.monitor;
    }
    
    public void somma(String str)
    {
        this.risultato = str;
        som = true;
        this.monitor = "";
    }
    
    public void sottrazione(String str)
    {
        this.risultato = str;
        sot = true;
        this.monitor = "";
    }
    
    public void moltiplicazione(String str)
    {
        this.risultato = str;
        mol = true;
        this.monitor = "";
    }
    
    public void divisione(String str)
    {
        this.risultato = str;
        div = true;
        this.monitor = "";
    }
    
    public void divisionePerX(String str)
    {
        this.risultato = str;
        divX = true;
        this.monitor = "";
    }
    
    public void esponenziale(String str)
    {
        this.risultato = str;
        esp = true;
        this.monitor = "";
    }
    
    public void radice(String str)
    {
        this.risultato = str;
        rad = true;
        this.monitor = "";
    }
    
    public String risultato(String str)
    {
        if(som == true)
        {
            //converto le stringhe in valori calcolabili 
            //dopo aver eseguito la somma dei valori converto nuovamente il tutto
            //in una stringa per salvare il tutto sulla variabile "risultato"
            risultato = String.valueOf(Double.parseDouble(this.risultato)+Double.parseDouble(str));
            som = false;
        }
        else if(sot == true)
        {
            risultato = String.valueOf(Double.parseDouble(this.risultato)-Double.parseDouble(str));
            sot = false;  
        }
        else if(mol == true)
        {
            risultato = String.valueOf(Double.parseDouble(this.risultato)*Double.parseDouble(str));
            mol = false;  
        }
        else if(div == true)
        {
            risultato = String.valueOf(Double.parseDouble(this.risultato)/Double.parseDouble(str));
            div = false;  
        }
        else if(divX == true)
        {
            risultato = String.valueOf(1/Double.parseDouble(this.risultato));
            divX = false;  
        }
        else if(esp == true)
        {
            risultato = String.valueOf(Double.parseDouble(this.risultato)*Double.parseDouble(this.risultato));
            esp = false;  
        }
        else if(rad == true)
        {
            risultato = String.valueOf(sqrt(Double.parseDouble(this.risultato)));
            rad = false;  
        }
        
        return risultato;
    }
}
