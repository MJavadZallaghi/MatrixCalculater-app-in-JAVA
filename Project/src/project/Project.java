package project;

import java.io.* ;
import java.util.* ;

public class Project {

    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hi :) wellcome to Matric Calculator\nfor each operation enter related number \n");
        System.out.println("\t 1.Sum operation \n\t 2.Subtract operation \n\t 3.Multiplication operation \n\t 4.Transpose operation \n\t 5.Determinant ");
        Scanner id = new Scanner(System.in) ; // baraye gereftane amaliyate dalkhahe karbar 
        System.out.println("Your choice : ");
        int entekhab = id.nextInt() ;
        
        
        
        if (entekhab!=4 && entekhab !=5 && entekhab !=6) //choon baraye jam va tafriq va zarb b 2 matis niyaz darim bar khalafe determinan ya taranhade ya inverse ba if jeda kardim k eshtebahi rokh nade :)
        {
        
              if (entekhab == 1)
                  Arayeh.Total();
              if (entekhab == 2)
                  Arayeh.Subtract();
              if (entekhab == 3) 
                  Arayeh.Multipliction();
        }
        else
        {
            if(entekhab == 4)
                Arayeh.Transpose();
            
            if(entekhab == 5) //methode determinan ra inja bast dadam
            {
            File a = new File("D:\\Javad\\cpProject\\Matrix1.txt") ; //tarife file avale matrise voroodi(matrix1)
            Scanner is = new Scanner(System.in) ;
            System.out.println("Matrisi k mikhahid determinane An ra\nhesab konid b soorate Matris dar file Matrix1.txt vared konid ");
        
            System.out.println("Tedaede satr ke barabar ba sotoon hast ra ra vared konid : ");
            int satr1 = is.nextInt() ;
            
            Scanner im1 = new Scanner(a) ; //scannere im1 etelaAt deraye ha ra az file a marboot b matrise 1 migirad
              
              
            double [][] m1 = new double [satr1][satr1] ; //arayeh motanazer ba file1(Matrix1.txt)
              
            while(im1.hasNext()) //ba in halqe meqdare araye ha ra az file Matrix.txt dar arayeh m1 mirizim
            {
                    
            for(int i = 0 ; i<satr1 ; i++)
            {
                for(int j=0 ; j<satr1 ;j++)
                    {
                        m1[i][j] = im1.nextDouble() ;
                          
                    }
                }
            }
            
            double determinan = Arayeh.determinant(m1, satr1) ;
            PrintWriter khodnevis = new PrintWriter("D:\\Javad\\cpProject\\MatrixKhorooji.txt") ;
            System.out.println("Determina :"+determinan);
            khodnevis.print("Determinane matrise varede : "+determinan) ;
            khodnevis.close();
            }
            
                
                
            
        }
        
        
        
    }
    
}
