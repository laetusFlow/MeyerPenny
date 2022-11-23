public class Aufgaben {


    /*Aufgabe 1 die messungsFunktion ist in der Qbitklasse integriert  hier ist das tausenmalige ausführen gemeint*/

    public void aufgabe1(int messungen){
        int count0=0;
        int count1=0;

        for(int i=0; i<messungen;i++){
            Qbit q= new Qbit();
            q.thirdGate();
            if (q.measure()==0){
                count0+=1;
            }
            else{
                count1+=1;
            }
        }
        double anteil0= (double)count0/messungen;
        double anteil1= (double)count1/messungen;

        System.out.println("Anzahl der Messungen: "+messungen+" /Anzahl 0 = "+ count0 +" /Anzahl 1 =" + count1);




    }

    public void meyerPennySpiel(){
        Qbit picard= new Qbit();
        Qbit penny= new Qbit();

        picard.hadamardGate();
        penny.flip();
        penny.hadamardGate();
        penny.hadamardGate();

        System.out.println("Penny");


    }


}
