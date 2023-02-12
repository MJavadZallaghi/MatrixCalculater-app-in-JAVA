package project;

import java.io.* ;
import java.util.* ;

public class Arayeh {
    private static int satr ; // motaqeyere tedade satr haye matrix
    private static int sotoon ; // moteqayere tedade sotoon haye matrix
    
    public Arayeh(int satr , int sotoon) //sazandeye class (class constructor) 
    {
        this.satr = satr ;
        this.sotoon = sotoon ;  
    }
    

    public static void Total() throws FileNotFoundException  //methode jam
    {
              File a = new File("D:\\Javad\\cpProject\\Matrix1.txt") ; //tarife file avale voroodi(matrix1)
              File b = new File("D:\\Javad\\cpProject\\Matrix2.txt") ; //tarife file dovome voroodi(matrix2)
              Scanner id = new Scanner(System.in) ;
              System.out.println("Matrise 1 ra b soorate Matris dar file Matrix1.txt vared konid ");
              
              System.out.println("Tedaede satr haye matrise 1 ra vared konid : ");
              int satr1 = id.nextInt() ;
              
              System.out.println("Tedaede sotoon haye matrise 1 ra vared konid : ");
              int sotoon1 = id.nextInt() ;
              
              Scanner im1 = new Scanner(a) ; //scannere im1 etelaAt deraye ha ra az file a marboot b matise 1 migirad
              
              
              double [][] m1 = new double [satr1][sotoon1] ; //arayeh motanazer ba file1(Matrix1.txt)
              
              while(im1.hasNext()) //ba in halqe meqdare araye ha ra az file Matrix.txt dar arayeh m1 mirizim
               {
                    
                    for(int i = 0 ; i<satr1 ; i++)
                    {
                      for(int j=0 ; j<sotoon1 ;j++)
                      {
                          m1[i][j] = im1.nextDouble() ;
                          
                      }
                    }
                }
              
              
              
              
              System.out.println("Matrise 2 ra b soorate Matris dar file Matrix2.txt vared konid ");
              
              System.out.println("Tedaede satr haye matrise 2 ra vared konid : ");
              int satr2 = id.nextInt() ;
              
              System.out.println("Tedaede sotoon haye matrise 2 ra vared konid : ");
              int sotoon2 = id.nextInt() ;
              
            if(satr1==satr2 && sotoon1==sotoon2) {
                  
              
              Scanner im2 = new Scanner(b) ; //scannere im2 etelaAt deraye ha ra az file a marboot b matise 2 migirad
              
        
              double [][] m2 = new double [satr2][sotoon2] ; //areyeh motanazer ba maqadire file2(Matrix2.txt)
              
              while(im2.hasNext()) //ba in halqe meqdare araye ha ra az file Matrix.txt dar arayeh m2 mirizim
               {
                    for(int i = 0 ; i<satr2 ; i++)
                    {
                      for(int j=0 ; j<sotoon2 ;j++)
                      {
                          m2[i][j] = im2.nextDouble() ;
                      }
                    }
                }
              
              double [][] m3 = new double [satr1][sotoon1] ; //taArif kardane arayeh motanazer ba jame 2 arayer voroodi(Matrix1+Matrix2)
              for(int i=0 ; i<satr1 ; i++)
              {
                  for(int j=0 ; j<sotoon1 ; j++)
                  {
                      m3[i][j]=m1[i][j]+m2[i][j] ; //jam kardane deraye haye motanazer har araye
                  }
              }
              
              File c = new File("D:\\Javad\\cpProject\\MatrixKhorooji.txt") ; //tarif kardane mahale file khoooji baraye chap
              
              PrintWriter khodnevis = new PrintWriter(c) ; //baraye chape matrise3 (m3) yek shei az klasee PrintWriter dorost kardam
              
              khodnevis.println("Hasel Jame 2 matris");
              for(int i=0 ; i<satr1 ; i++) //ba in loop khorooji dar file khoroojo b foeme matris khahad bood
                {
                double counter = 0 ;
                for(int j = 0 ; j<sotoon1 ; j++)
                  {
                   khodnevis.print(m3[i][j]);
                   khodnevis.print(" ");
                   counter++ ;
                  }
                if(counter==sotoon1)
                {
                khodnevis.println();
                }
                }
              
                khodnevis.close(); //bastane methode print dar file khorooji
                
                System.out.println("Natayeje amaliyate jame 2 matris ke vared \nkardid dar file MatrixKhorooji.txt neveshte shod");
              }
            else{
                System.out.println("\tEror!\nJam kardane 2 Matris zamani momken ast k tedad satr va sotoon anha yeki bashad!");
            }
              
              
        
              
              
              
              
    }
    
