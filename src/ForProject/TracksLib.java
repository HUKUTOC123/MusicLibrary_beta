package ForProject;

import java.io.Serializable;
import java.util.LinkedList;

public class TracksLib implements Serializable {
    private String name;
    private LinkedList<Track> TracksList=new LinkedList<Track>();
    public  TracksLib(String name){ this.name=name; }

    public TracksLib(String name, LinkedList<Track> TracksList) {
        this.name=name;
        this.TracksList = TracksList;
    }
    public  TracksLib(){}
    public String getName(){return name;}
    public void setName(){this.name=name;}
    public Track[] getTracks(){
        Track[] array=new Track[TracksList.size()];
        for(int i=0;i<array.length; i++){
            array[i]=TracksList.get(i);
        }
        return array;
    }

    public LinkedList<Track> getTracksList() {
        return TracksList;
    }
    //создание
    public void createTrack(Track track) {
        TracksList.add(track);
    }
    //удаление
    public void deleteTrack(int num) {
        TracksList.remove(num);
    }
    //изменение
    public void setTrack(int index, Track tracks_list) {
        TracksList.set(index, tracks_list);
    }
    public Track getTrack(int index){ return TracksList.get(index);}
    //представление чеез массив
    public Track[] getTrackLib() {
        Track[] array=new Track[TracksList.size()];
        for(int i=0;i<array.length; i++){
            array[i]=TracksList.get(i);
        }
        return array;
    }
    //просмотр
    public String toString() {
        StringBuffer str = new StringBuffer();
        int i = 0;
        if (TracksList != null) {
            for (Track element : TracksList) {
                str.append(i + ".\t")
                        .append(element.toString() + "\n");
                i++;
            }
        }
        return str.toString();
    }



}
