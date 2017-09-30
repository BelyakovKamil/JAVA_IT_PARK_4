package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Vehicle Mazda = new Vehicle();
        Vehicle Mercedez = new Vehicle();
        Vehicle Toyota = new Vehicle();

        Mazda.setNumber("T284AC");
        Mazda.setColour("Red");
        Mazda.setPower(105);


        Mercedez.setNumber("М557КВ");
        Mercedez.setColour("White");
        Mercedez.setPower(525);


        Toyota.setNumber("B444BB");
        Toyota.setColour("Black");
        Toyota.setPower(286);

        Vehicle veicle[]={Mazda, Mercedez, Toyota};

        for (int i=1; i<veicle.length; i++){
            for(int j=i; j>0; j--) {
                if( veicle[j-1].getPower() > veicle[j].getPower()){
                    Vehicle temp = veicle[j];
                    veicle[j]= veicle[j-1];
                    veicle[j-1]=temp;
                }
            }
        }

        System.out.println("Мощность по возрастанию:");
        for (int i=0;i<veicle.length; i++){

            System.out.println("\n");
            System.out.print(veicle[i].getNumber() + " ");
            System.out.println();
            System.out.print(veicle[i].getPower() + " HP ");

        }

    }
}
