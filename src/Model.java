import ForProject.Recordlen;
import ForProject.Track;
import ForProject.TracksLib;

import java.util.ArrayList;
import java.util.Scanner;

public class Model {
    ArrayList<Track> TrackLib =new ArrayList<Track>();
    TracksLib library = new TracksLib("Музыкальная библиотека", TrackLib);

    public static Track inputTrack(Scanner in) {

        System.out.println("Введите название трека");
        String Track_Name = in.nextLine();
        System.out.println("Введите название жанра:");
        String Genre_Name = in.nextLine();
        System.out.println("Введите имя исполнителя:");
        String Performer_Name = in.nextLine();
        System.out.println("Введите название альбома:");
        String Album_title = in.nextLine();
        System.out.print("Введите номер трека");
        int Track_number = in.nextInt();
        System.out.println("Введите длительность трека");
        System.out.print("Минут: ");
        int minute = in.nextInt();
        System.out.print("Секунд: ");
        int second = in.nextInt();
        Recordlen Record_length = new Recordlen(minute, second);
        Track track = new Track(Track_Name, Genre_Name, Track_number, Record_length, Album_title, Performer_Name);
        return track;
    }

    public static String inputPerformerName(Scanner in ) {

        System.out.println( "Введите  новое имя исполнителя:");
        String PerformerName = in.nextLine();
        return PerformerName;
    }

    public static String inputTrackName(Scanner in ) {

        System.out.println("Введите  новое имя исполнителя:");
        String TrackName = in.nextLine();
        return TrackName;
    }

    public static String inputGenreName(Scanner in ) {

        System.out.println("Введите  новое имя исполнителя:");
        String GenreName = in.nextLine();
        return GenreName;
    }

    public static String inputAulbomTitle(Scanner in ) {

        System.out.println("Введите  новое название альбома:");
        String AulbomName = in.nextLine();
        return AulbomName;
    }

    public void addNewTrack (){
        Scanner in = new Scanner(System.in);
        library.createTrack(inputTrack(in));
        System.out.println("-----Трек успешно добавлен-----");
    }

    public void changePerformerName( int numTrack ){
        Scanner in1  = new Scanner(System.in);
        Track track1 = library.getTrack(numTrack);
        track1.setPerformerName(inputPerformerName(in1));
    }

    public void changeTrackName( int numTrack ){
        Scanner in1  = new Scanner(System.in);
        Track track1 = library.getTrack(numTrack);
        track1.setNameTrack(inputTrackName(in1));
    }

    public void changeGenreName( int numTrack ){
        Scanner in1  = new Scanner(System.in);
        Track track1 = library.getTrack(numTrack);
        track1.setNameGenre(inputGenreName(in1));
    }

    public void changeAulbomName( int numTrack ){
        Scanner in1  = new Scanner(System.in);
        Track track1 = library.getTrack(numTrack);
        track1.setAlbumTitle(inputAulbomTitle(in1));
    }

    public static int numberDeleteTrack(Scanner in){
        System.out.println("Введите  новое название альбома:");
        int number = in.nextInt();
        return number;
    }

    public void deleteTrack (){
        Scanner in  = new Scanner(System.in);
        int number = numberDeleteTrack(in);
        library.deleteTrack(number);
        System.out.println("-----Трек был удален-----");
    }

}
