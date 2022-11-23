import java.util.Random;


public class Qbit {
    private double alpha;
    private double beta;

    /* initialiesiert das Qbit im zustand cet(0)*/
    public Qbit(){
        alpha=1;
        beta=0;
    }

    public int measure(){

        double alphatest= Math.pow(alpha,2);
        Random random = new Random();
        double test= random.nextDouble();


        if(test<alphatest){
            alpha=1;
            beta=0;
            return 0;
        }else{
            alpha=0;
            beta=1;
            return 1;
        }




    }

    public void hadamardGate(){
        //coeffizient der Hadamard Matrix
        double coeff=1/Math.sqrt(2);
        double oldAlpha= alpha;
        double oldBeta= beta;

        //variable oldAlpha zum speichern der Alphavariable

        //Multiplikation mit Hadamard Matrix
        //1.Zeile
        alpha=(oldAlpha+oldBeta)*coeff;
        //2. Zeile
        beta=(oldAlpha-oldBeta)*coeff;
    }

    public void thirdGate(){
        double coeff1= Math.sqrt((double) 1/3);
        double coeff2=Math.sqrt((double) 2/3);
        double oldAlpha=alpha;
        double oldbeta=beta;

        /* Die Koeffizienten sind so gewählt das Qbit im  Zustand cet(0) in den Zustand
        sqrt(1/3)*cet(0)+sqrt(2/3)*cet(1)zu überführen , beweis dafür ist im Text der Arbeit */

        alpha=(coeff1*oldAlpha-coeff2*oldbeta);
        beta=(-coeff2*oldAlpha-coeff1*oldbeta);
        /*
        entspricht einer Matrixmultiplikation
         */

    }
    public void flip(){
        double oldAlpha=alpha;
        double oldBeta=beta;
        //sicherung der Alten Variablen

        alpha=oldAlpha*0+oldBeta*1;
        beta=oldAlpha*1+oldBeta*0;


    }





    @Override
    public String toString() {
        return "Qbit{" +
                "alpha=" + alpha +
                ", beta=" + beta +
                '}';
    }
}