    public static void Subtract() throws FileNotFoundException //methode tafriq
    {
              File a = new File("D:\\Javad\\cpProject\\Matrix1.txt") ; //tarife file avale voroodi(matrix1)
              File b = new File("D:\\Javad\\cpProject\\Matrix2.txt") ; //tarife file dovome voroodi(matrix2)
              Scanner id = new Scanner(System.in) ;
              System.out.println("Matrise 1 ra b soorate Matris dar file Matrix1.txt vared konid ");
              
              System.out.println("Tedaede satr haye matrise 1 ra vared konid : ");
              int satr1 = id.nextInt() ;
              
              System.out.println("Tedaede sotoon haye matrise 1 ra vared konid : ");
              int sotoon1 = id.nextInt() ;
              
              Scanner im1 = new Scanner(a) ; //scannere im1 etelaAt deraye ha ra az file a marboot b matise 1 migirad
              
              
              double [][] m1 = new double [satr1][sotoon1] ; //arayeh motanazer ba file1(Matrix1.txt)
              
              while(im1.hasNext()) //ba in halqe meqdare araye ha ra az file Matrix.txt dar arayeh m1 mirizim
               {
                    
                    for(int i = 0 ; i<satr1 ; i++)
                    {
                      for(int j=0 ; j<sotoon1 ;j++)
                      {
                          m1[i][j] = im1.nextDouble() ;
                          
                      }
                    }
                }
              
              
              
              
              System.out.println("Matrise 2 ra b soorate Matris dar file Matrix2.txt vared konid ");
              
              System.out.println("Tedaede satr haye matrise 2 ra vared konid : ");
              int satr2 = id.nextInt() ;
              
              System.out.println("Tedaede sotoon haye matrise 2 ra vared konid : ");
              int sotoon2 = id.nextInt() ;
              
            if(satr1==satr2 && sotoon1==sotoon2) {
                  
              
              Scanner im2 = new Scanner(b) ; //scannere im2 etelaAt deraye ha ra az file a marboot b matise 2 migirad
              
        
              double [][] m2 = new double [satr2][sotoon2] ; //areyeh motanazer ba maqadire file2(Matrix2.txt)
              
              while(im2.hasNext()) //ba in halqe meqdare araye ha ra az file Matrix.txt dar arayeh m2 mirizim
               {
                    for(int i = 0 ; i<satr2 ; i++)
                    {
                      for(int j=0 ; j<sotoon2 ;j++)
                      {
                          m2[i][j] = im2.nextDouble() ;
                      }
                    }
                }
              
              double [][] m3 = new double [satr1][sotoon1] ; //taArif kardane arayeh motanazer ba tafriqe 2 arayer voroodi(Matrix1-Matrix2)
              for(int i=0 ; i<satr1 ; i++)
              {
                  for(int j=0 ; j<sotoon1 ; j++)
                  {
                      m3[i][j]=m1[i][j]-m2[i][j] ; //tafriq kardane deraye haye motanazer har araye
                  }
              }
              
              File c = new File("D:\\Javad\\cpProject\\MatrixKhorooji.txt") ; //tarif kardane mahale file khoooji baraye chap
              
              PrintWriter khodnevis = new PrintWriter(c) ; //baraye chape matrise3 (m3) yek shei az klasee PrintWriter dorost kardam
              khodnevis.println("Hasele tafriqe 2 matris");
              
              for(int i=0 ; i<satr1 ; i++) //ba in loop khorooji dar file khoroojo b foeme matris khahad bood
                {
                double counter = 0 ;
                for(int j = 0 ; j<sotoon1 ; j++)
                  {
                   khodnevis.print(m3[i][j]);
                   khodnevis.print(" ");
                   counter++ ;
                  }
                if(counter==sotoon1)
                {
                khodnevis.println();
                }
                }
              
                khodnevis.close(); //bastane methode print dar file khorooji
                
                System.out.println("Natayeje amaliyate tafriqe 2 matris ke vared \nkardid dar file MatrixKhorooji.txt neveshte shod");
              }
            else{
                System.out.println("\tEror!\nTafriq kardane 2 Matris zamani momken ast k tedad satr va sotoon anha yeki bashad!");
            }
        
    }
    
