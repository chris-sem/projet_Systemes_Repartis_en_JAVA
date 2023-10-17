package monserveur;

public class Matrice {
    public int ligne ;
    public int colonne ;
    public double t[][] ;
    
    /* Constructeur créant une matrice, depuis des elements contenus dans la chaine de caracteres envoyée 
    en parametre ...  */
    public Matrice(String chaine , int ligne , int colonne){
        this.ligne = ligne ;
        this.colonne = colonne ;
        t = new double [ligne][colonne] ;
        
        System.out.println(chaine);
        
        String tbString [] = chaine.split(",") ;
        
        int i = 0 ; // indice de parcours de tbString
        
        for(int k=0 ; k<ligne ; k++){
            for(int j=0 ; j<colonne ; j++){
                t[k][j] = Double.parseDouble(tbString[i]);
                i++ ;
            }
        }
       
    }
    
    public void afficherMatrice (){
        for(int i=0 ; i<ligne ; i++){
            for(int j=0 ; j<colonne ; j++){
                System.out.print(this.t[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    
   
    /* La fonction --multiplierTableaux--, multiplie deux tableaux 
    et envoie le resultat sous forme de chaine de caracteres */
    public static String muliplierTabeaux(double mat1[][] , double mat2[][]){
        
        String st = "";
        int a = mat1.length ;
        int b = mat2[0].length ;
        int c = mat2.length ;
        
        double prod [][] = new double [a][b] ;
        
        for (int lg = 0; lg < a ; lg++) {
            for (int col = 0; col < b; col++) {
                prod[lg][col] = 0.0;
                for (int i = 0; i < c; i++) {
                        prod[lg][col] += mat1[lg][i] * mat2[i][col];
                          
                }
            }
        }
        
        // Transformation du produit en chaine de caractere !
        
        for(int i=0 ; i<a ; i++){
            for(int j=0 ; j<b ; j++){
                if ((j+1) == b )
                    st = st + prod[i][j]+ ";" ;
                else
                    st = st + prod[i][j]+ " , " ;
            }
        }
        
        System.out.println(st);
        
        return st.substring (0, st.length () - 1) ; // suppression du dernier carectere, le dernier point-virgule (;)
        
    }
    
    /* La fonction --multiplierMatrices--, multiplies les tableau à l'interieur des matrices et revoie 
    le resultat sous forme de chaine de caracteres */
    public static String multiplierMatrices(Matrice m1 , Matrice m2){
        return muliplierTabeaux(m1.t, m2.t) ;
    }
    
}
