//package ma.ecole.Ai;
//
//public class Ai {
//    public static void main(String[] args) {
//        Graph G = new Graph();
//        String grille [][]={ { "", "" , "", "", "", "", "7", "2", ""},
//                { "", "1" , "3", "", "" , "7" , "" , "4" , ""},
//                { "2", "" , "", "", "5", "", "", "", "8"},
//                { "" , "" , "", "", "" , "6" , "4" , "7" , ""},
//                { "7", "8" , "", "4", "", "1", "", "3", "6"},
//                { "" , "9", "4", "3", "", "" , "" , "" , ""},
//                { "3", "", "", "", "6", "", "", "", "4"},
//                { "" , "7" , "", "5", "" , "" , "8", "1" , ""},
//                { "", "5", "8", "", "", "", "", "", "" }};
//// Affichage de la grille initiale
//        for(int i=0;i<9;i++){ // Ligne
//            System.out.println("");
//            for(int j=0;j<9;j++) // Colonne
//                if(((String)grille[i][j]).length()!=0)
//                    System.out.print(grille[i][j]);
//                else
//                    System.out.print(".");
//        };
//// Contraintes au niveau des lignes
//        for(int i=1;i<=9;i++) // Ligne
//            for(int j=1;j<=8;j++) // Colonne
//                for(int k=j+1;k<=9;k++){
//                    String var1 ="x"+i+""+j;
//                    String var2 ="x"+i+""+k;
//                    G.addEdge(var1, var2);
//                }
//// Contaraintes au niveau des colonnes
//        for(int i=1;i<=9;i++) // Colonne
//            for(int j=1;j<=8;j++) // Ligne
//                for(int k=j+1;k<=9;k++){
//                    String var1 ="x"+j+""+i;
//                    String var2 ="x"+k+""+i;
//                    G.addEdge(var1, var2);
//                }
//// Contraintes au niveau des sous-grilles
//        for(int ii=1;ii<=3;ii++) // Ligne de la sous-grille
//            for(int jj=1;jj<=3;jj++) { // Colonne de la sous-grille
//                int toplefti=(ii-1)*3;
//                int topleftj=(jj-1)*3;
//                for(int i=1;i<=3;i++) // Colonne dans la sous-grille
//                    for(int j=1;j<=3;j++) // Ligne dans de la sous-grille
//                    {
//                        for(int k=1;k<=3;k++)
//
//// Lignes et colonnes impliquées dans des contraintes
//// dans la sous-grille
//                            for(int l=1;l<=3;l++)
//                                if(k!=i && l!=j){
//                                    String var1 =
//
//                                            "x"+(toplefti+i)+""+(topleftj+j);
//
//                                    String var2 =
//
//                                            "x"+(toplefti+k)+""+(topleftj+l);
//}
//                        G.addEdge(var1, var2);
//                    }
//            }
//    }
//    // Tables des domaines
//    ST<String, SET<String>> domainTable = new ST<String, SET<String>>();
//    // Remplir les Domaines
//    Object[][] domains = new Object[9][9];
//for(int i=0;i<9;i++) // Colonne
//            for(int j=0;j<9;j++) // Ligne
//    domains[i][j] = new SET<String>();
//for(int i=0;i<9;i++) // Colonne
//            for(int j=0;j<9;j++){ // Ligne
//        if(((String)grille[i][j]).length()!=0)
//
//// Domaine avec une seule valeur (case remplie )
//
//            ((SET<String>)domains[i][j]).add(newString((String)grille[i][j]));
//        else{
//
//// Domaine avec {1, 2, 3, ..., 9} ( case vide)
//
//            for(int k=1;k<=9;k++)
//                ((SET<String>)domains[i][j]).add(""+k);
//        }
//    }
//// Ajouter les domaines à la table
//for(int i=1;i<=9;i++)
//            for(int j=1;j<=9;j++)
//            domainTable.put("x"+i+""+j,
//            ((SET<String>)domains[i-1][j-1]));
//    // Configuration initiale
//    ST<String, String> config = new ST<String, String>();
//for(int i=1;i<=9;i++) // Ligne
//            for(int j=1;j<=9;j++) // Colonne
//            config.put("x"+i+""+j,""); // Variables non affectées
//System.out.println("\nCalcul en cours ... ");
//    long temps1 = new Date().getTime();
//    ST<String, String> result = backtracking(config, domainTable, G);
//    long temps2 = new Date().getTime();
//// Afficher la solution
//for(int i=1;i<=9;i++){ // Ligne
//        System.out.println("");
//        for(int j=1;j<=9;j++) // Colonne
//            System.out.print(config.get("x"+i+""+j)+" ");
//    };
//System.out.println("\nTemps écoulé : "+(temps2-temps1)/1000.+"(s)");
//}