    public static void Multipliction() throws FileNotFoundException //methode zarb
    {
              File a = new File("D:\\Javad\\cpProject\\Matrix1.txt") ; //tarife file avale voroodi(matrix1)
              File b = new File("D:\\Javad\\cpProject\\Matrix2.txt") ; //tarife file dovome voroodi(matrix2)
              Scanner id = new Scanner(System.in) ;
              System.out.println("Matrise 1 ra b soorate Matris dar file Matrix1.txt vared konid ");
              
              System.out.println("Tedaede satr haye matrise 1 ra vared konid : ");
              int satr1 = id.nextInt() ;
              
              System.out.println("Tedaede sotoon haye matrise 1 ra vared konid : ");
              int sotoon1 = id.nextInt() ;
              
              Scanner im1 = new Scanner(a) ; //scannere im1 etelaAt deraye ha ra az file a marboot b matise 1 migirad
              
              
              double [][] m1 = new double [satr1][sotoon1] ; //arayeh motanazer ba file1(Matrix1.txt)
              
              while(im1.hasNext()) //ba in halqe meqdare araye ha ra az file Matrix.txt dar arayeh m1 mirizim
               {
                    
                    for(int i = 0 ; i<satr1 ; i++)
                    {
                      for(int j=0 ; j<sotoon1 ;j++)
                      {
                          m1[i][j] = im1.nextDouble() ;
                          
                      }
                    }
                }
              
              
              
              
              System.out.println("Matrise 2 ra b soorate Matris dar file Matrix2.txt vared konid ");
              
              System.out.println("Tedaede satr haye matrise 2 ra vared konid : ");
              int satr2 = id.nextInt() ;
              
              System.out.println("Tedaede sotoon haye matrise 2 ra vared konid : ");
              int sotoon2 = id.nextInt() ;
              
            if(sotoon1==satr2 ) {
                  
              
              Scanner im2 = new Scanner(b) ; //scannere im2 etelaAt deraye ha ra az file a marboot b matise 2 migirad
              
        
              double [][] m2 = new double [satr2][sotoon2] ; //areyeh motanazer ba maqadire file2(Matrix2.txt)
              
              while(im2.hasNext()) //ba in halqe meqdare araye ha ra az file Matrix.txt dar arayeh m2 mirizim
               {
                    for(int i = 0 ; i<satr2 ; i++)
                    {
                      for(int j=0 ; j<sotoon2 ;j++)
                      {
                          m2[i][j] = im2.nextDouble() ;
                      }
                    }
                }
              double [][] m3 = new double [satr1][sotoon2] ; //taArif kardane arayeh motanazer ba zarbe 2 arayer voroodi(m1[satr1][sotoon1]*m2[satr2][sotoon2])
              for(int i=0 ; i<satr1 ; i++) //tarif kardane yek halqe baraye zarb 2 matris m1*m2
              {
                  for(int j=0 ; j<sotoon2 ; j++)
                  { 
                     
                      int c=0 ;
                      for(int n = 1 ; n<=sotoon1 ; n++) 
                      {   
                          m3[i][j] += m1[i][c]*m2[c][j] ; //jomle m3[i][j] tebqe in formoole omoomi bdast miAyad
                          c++ ;
                      }
                  }
              }
              PrintWriter khodnevis = new PrintWriter("D:\\Javad\\cpProject\\MatrixKhorooji.txt") ;
              
              khodnevis.println("Haselzarbe 2 matris");
              
              for(int i=0 ; i<satr1 ; i++) //ba in loop khorooji dar file khoroojo b forme matris khahad bood
                {
                double counter = 0 ;
                for(int j = 0 ; j<sotoon2 ; j++)
                  {
                   khodnevis.print(m3[i][j]);
                   khodnevis.print(" ");
                   counter++ ;
                  }
                if(counter==sotoon2)
                {
                khodnevis.println();
                }
                }
              
                khodnevis.close(); //bastane methode print dar file khorooji
        
            }
            else //baraye irad yabi neveshtim k karbar motevaje shavad va eslah konad...
            {
               System.out.println("\tERROR\t\nZarbe 2 matris feqat\nzamani momken ast\nke tedade sotoon haye avali ba satr haye\ndovomi barabar bashd!");
            }
    
 
}

