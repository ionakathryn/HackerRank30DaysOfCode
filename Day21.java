    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    public static <A> void printArray(A[] array){
        for (A element:array){
            System.out.println(element);
        }
    }
