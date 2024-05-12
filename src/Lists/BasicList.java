package Lists;

import Interface.Playing;
import Models.Song;

import java.util.Stack;
import java.util.LinkedList;

public class BasicList implements Playing {
    private String name;
    private Stack<Song> myList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack<Song> getMyList() {
        return myList;
    }

    public void setMyList(Stack<Song> myList) {
        this.myList = myList;
    }

    public BasicList(String name) {
        this.name = name;
    }

    @Override
    public void playSong(Song song) {
        System.out.println(song.toString());

    }

    @Override
    public void addSong(Stack<Song> myList, Song song) {
        myList.push(song);//La lista usa el metodo push para agregar
    }

    @Override
    public Stack<Song> eraseSong(Stack<Song> myList, Song song) {
        myList.remove(song);
        return myList;
    }

    @Override
    public void seeList(Stack<Song> myList) {
        for (Song song : myList) {
            System.out.println(song.toString());
        }

    }

    @Override
    public void addSongPremium(LinkedList<Song> myList, Song song) {

    }

    @Override
    public LinkedList<Song> eraseSongPremium(LinkedList<Song> myList, Song song) {
        return null;
    }

    @Override
    public void seeListPremium(LinkedList<Song> myList) {

    }


}