    public static void Transpose() throws FileNotFoundException //methode taranhade 
    {
        File a = new File("D:\\Javad\\cpProject\\Matrix1.txt") ; //tarife file avale matrise voroodi(matrix1)
        Scanner id = new Scanner(System.in) ;
        System.out.println("Matrisi k mikhahid taranhadeye An ra\nhesab konid b soorate Matris dar file Matrix1.txt vared konid ");
        
        System.out.println("Tedaede satr haye matrise 1 ra vared konid : ");
        int satr1 = id.nextInt() ;
              
        System.out.println("Tedaede sotoon haye matrise 1 ra vared konid : ");
        int sotoon1 = id.nextInt() ;
        Scanner im1 = new Scanner(a) ; //scannere im1 etelaAt deraye ha ra az file a marboot b matrise 1 migirad
              
              
        double [][] m1 = new double [satr1][sotoon1] ; //arayeh motanazer ba file1(Matrix1.txt)
              
        while(im1.hasNext()) //ba in halqe meqdare araye ha ra az file Matrix.txt dar arayeh m1 mirizim
            {
                    
            for(int i = 0 ; i<satr1 ; i++)
            {
                for(int j=0 ; j<sotoon1 ;j++)
                    {
                        m1[i][j] = im1.nextDouble() ;
                          
                    }
                }
            }
        
                      double [][] m2 = new double [sotoon1][satr1] ; //areyeh motanazer ba maqadire taranhade matrise 1(Matrix2.txt)
                      for(int i=0 ; i<satr1 ; i++)
                      {
                          for(int j=0 ; j<sotoon1 ; j++)
                          {
                              m2[j][i]=m1[i][j] ; //algoritme ijad taranhade(avaz kardane jaye satr va sotoon)
                          }
                      }
                      
                      PrintWriter khodnevis = new PrintWriter("D:\\Javad\\cpProject\\MatrixKhorooji.txt") ; //tarif kardane yek shei barye neveshtan dar file
                      khodnevis.println("Taranhade matrise varede ");
              
                      for(int i=0 ; i<sotoon1 ; i++) //ba in loop khorooji dar file khoroojo b forme matris khahad bood
                      {
                          double counter = 0 ;
                          for(int j = 0 ; j<satr1 ; j++)
                          {
                              khodnevis.print(m2[i][j]);
                              khodnevis.print(" ");
                              counter++ ;
                          }
                          if(counter==satr1)
                          {
                          khodnevis.println();
                          }
                      }
              
                      khodnevis.close(); //bastane methode print dar file khorooji
                      System.out.println("Natije Taranhade Dar File MatrixKhorooji.txt Print Shod");

                      
              
              
        
        
        
        
    }
    
    public static double determinant(double A[][],int N) //methode determinan
    {
        double det=0;
        if(N == 1)
        {
            det = A[0][0];
        }
        else if (N == 2)
        {
            det = A[0][0]*A[1][1] - A[1][0]*A[0][1];
        }
        else
        {
            det=0;
            for(int j1=0;j1<N;j1++)
            {
                double[][] m = new double[N-1][];
                for(int k=0;k<(N-1);k++)
                {
                    m[k] = new double[N-1];
                }
                for(int i=1;i<N;i++)
                {
                    int j2=0;
                    for(int j=0;j<N;j++)
                    {
                        if(j == j1)
                            continue;
                        m[i-1][j2] = A[i][j];
                        j2++;
                    }
                }
                det += Math.pow(-1.0,1.0+j1+1.0)* A[0][j1] * determinant(m,N-1);
            }
        }
        return det;
    }
    
    
}
