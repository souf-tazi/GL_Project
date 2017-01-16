/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soufiane
 */
public class Vol {
    
	private int numVoyage;
	private int dateDepart;
	private int heureDepart;
	private int dateArret;

    @Override
    public String toString() {
        return "Vol{" + "numVoyage=" + numVoyage + ", dateDepart=" + dateDepart + ", heureDepart=" + heureDepart + ", dateArret=" + dateArret + ", heureArret=" + heureArret + '}';
    }

    public int getNumVoyage() {
        return numVoyage;
    }

    public int getDateDepart() {
        return dateDepart;
    }

    public int getHeureDepart() {
        return heureDepart;
    }

    public int getDateArret() {
        return dateArret;
    }

    public int getHeureArret() {
        return heureArret;
    }
	private int heureArret;

	public Vol() {
		// TODO - implement Vol.Vol
		throw new UnsupportedOperationException();
	}

	public void ouvrirReservation() {
		// TODO - implement Vol.ouvrirReservation
		throw new UnsupportedOperationException();
	}

	public void fermerReservation() {
		// TODO - implement Vol.fermerReservation
		throw new UnsupportedOperationException();
	}

}