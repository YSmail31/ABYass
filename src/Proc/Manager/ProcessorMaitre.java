package Proc.Manager;

import Architecture.ProcessorElement;
import Simulation.StaticParametre;

public class ProcessorMaitre extends ProcessorElement {
    public ProcessorMaitre() {
            x=StaticParametre.LEGNHT_NOC/2;
            y=StaticParametre.LEGNHT_NOC/2;
    }
    ///////// Placement des taches ///////////////	
    public void Mapping(int Tnow) throws InterruptedException
    {
            // Le parcours des taches qui demandes a etre places
                    new placement(Tnow);
    }
    ///////////////// Routage des communication ///////////////
    public void Routage(int Tnow) throws InterruptedException
    {
            // Le parcours des taches qui necissitent le placement de communication
            new routage(Tnow);
    }
    //////////// Mise a jour de la plateforme ////////////////
    public void Mise_A_Jour(int Tnow) throws InterruptedException
    {
            new action_et_mise_a_jour(Tnow);
    }

}