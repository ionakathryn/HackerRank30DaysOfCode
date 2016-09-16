class Student extends Person{
  int [] testScores;
    
    Student(String firstName,String lastName,int identification, int[]testScores ){
        super(firstName,lastName,identification);
        this.testScores = testScores;
       
    
    }

    public char calculate(){
        int sum = 0;
        
    for (int x=0; x<testScores.length; x++){
        sum = testScores[x] + sum;
    }
        
        int avg = sum/testScores.length;
        
        if (avg >= 90 && avg <= 100){
            return 'O';
            }
        else if (avg >= 80 && avg <= 90){
      return 'E';
        }
        else if (avg >= 70 && avg <= 80){
     return 'A';
        }
        else if (avg >= 55 && avg <= 70){
     return 'P';
        }
            else if (avg >= 40 && avg <= 55){
            return 'D';
            }
        else{
           return 'T';
        }
    }
    } 
   