package org.example;

public class Main {
    public static void main(String[] args) {
        int i;
        double drob;
        int shagB=0;
        int maxdep=843;
        int zam=0;
        int nachst=10;
        int sum=0;
        int shag=4;
        for (i=0;sum<=maxdep;i++)
        {
            sum=sum+nachst+shagB;
            System.out.print("Шаг № ");
            System.out.print(i+1);
            System.out.print(" ");
            System.out.print(nachst+shagB);
            System.out.print(" Суммарые траты на ставки: ");
            System.out.print(sum);
            System.out.print(" Выйгрыш "+(nachst+shagB)*5);
            System.out.println(" Выйгрыш чистыми"+(((nachst+shagB)*5)-sum));

            drob=0.25*(nachst+(shag*i));
            //System.out.println(" Дроп до"+drob);
            shag=(int)Math.ceil(drob);
                //System.out.println(" Дроп"+shag);
            shagB=shagB+shag;
        }
        System.out.println(i-1);

    }
}