package Simulation;

import java.io.IOException;
import java.util.LinkedList;
import Application.ApplicationSdf;
import Application.Create_ApplicationSdf;
import Architecture.Create_NOC;
import Architecture.CreationCluster;
import Architecture.GenererChannel;
import Proc.Manager.ProcessorMaitre;
import java.io.FileWriter;

public class SimulatorSdf {

    public static ProcessorMaitre MAITRE;

    public SimulatorSdf() throws IOException {
    }

    public static void main(String[] args) throws Throwable {
        ParametreSdf.listApplicationSdf = new LinkedList<ApplicationSdf>();
        ParametreSdf.listactAttente = new LinkedList<Integer[]>();
        ParametreSdf.listactcours = new LinkedList<Integer[]>();
        Create_NOC.creationNoc();
        CreationCluster.creation_cluster();
        GenererChannel gen = new GenererChannel();
        gen.start();
        MAITRE = new ProcessorMaitre();
        Create_NOC.getNOC()[MAITRE.x][MAITRE.y].set_state(false);
        ParametreSdf.Tnow = 0;
        int id=0;
        for (int i = 0; i < ParametreSdf.NB_APP; i ++) {
            Create_ApplicationSdf.remplirTaches(Modele.liens.get(id%Modele.liens.size()), id);
            id++;
        }
        for (int i = 0; i < ParametreSdf.listApplicationSdf.size(); i++) {
            for (int j = 0; j < ParametreSdf.listApplicationSdf.get(i).getListChannel().size(); j++) {
                ParametreSdf.listApplicationSdf.get(i).initialiser_app(j);
            }
        }
        for (int i = 0; i < ParametreSdf.listApplicationSdf.size(); i++) {
            new Conv_Iteration(i);
        }
        for (int i = 0; i < ParametreSdf.listApplicationSdf.size(); i++) {
            for (int j = 0; j < ParametreSdf.listApplicationSdf.get(i).getListChannel().size(); j++) {
                //System.out.println("nb jeton initiale app " + i + " channel " + j + " == " + ParametreSdf.listApplicationSdf.get(i).getListChannel().get(j).initialTokens);
                ParametreSdf.listApplicationSdf.get(i).getListChannel().get(j).nb_Token = ParametreSdf.listApplicationSdf.get(i).getListChannel().get(j).initialTokens;
            }
        }
        for (int i = 0; i < ParametreSdf.listApplicationSdf.size(); i++) {
            //System.out.println("*************** initialement app num " + i + " atat " + ParametreSdf.listApplicationSdf.get(i).etat);
            for (int j = 0; j < ParametreSdf.listApplicationSdf.get(i).getListActor().size(); j++) {
                //System.out.println("  acteur " + j + " nb iteration " + ParametreSdf.listApplicationSdf.get(i).getListActor().get(j).iteration);
            }
        }
        Proc.Manager.PlacementInitSdf.Start();
        
        while (!ParametreSdf.T_next_event.isEmpty()) {
            //System.out.println(" boucle simulator time : " + ParametreSdf.Tnow);
            ParametreSdf.Tnow = ParametreSdf.T_next_event.first();
            ParametreSdf.T_next_event.pollFirst();
            Proc.Manager.placementSdf.star();
        }
        
        System.out.println("***************resultat finale*************************");
        //Interface.modeleResultat = new ModeleResultat();
        long e=0,l=0,t=0;
        for (int i = 0; i < ParametreSdf.listApplicationSdf.size(); i++) {
            int time = ParametreSdf.listApplicationSdf.get(i).getListActor().get(0).fin_execution;
            int timeDeb = ParametreSdf.listApplicationSdf.get(i).getListActor().get(0).debut_execution;
            
            for (int j = 0; j < ParametreSdf.listApplicationSdf.get(i).getListActor().size(); j++) {
                if (time < ParametreSdf.listApplicationSdf.get(i).getListActor().get(j).fin_execution) {
                    time = ParametreSdf.listApplicationSdf.get(i).getListActor().get(j).fin_execution;
                }
                
                if (timeDeb > ParametreSdf.listApplicationSdf.get(i).getListActor().get(j).debut_execution) {
                    timeDeb = ParametreSdf.listApplicationSdf.get(i).getListActor().get(j).debut_execution;
                }
            }
            System.out.println(" Energie = "+ParametreSdf.listApplicationSdf.get(i).getEnergie() + "  Latence = " + time + " Temps Execution = " + (time-timeDeb));
            e += ParametreSdf.listApplicationSdf.get(i).getEnergie();
            l += time;
            t += time-timeDeb;
            Interface.resultat.addDonnees(new String[]{ParametreSdf.listApplicationSdf.get(i).getId_appli()+"",ParametreSdf.listApplicationSdf.get(i).getEnergie()+"",time+"",(time-timeDeb)+""});
        }
        Interface.resultat.addDonnees(new String[]{"Total ",e+"",l+"",t+""});
        Interface.resultat.addDonnees(new String[]{"PEs Consulter ",ParametreSdf.nb_pe_consulter+"","",""});        
        System.out.println(" =======nombre totale des PEs consulter  : " + ParametreSdf.nb_pe_consulter);
    }
}
