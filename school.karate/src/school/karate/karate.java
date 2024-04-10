package school.karate;

import school.karate.exceptions.knowkDownException;
import school.karate.exceptions.FallenException;;


public class karate{

    public static void main(String[] args) throws knowkDownException {
        karateMaster karateMaster=new karateMaster();
        karateMaster.knowkDown();
        try{
            karateMaster.knowkDown();
        }
        catch(knowkDownException e){
                  System.out.println(e);
        }

    }
}

