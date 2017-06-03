package Architecture;

import java.util.Map;
import java.util.TreeMap;
import Simulation.StaticParametre;

public class GenererChannel {

    private static Map<Integer, LienNoc> listChannel = null;

    public GenererChannel() {
        listChannel = new TreeMap<Integer, LienNoc>();
    }

    public void start() {
        LienNoc.initiialise();
        int nbrNode = (int) Math.pow(StaticParametre.LEGNHT_NOC, 2);
        for (int i = 0; i < nbrNode; i++) {
            LienNoc lien = null;
            int taille_NOC = StaticParametre.LEGNHT_NOC;
            ProcessorElement proc = StaticParametre.listProcesseur.get(i);
            int id = proc.getId();
            if (proc.x == 0 && proc.y == 0) {
                lien = new LienNoc(id, id + 1);
                listChannel.put(LienNoc.getIdCanal(), lien);
                lien = new LienNoc(id, id + taille_NOC);
                listChannel.put(LienNoc.getIdCanal(), lien);
            } else if (proc.x == 0 && proc.y > 0 && proc.y < taille_NOC - 1) {
                lien = new LienNoc(id, id + 1);
                listChannel.put(LienNoc.getIdCanal(), lien);
                lien = new LienNoc(id, id + taille_NOC);
                listChannel.put(LienNoc.getIdCanal(), lien);
            } else if (proc.x == 0 && proc.y == taille_NOC - 1) {
                lien = new LienNoc(id, id + taille_NOC);
                listChannel.put(LienNoc.getIdCanal(), lien);
            } else if (proc.x > 0 && proc.x < taille_NOC - 1 && proc.y == 0) {
                lien = new LienNoc(id, id + 1);
                listChannel.put(LienNoc.getIdCanal(), lien);
                lien = new LienNoc(id, id + taille_NOC);
                listChannel.put(LienNoc.getIdCanal(), lien);
            } else if (proc.x > 0 && proc.x < taille_NOC - 1 && proc.y > 0 && proc.y < taille_NOC - 1) {
                lien = new LienNoc(id, id + 1);
                listChannel.put(LienNoc.getIdCanal(), lien);
                lien = new LienNoc(id, id + taille_NOC);
                listChannel.put(LienNoc.getIdCanal(), lien);
            } else if (proc.x > 0 && proc.x < taille_NOC - 1 && proc.y == taille_NOC - 1) {
                lien = new LienNoc(id, id + taille_NOC);
                listChannel.put(LienNoc.getIdCanal(), lien);
            } else if (proc.x == taille_NOC - 1 && proc.y == 0) {
                lien = new LienNoc(id, id + 1);
                listChannel.put(LienNoc.getIdCanal(), lien);
            } else if (proc.x == taille_NOC - 1 && proc.y > 0 && proc.y < taille_NOC - 1) {
                lien = new LienNoc(id, id + 1);
                listChannel.put(LienNoc.getIdCanal(), lien);
            }
        }
    }

    public static synchronized Map<Integer, LienNoc> getListChannel() {
        return listChannel;
    }
}
