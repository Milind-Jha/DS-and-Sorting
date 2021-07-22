package DataStructures2;

public class PolynomialDynamicArray {
    private int [] coefficients;
    private int index;

    public PolynomialDynamicArray(){
        this.coefficients = new int[5];
        this.index= 0;
    }
    public void setCoefficient(int degree,int coeff){
        while (degree>=coefficients.length){
            coefficients= expand(coefficients);
        }
        coefficients[degree]=coeff;
    }

    private int[] expand(int[] coefficients) {
        int [] temp = coefficients;
        coefficients = new int[2 * (temp.length)]; // coefficients size is twice and then ...
        for(int i=0;i< temp.length;i++){
            coefficients[i]=temp[i];               // copy all the previous elements from temp
        }
        return coefficients;
    }
    public void print()
    {  if(coefficients[0]!=0)
        System.out.print(coefficients[0]+"+");
        for(int i=1;i<coefficients.length;i++)

        {	if (coefficients[i]!=0)
            System.out.print(coefficients[i]+"x"+i+" ");
        }
        System.out.println();
    }

    public PolynomialDynamicArray add(PolynomialDynamicArray p2){
        if (coefficients.length > p2.coefficients.length)
        {
            for(int i=0; i< p2.coefficients.length; i++ )
            {
                coefficients[i] = coefficients[i] + p2.coefficients[i];
            }
            p2.coefficients = coefficients;
        }else{
            for(int i=0; i< coefficients.length; i++ )
            {
                p2.coefficients[i] = coefficients[i] + p2.coefficients[i];
            }
        }
        return p2;
    }
    public PolynomialDynamicArray subtract(PolynomialDynamicArray p){
        if (coefficients.length > p.coefficients.length)
        {
            for(int i=0; i< p.coefficients.length; i++ )
            {
                coefficients[i] = coefficients[i] - p.coefficients[i];
            }
            p.coefficients = coefficients;
        }else{
            for(int i=0; i< coefficients.length; i++ )
            {
                p.coefficients[i] = coefficients[i] - p.coefficients[i];
            }
        }
        return p;
    }
    // Multiply two polynomials and returns a new polynomial which has result
    public PolynomialDynamicArray multiply(PolynomialDynamicArray p){
        int[] multipy_arr = new int[5];

        for(int i=0; i<coefficients.length; i++) {

            for(int j=0; j<p.coefficients.length; j++) {
                int product =1;
                product = coefficients[i] * p.coefficients[j];
                while((i+j)>=multipy_arr.length)
                {
                    multipy_arr = expand(multipy_arr);
                }

                multipy_arr[i+j] = product+multipy_arr[i+j];

            }
        }
        p.coefficients = multipy_arr;
        return p;

    }

}
