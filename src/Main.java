
public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("у " + mom + " есть сын, " + "\n" + son);

        try {
            Person dad = new PersonBuilder()
                    .setName("Пётр")
                    .setAge(38)
                    .build();
            // Не хватает обязательных полей
//            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            Person grandmother = new PersonBuilder()
                    .setName("Галина")
                    .setSurname("Иванова")
                    .setAge(-100)
                    .build();
            // Возраст недопустимый
//            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}