public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println("Значение переменной dog = " +dog);
        var cat = 3.6;
        System.out.println("Значение переменной cat = " +cat);
        var paper = 763789;
        System.out.println("Значение переменной paper = " +paper);

        dog = dog + 4.0;
        System.out.println("Новое значение переменной dog = " +dog);
        cat = cat + 4.0;
        System.out.println("Новое значение переменной cat = " +cat);
        paper = paper + 4;
        System.out.println("Новое значение переменной paper = " +paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Финальные(надеюсь) значения переменных:");
        System.out.println("dog = "+dog);
        System.out.println("cat = "+cat);
        System.out.println("paper = "+paper);


        var friend = 19;
     System.out.println("Начальное значение переменной friend = " +friend);
     friend = friend + 2;
     System.out.println("Второе значение переменной friend = " +friend);
     friend = friend / 7;
     System.out.println("Третье значение переменной friend = " +friend);


     var frog = 3.5;
     System.out.println("Первое значение переменной frog = "+frog);
     frog = frog * 10;
     System.out.println("Второе значение переменной frog = "+frog);
     frog = frog / 3.5;
     System.out.println("Третье значение переменной frog = "+frog);
     frog = frog + 4;
     System.out.println("Четвертое значение переменной frog = "+frog);


     var boxer1 = 78.2;
     var boxer2 = 82.7;
     var totalWeight = boxer1+boxer2;
     System.out.println("Общая масса обоих боксеров = "+totalWeight);


     var weightDiff = boxer2%boxer1;
     System.out.println("Разница в массе боксеров = "+weightDiff);


     var workHoursTotal = 640; //Общее кол-во рабочих часов//
     var workHoursStandard = 8; // Стандартное время работы//
        var emplTotal = workHoursTotal / workHoursStandard;
        System.out.println("Всего работников в компании — "+emplTotal +" человек");

        emplTotal = emplTotal+94;
        workHoursTotal = emplTotal * workHoursStandard;
        System.out.println("Если в компании работает "+emplTotal+" человек, то всего "+workHoursTotal+" часов работы может быть поделено между сотрудниками");

        System.out.println("Job is done! :)");







    }
    }