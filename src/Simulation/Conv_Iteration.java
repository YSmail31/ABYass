package Simulation;

import java.util.LinkedList;
import Application.ApplicationSdf;
import Application.Channel;

public class Conv_Iteration {

    public Conv_Iteration(int idapp) {
        boolean etat = false;
        boolean a;
        while (etat == false) {
            LinkedList<Integer> listact = new LinkedList<Integer>();
            for (int j = 0; j < ParametreSdf.listApplicationSdf.get(idapp).getListActor().size(); j++) {
                a = true;
                //si tout les ports (in) leur rate <= nbToken de leur canal ajouter indice acteur 
                for (int s = 0; s < ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(j).Ports.size(); s++) {
                    if (ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(j).Ports.get(s).type.equals("in")) {
                        int idchan = ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(j).Ports.get(s).idchannel;
                        int rate = ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(j).Ports.get(s).rate;
                        int nb_token = ParametreSdf.listApplicationSdf.get(idapp).getListChannel().get(idchan).nb_Token;
                        if (rate > nb_token) {
                            a = false;
                        }
                    }
                }
                if (a == true) {
                    listact.add(j);
                }
            }
            //pour chaque acteur pris dans la liste ajouter ou decrementer rate
            for (int j = 0; j < listact.size(); j++) {
                for (int s = 0; s < ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(listact.get(j)).Ports.size(); s++) {
                    if (ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(listact.get(j)).Ports.get(s).type.equals("in")) {
                        int idchan = ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(listact.get(j)).Ports.get(s).idchannel;
                        int rate = ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(listact.get(j)).Ports.get(s).rate;
                        ParametreSdf.listApplicationSdf.get(idapp).getListChannel().get(idchan).nb_Token -= rate;
                    }
                    if (ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(listact.get(j)).Ports.get(s).type.equals("out")) {
                        int idchan = ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(listact.get(j)).Ports.get(s).idchannel;
                        int rate = ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(listact.get(j)).Ports.get(s).rate;
                        ParametreSdf.listApplicationSdf.get(idapp).getListChannel().get(idchan).nb_Token += rate;
                    }
                }
                ParametreSdf.listApplicationSdf.get(idapp).getListActor().get(listact.get(j)).iteration ++;
            }
            etat = test(idapp); 
        } 
    }

    private boolean test(int i) {
        boolean etat = true; 
        for (int j = 0; j < ParametreSdf.listApplicationSdf.get(i).getListActor().size(); j++) {
            if (ParametreSdf.listApplicationSdf.get(i).getListActor().get(j).iteration == 0) {
                etat = false;
            }
        }
        return etat;
    }
}
