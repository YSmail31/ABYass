package Architecture;

import Simulation.StaticParametre;

public class CreationCluster {

    private static boolean[] etat_cluster;

    public CreationCluster() {
        etat_cluster = null;
    }

    public static void creation_cluster() {
        int tailleCluster = StaticParametre.TAILLE_CLUSTER;
        int id = 0;
        int r = 0;
        for (int i = 0; i < StaticParametre.LEGNHT_NOC; i = i + tailleCluster) {
            for (int j = 0; j < StaticParametre.LEGNHT_NOC; j = j + tailleCluster) {
                int dif = tailleCluster - (StaticParametre.LEGNHT_NOC - i);
                int dif1 = tailleCluster - (StaticParametre.LEGNHT_NOC - i);
                Cluster c = new Cluster();
                if (i + tailleCluster <= StaticParametre.LEGNHT_NOC && j + tailleCluster <= StaticParametre.LEGNHT_NOC) {
                    c = new Cluster(id, i, j, i+2, j+2);
                } else if (i + tailleCluster > StaticParametre.LEGNHT_NOC && j + tailleCluster <= StaticParametre.LEGNHT_NOC) {
                    c = new Cluster(id, i-dif, j, i-dif+2, j+2);
                } else if (j + tailleCluster > StaticParametre.LEGNHT_NOC && i + tailleCluster > StaticParametre.LEGNHT_NOC) {
                    c = new Cluster(id, i, j-dif1, i+2, j-dif1+2);
                } else if (j + tailleCluster <= StaticParametre.LEGNHT_NOC && i + tailleCluster > StaticParametre.LEGNHT_NOC) {
                    c = new Cluster(id-dif, i, j-dif1, i-dif+2, j-dif1+2);
                }
                StaticParametre.listClusters[r] = c;
                r++;
                id++;
            }
        }
        etat_cluster = new boolean[StaticParametre.listClusters.length];
    }

    public static void setEtatCluster(int id_cluster, boolean etat) {
        etat_cluster[id_cluster] = etat;
    }

    public static boolean[] getEtat_Cluster() {
        return etat_cluster;
    }
}
