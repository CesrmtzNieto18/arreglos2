import javax.swing.JOptionPane;
public class arreglos2 {
    public static void main (String[]args){
        String encabezado[]= {"   ","0 ", "1 ","2 ","\n"};
        String Columnas[]= { "0", "1","2"};
        byte Numeros[][] = new byte [3][3];
        int x,y=0;
                
                
        for( x = 0; x<3;x++){
            for( y = 0; y<3;y++){
                Numeros[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingrese un numero "  +(y+1)));
            }
        }
        
          //Impresion de encabezaado  
        for (String encabezadoTitulo: encabezado){
            System.out.print(encabezadoTitulo  );
        }
        //Impresion de columnas
         System.out.println();
         for (String columnas1:  Columnas){
            System.out.print(columnas1 + "\n");
    }
         for (x=0;x<=3;x++);{
         System.out.print(Numeros[x] + " ");
         for ( y = 0; y < 3; y++) {
                System.out.print(Numeros[y] + "\t");
                
    }
         System.out.println();
    }
    }
}
