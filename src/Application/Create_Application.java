package Application;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import Simulation.StaticParametre;

/**
 * Cette classe permet de charger les applications � partir d'un fichier de sp�cification xml donn� en entrer 
 * 
 * 
 *
 */

public class Create_Application {

	/**
	 *  Document XML
	 * 
	 */
	private static Document document;
	

	public static void remplirTaches(String lienFichier){
		
		/**
		 *  Creation d'une list d'application
		 * 
		 */
		StaticParametre.listApplication = new LinkedList<Application>();
		
		
		
		SAXBuilder sax =new SAXBuilder();
		
		try {

			document = sax.build(new File(""+lienFichier));
			//r�cup�rer la racine <list_applicatio>
			Element racine = document.getRootElement();
		
			//r�cup�rer la list des balise <application>
			List element = racine.getChildren("application");
			
			// parcourir les applications
			for(int m=0; m<StaticParametre.NOMBRE_APPLICATION; m++){
			
				Element balise_appli = (Element)element.get(m);
				List baliseTache = balise_appli.getChildren("tache");
				Map<Integer, Map<Integer, Integer>> table = new TreeMap<Integer, Map<Integer,Integer>>();

				// creation d'une list de Tache pour chaque application 
				LinkedList<Tache> listTache = new LinkedList<Tache>();

				//parcourir les balise <tache>
				for(int i=0;i <baliseTache.size(); i++){
					Tache a = new Tache();
					a.setIdApplication(m);
					Map<Integer, Integer> list_communication = new TreeMap<Integer, Integer>();
					Element Tache=(Element)baliseTache.get(i); 
					//le type de la Tache
					
					List baliseType=Tache.getChildren("Type_Taille");

					//parcourir les balise <type_taille>
					for(int r=0;r<baliseType.size();r++)
					{
						
						Element typ_taille=(Element)baliseType.get(r);
					
						List list_taille_par_type= typ_taille.getChildren("taille_par_type");
						for(int j=0;j<list_taille_par_type.size();j++)	// parcourir la list des balises taille_par_type					
						{
							Element g=(Element)list_taille_par_type.get(j);
						// type
						a.setType((g.getAttributeValue("Type")));
						////System.out.println("taille" +g.getAttributeValue("Taille") );
						//taille de la Tache selon le type
						a.setTailleTache((g.getAttributeValue("Type")),(g.getAttributeValue("Taille")));
						}
					}
									
					
					//id de la Tache
					a.setId(Integer.parseInt(Tache.getChild("id").getText()));
					//taille de la Tache 
				//	a.setTailleTache(Integer.parseInt(Tache.getChild("taille_tache").getText()));

					// r�cup�rer les balises <succ>
					List list_succ= Tache.getChildren("succ");

					if(!list_succ.isEmpty()){
						//parcourir les balise <succ>					
						for(int j=0; j<list_succ.size(); j++){
							Element b = (Element)list_succ.get(j);
							List list_id = b.getChildren("id_succ");
							if(!list_id.isEmpty()){
								//parcourir les balise <id_succ>
								LinkedList<Integer> list = new LinkedList<Integer>();  
								LinkedList <Integer> list1 =new LinkedList<Integer>();
								
								for(int k=0; k<list_id.size(); k++){
									Element c = (Element)list_id.get(k);
									// d�finir l'identificateur du fils
									list.add(Integer.parseInt(c.getAttributeValue("id")));
									
									// donn�es partag�es avec chaque fils
									list1.add(Integer.parseInt(c.getAttributeValue("data")));
									
								}
								a.setSucc(list);
								a.setDonneePartager(list1);
							}
						}
					}
					table.put(a.getId(), list_communication);
					listTache.add(a);
				}	
				/////////////////////////////////////
				Application appli = new Application();
				appli.setListTache(listTache);
				///////////////////////////////////////
				StaticParametre.listApplication.add(appli);
				StaticParametre.applicationAttente.add(appli);
				StaticParametre.listApplication.get(m).setId_appli(m);
				StaticParametre.Lien_Fichier_XML=lienFichier;
			}
			
		} catch (JDOMException e) {
			//JOptionPane.showMessageDialog(, "erreur dans le fichier XML");
		} catch (IOException e) {
			//JOptionPane.showMessageDialog(main.gui, "erreur dans le fichier XML");

		}
	}


}
