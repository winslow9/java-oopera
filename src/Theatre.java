public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actorOne = new Actor("Жмышенко","Валерий", Gender.MALE, 170);
        Actor actorTwo = new Actor("Иван","Усович", Gender.MALE, 210);
        Actor actorThree = new Actor("Джулия","Робертс", Gender.FEMALE, 134);
        Director directorOne = new Director("Люк", "Бессон", Gender.MALE, 14);
        Director directorTwo = new Director("Тайко", "Вайтити", Gender.MALE, 2);
        Show commonShow = new Show("Чаййка", 120, directorOne);
        Opera operaShow = new Opera("Щелкунчик",3000, directorOne, "Шопен", "Текст либреты", 15);
        Ballet balletShow = new Ballet("Лебединое озеро", 185, directorTwo, "Группа Звери", "Описание либреты", "Мигель");

        //Распределение актёров
        commonShow.listOfActors.add(actorOne);
        commonShow.listOfActors.add(actorTwo);
        operaShow.listOfActors.add(actorOne);
        operaShow.listOfActors.add(actorThree);
        balletShow.listOfActors.add(actorTwo);
        balletShow.listOfActors.add(actorThree);

        //Вывести актёров для каждого Show
        System.out.println("Актёры простого спектакля:");
        commonShow.printActors();
        System.out.println("-".repeat(10));
        System.out.println("Актёры оперы:");
        operaShow.printActors();
        System.out.println("-".repeat(10));
        System.out.println("Актёры балета:");
        balletShow.printActors();
        System.out.println("=".repeat(10));

        //Заменяем существующего актёра
        commonShow.replaceActor(actorThree, "Усович");
        System.out.println("Обновленный состав простого спектакля:");
        commonShow.printActors();
        System.out.println("=".repeat(10));

        //Заменяем несуществующего актёра
        balletShow.replaceActor(actorOne, "Эту фамилию меняем");
        System.out.println("=".repeat(10));

        //Выводим либретты
        System.out.println("Либертта Оперы:");
        operaShow.printLiberto();
        System.out.println("-".repeat(10));
        System.out.println("Либертта балета:");
        balletShow.printLiberto();

    }
}
