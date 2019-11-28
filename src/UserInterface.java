import ForProject.Track;
import ForProject.TracksLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class UserInterface {
    public  void mainMenu() {
        LinkedList<Track> TrackLib =new LinkedList<Track>();
        TrackLib = downloadTrackLib(TrackLib);
        TracksLib library = new TracksLib("Музыкальня библиотека", TrackLib);//
        Scanner in = new Scanner(System.in);
        boolean exit=false;
        while (!exit) {
            System.out.println("\t\tГлавное меню:\n" +
                    "-------------------------------------------------\n" +
                    "1.Добавить трек;\n" +
                    "2.Удалить трек;\n" +
                    "3.Изменить трек;\n" +
                    "4.Просмотр треков;\n" +
                    "5.Выход.\n");

            switch (in.nextLine()) {
                case "1":cls();
                    createMenu(library);
                    break;
                case "2":cls();
                    deleteMenu(library);
                    break;
                case "3":cls();
                    setMenu(library);
                    exitMainMenu(in);
                    break;
                case "4":cls();
                    System.out.println(library);
                    exitMainMenu(in);
                    break;
                case "5":
                    try(FileOutputStream fileOutputStream=new FileOutputStream("serialisation1")) {
                        Controller.serialisationTrackLib(fileOutputStream, library.getTracksList());
                    }catch (IOException e){}
                    exit = true;
                    break;
                default:cls();
                    System.out.println("Неверно введенный символ\n" +
                            "-----------------------------------------");
                    break;
            }
        }
    }



    private void createMenu(TracksLib library){
        Scanner in = new Scanner(System.in);
        boolean exitCreateMenu=false;
        System.out.println(
                "1.Начать добавление трека;\n" +
                        "2.Назад;\n");
        String str=in.nextLine();
        switch (str){
            case "1":
                cls();
                while(!exitCreateMenu) {
                    try {
                        library.createTrack(Controller.inputTrack(in));
                        exitCreateMenu=true;
                    }catch (Exception e)
                    {
                        cls();
                        System.err.println("Невверно введенный символ "+e.getMessage());
                    }
                }
                cls();
                System.out.println("Элемент успешно добавлен\n " +
                        "------------------------------------------");
                break;
            case "2":cls();
                break;
            default:cls();
                System.out.println("Неверно введенный символ\n" +
                        "----------------------------------------");
                break;
        }
    }
    private void deleteMenu(TracksLib manager) {
        Scanner in = new Scanner(System.in);
        boolean exitCreateMenu=false;
        System.out.println(
                "1.Удалить трек;\n" +
                        "2.Назад;\n");
        String str=in.nextLine();
        switch (str) {
            case "1":cls();
                while(!exitCreateMenu) {
                    try {
                        System.out.println(manager);
                        System.out.println("Введите индекс трека который нужно удалить ");
                        int num=in.nextInt();
                        manager.deleteTrack(num);
                        cls();
                        System.out.println("Элемент успешно удален\n " +
                                "------------------------------------------");
                        exitCreateMenu=true;
                    }catch (Exception e)
                    {
                        cls();
                        System.err.println("Невверно введенный символ "+e.getMessage());
                        in.nextLine();
                    }
                }
                break;
            case "2":
                break;
            default:cls();
                System.out.println("Неверно введенный символ\n" +
                        "--------------------------------------------");
                break;
        }
    }
    private void setMenu(TracksLib manager){
        Scanner in = new Scanner(System.in);
        boolean exitCreateMenu=false;
        System.out.println(
                "1.Изменить трек;\n" +
                        "2.Назад;\n");
        String str=in.nextLine();
        switch (str) {
            case "1":
                cls();
                while(!exitCreateMenu) {
                    try {
                        System.out.println(manager);
                        System.out.println("Введите индекс трека, который хотите изменить:");
                        int num = in.nextInt();

                        System.out.println("\n 1.Изменить имя исполнителя\n " +
                                           "\n 2.Изменить название трека\n " +
                                           "\n 3.Изменить название жанра\n" );
                        Scanner inn = new Scanner(System.in);
                        String str2 = inn.nextLine();
                        switch (str2){
                            case "1":
                                Scanner in1  = new Scanner(System.in);

                                Track track1 = manager.getTrack(num);
                                track1.setPerformer_Name(Controller.inputPerformer_Name(in1));
                                break;
                            case "2":
                                Scanner in2  = new Scanner(System.in);
                                Track track2 = manager.getTrack(num);
                                track2.setTrack_name(Controller.inputTrack_Name(in2));
                                break;
                            case "3":
                                Scanner in3  = new Scanner(System.in);
                                Track track3 = manager.getTrack(num);
                                track3.setTrack_name(Controller.inputGenre_Name(in3));
                                break;
                        }

                        cls();
                        System.out.println("Элемент успешно изменен \n" +
                                "------------------------------------------");
                        exitCreateMenu=true;
                    } catch (Exception e) {
                        cls();
                        System.err.println("Невверно введенный символ " + e.getMessage());
                        in.nextLine();
                    }
                }
                break;
            case "2":
                break;
            default:cls();
                System.out.println("Неверно введенный символ\n" +
                        "--------------------------------------------");
                break;
        }
    }
    private void exitMainMenu(Scanner in){
        System.out.println("\n" +
                "Чтобы выйти в главное меню нажмите 1");
        String q=in.nextLine();
        switch (q) {
            case "1":cls();
                break;
            default:cls();
                System.out.println("Неверно введенный символ");
                break;
        }
    }

    private LinkedList<Track> downloadTrackLib(LinkedList<Track> TrackLib) {
        try(FileInputStream fileInputStream=new FileInputStream("serialisation1")) {
            TrackLib =Controller.deserialisationTrackLib(fileInputStream);
        }
        catch (ClassNotFoundException e){}
        catch (IOException e){}
        return TrackLib;
    }

    private  void cls(){
        int ln=0;
        while (ln<50) {
            System.out.println();
            ln++;
        }
    }


    private void RedactionMenu(){

    }
}






























































