package ForProject;

public class Track {

String nameTrack;
String nameGenre;
int numberTrack;
Recordlen recordLength;
String titleAlbum;
String performerName;



public  Track(String nameTrack, String nameGenre, int numberTrack, Recordlen recordLength, String titleAlbum, String performerName){
    this.nameTrack = nameTrack;
    this.nameGenre = nameGenre;
    this.recordLength = recordLength;
    this.titleAlbum = titleAlbum;
    this.performerName = performerName;
}

public String getNameTrack(){return nameTrack;}
public  void setNameTrack(String Track_name){this.nameTrack =Track_name;}
public String getNameGenre(){return nameGenre;}
public  void setNameGenre(String Genre_Name){this.nameGenre =Genre_Name;}
public Recordlen getRecordLength(){return recordLength;}
public  void setRecordLength(Recordlen Record_length){this.recordLength =Record_length;}
public String getTitleAlbum(){return titleAlbum;}
public void setAlbum_title(){this.titleAlbum = titleAlbum;}
public String getPerformerName(){return performerName;}
public void setPerformerName(String Performer_Name){this.performerName =Performer_Name;}

    public String toString(){
        StringBuffer str=new StringBuffer();
        str.append("Номер трека:\t")
                .append(numberTrack +"\n")
                .append("Имя трека:\t")
                .append(nameTrack +"\n")
                .append("Жанр:\t")
                .append(nameGenre +"\n")
                .append("Имя исполнителя:\t")
                .append(performerName +"\n")
                .append("Название альбома:\t")
                .append(titleAlbum +"\n")
                .append("Длина записи:\t")
                .append( recordLength.minute+"минут   "+ recordLength.second+"    секунд"+"\n");

        return str.toString();
    }


}
