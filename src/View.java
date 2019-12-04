public class View {

    public static void printMenu1 (){
        System.out.println(" [1] Просмотр файла \n " +
                           " [2] Открытие файла на чтение и запись \n " +
                           " [3] Сохранение файла \n " +
                           " [4] Удаление файла \n " +
                           " ESC Выход \n ");

    }

    public static void printMenu21 (){
        System.out.println(" [1] Поиск трека \n " +
                " [2] Сортировка треков \n " +
                " [3] Редактирование трека \n" +
                " [<--] [-->] \n " +
                " ESC Выход в Меню \n ");

    }

    public static void printMenu22 (){
        System.out.println(" [1] Добавление трека \n " +
                " [2] Удаление трека \n " +
                " [3] Редактирование трека \n" +
                " [<--] [-->] \n " +
                " ESC Выход в Меню \n ");

    }

    public static void printMenuSort (){
        System.out.println(" [1] Сортировка по имени исполнителя \n " +
                " [2] Сортировка по названию трека \n " +
                " [3] Сортировка по длительности \n " +
                " ESC \n ");

    }

    public static void printNumberTrackEditing (){
        System.out.println(" Введите номер трека:  ");
    }

    public static void printMenuEditing (){
        System.out.println(" [1] Имя исполнителя \n " +
                " [2] Название трека \n " +
                " [3] Название жанра \n " +
                " [4] Название альбома \n "+
                " [5] Длительность \n "+
                " ESC \n ");

    }

}
