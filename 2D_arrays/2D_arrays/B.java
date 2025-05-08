import java.io.Console;
class B{
    public static void main(String[] args) {
        Console con=System.console();

        String[][] x=new String[2][];
        x[0]=new String[3];
        x[1]=new String[2];

        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                System.out.print("Enter : ");
                x[i][j]=con.readLine();
            }
            System.out.println();
        }

        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                System.out.println(x[i][j]);
            }
        }
    }
}


// PS E:\Java\array.java\2D_arrays> java B      
// Enter : ragu
// Enter : vikramaditya
// Enter : prithvi

// Enter : ran
// Enter : pankaj

// ragu
// vikramaditya
// prithvi
// ran
// pankaj