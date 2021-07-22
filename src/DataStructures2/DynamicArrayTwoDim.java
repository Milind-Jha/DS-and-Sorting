package DataStructures2;

public class DynamicArrayTwoDim {
    private int deletion=0;
    private int[][] x ;
    private int rows=0;
    private int column=0;
    public int maxcolumn;
    public DynamicArrayTwoDim(int maximumcolumn){
        x = new int [5][maximumcolumn];
        this.maxcolumn=maximumcolumn;
    }
    public int size(){
        if(rows==0){
            return column-deletion;
        }
        else{
            System.out.print("Size: ");
            return rows*maxcolumn+column-deletion;
        }
    }
    public void addNextelement(int a){
        if(column<x[rows].length){
            x[rows][column]=a;
            column++;
        }
        else if(column==x[rows].length&&rows< x.length-1){
            rows++;
            column = 0;
            x[rows][column]=a;
            column++;
        }
        else if(rows== x.length-1&&column == x[rows].length){
            Expand();
            rows++;
            column = 0;
            x[rows][column]=a;
            column++;
        }
    }

    private void Expand() {
        int [][] temp = this.x;
        this.x = new int[2*rows+2][column];
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                x[i][j]=temp[i][j];
            }
        }
    }

    public void get(int rowindex, int columnindex){
        if(rowindex<x.length&&columnindex<x[rowindex].length){
            System.out.println(x[rowindex][columnindex]);
        }
        else if(rowindex<x.length&&columnindex>=x[rowindex].length){
            System.out.println("Maximum column index exceeded.");
        }
        else{
            System.out.println("Array not large enough yet.");
        }
  }

  public void delete(int rowindex, int columnindex){
      if(rowindex<x.length&&columnindex<x[rowindex].length){
          try{
              x[rowindex][columnindex]=x[rowindex][columnindex+1];
          }
          catch (Exception e){
              x[rowindex][columnindex]=x[rowindex+1][0];
          }

          int check = rowindex*maxcolumn+columnindex;
          for(int i=0;i<x.length;i++){
              for(int j=0;j<x[i].length;j++){
                  if(maxcolumn*i+j<=check){
                      continue;
                  }
                  else {
                        if(j==maxcolumn-1){
                            try {
                                x[i][j]=x[i+1][0];
                            }
                            catch (Exception e){
                                x[i][j]=0;
                            }
                        }
                        else {
                            x[i][j]=x[i][j+1];
                        }
                  }
              }
          }
         deletion++;
      }
      else if(rowindex<x.length&&columnindex>=x[rowindex].length){
          System.out.println("Maximum column index exceeded.");
      }
      else{
          System.out.println("Array not large enough yet.");
      }
  }

  public void change(int rowindex, int columnindex, int number){
      if(rowindex<x.length&&columnindex<x[rowindex].length){
          x[rowindex][columnindex]=number;
      }
      else if(rowindex<x.length&&columnindex>=x[rowindex].length){
          System.out.println("Maximum column index exceeded.");
      }
      else{
          System.out.println("Array not large enough yet.");
      }
  }
  public boolean isEmpty(){
        if(column==0&&rows==0){
            return true;
        }
        else
            return false;
  }
  public void printEntireArray(){
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }
  }
}
