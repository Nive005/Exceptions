package school.karate;


import school.karate.exceptions.FallenException;
import school.karate.exceptions.knowkDownException;

class karateMaster {
    
        public void knowkDown() throws knowkDownException{
    
            for(int i=0;i<=20;i++){
                double val=Math.random()%10;
                if(val>0.90){
                    throw new knowkDownException("knowkdown exception");
                }
                else if(val<0.30){
                    throw new FallenException("Fallen Exception");
                }
            
          else{
                System.out.println("player won");
            }
     }
            
     }
    
    }

    
    
    

