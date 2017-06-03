package Architecture;

public class Cluster {

    public int id;

    public int xCentre;

    public int yCentre;

    private int xDebut;

    private int yDebut;

    private int xFin;

    private int yFin;

    public boolean Free = true;

    
    public Cluster(int id, int xDebut, int yDebut, int xFin, int yFin) {
        this.xDebut = xDebut;
        this.yDebut = yDebut;
        this.xFin = xFin;
        this.yFin = yFin;
        this.id = id;
        setCenter();
    }
    public Cluster() {
        this.xDebut = 0;
        this.yDebut = 0;
        this.xFin = 0;
        this.yFin = 0;
        this.id = 0;
        setCenter();
    }
    
    public void setCenter() {
        this.xCentre = (xFin + xDebut) / 2;
        this.yCentre = (yFin + yDebut) / 2;        
    }
    
    public void setCenter(int x_debut, int x_fin, int y_debut, int y_fin) {
        this.xCentre = (x_fin + x_debut) / 2;
        this.yCentre = (y_fin + y_debut) / 2;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCoordonneesDebut(int xDebut, int yDebut) {
        this.xDebut = xDebut;
        this.yDebut = yDebut;
    }

    public void setCoordonneesFin(int xFin, int yFin) {
        this.xFin = xFin;
        this.yFin = yFin;
    }

    public int getxDebut() {
        return xDebut;
    }

    public int getyDebut() {
        return yDebut;
    }

    public int getxFin() {
        return xFin;
    }

    public int getyFin() {
        return yFin;
    }

    public synchronized void set_Free(boolean F) {
        Free = F;
    }

    public synchronized boolean get_Free() {
        return Free;
    }
}
