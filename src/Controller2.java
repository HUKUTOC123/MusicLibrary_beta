import ForProject.Track;
import ForProject.TracksLib;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller2 {

    public static void Process() throws IOException {
        Model obj = new Model();
        boolean cercle  = true;
        boolean cercle1 = true;
        boolean cercle2 = true;
        boolean cercle3 = true;
        boolean cercle4 = true;
        boolean cercle5 = true;
        while(cercle){
            while (cercle1){
                View.printMenu1();
                int key = System.in.read();
                switch (key)
                {
                    case 49://Просмотр

                        cercle1 = false;
                        cercle2 = true;

                        break;
                    case 50: //Открытие на чтение и запись
                        cercle1 = false;
                        cercle3 = true;
                    case 51: //Cохранение файла

                        break;
                    case 52:// Удаление файла

                        break;
                    case 27 ://ESC

                        cercle = false;
                        cercle1 = false;
                        cercle2 = false;
                        cercle3 = false;
                        cercle4 = false;
                        break;
                }
            }
            while (cercle2){
                View.printMenu21();
                int key = System.in.read();
                switch (key) {
                    case 49://Поиск трека
                        break;
                    case 50: //сортировка треков
                        cercle1 = false;
                        cercle2 = false;
                        cercle5 = true;
                        break;
                    case 27://ESC
                        cercle2 = false;
                        cercle1 = true;
                        break;
                }

            }
            while(cercle3){
                View.printMenu22();
                int key = System.in.read();

                switch (key)
                {
                    case 49://Добавление
                        obj.addNewTrack();
                        cercle1 = false;
                        cercle3 = false;

                        break;
                    case 50: //Удаление
                        obj.deleteTrack();
                        cercle1 = false;
                        cercle3 = false;

                        break;
                    case 51: //Редактирование
                        cercle1 = false;
                        cercle3 = false;
                        cercle4 = true;

                        break;

                    case 27://ESC

                        cercle = true;
                        cercle1 = true;
                        cercle3 = false;
                        break;
                }

            }
            while(cercle4) {
                Scanner in = new Scanner(System.in);
                View.printNumberTrackEditing();
                int num = in.nextInt();

                View.printMenuEditing();
                int key = System.in.read();

                switch (key) {
                    case 49://Редактирование имени
                        obj.changePerformerName(num);
                        cercle1 = false;
                        cercle3 = false;

                        break;
                    case 50: //Редактирование названия трека
                        obj.changeTrackName(num);
                        cercle1 = false;
                        cercle2 = false;
                        cercle3 = false;
                        cercle4 = false;

                        break;
                    case 51: //Редактирование названия жанра
                        obj.changeGenreName(num);
                        cercle1 = false;
                        cercle2 = false;
                        cercle3 = false;
                        cercle4 = false;

                        break;
                    case 52: //Редактирование названия альбома
                        obj.changeAulbomName(num);
                        cercle  = true;
                        cercle1 = false;
                        cercle2 = false;
                        cercle3 = false;
                        cercle4 = false;

                        break;
                    case 53: //Редактирование длительности

                        cercle  = true;
                        cercle1 = false;
                        cercle2 = false;
                        cercle3 = false;
                        cercle4 = false;

                        break;


                    case 27://ESC

                        cercle  = true;
                        cercle1 = true;
                        cercle2 = false;
                        cercle3 = false;
                        cercle4 = false;
                        break;
                }
            }
            while (cercle5){
                View.printMenuSort();
                int key = System.in.read();
                switch (key) {
                    case 49://Сортировка по имени исполнителя
                        break;
                    case 50: //сортировка треков по названию
                        cercle1 = false;
                        cercle2 = false;
                        cercle5 = false;
                        break;
                    case 51: //сортировка треков по длительности
                        cercle1 = false;
                        cercle2 = false;
                        cercle5 = false;
                        break;
                    case 27://ESC
                        cercle5 = false;
                        cercle2 = true;
                        cercle1 = true;
                        break;
                }

            }
        }
    }

}
