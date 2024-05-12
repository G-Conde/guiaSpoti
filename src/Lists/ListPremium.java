package Lists;

import Interface.Playing;
import Models.Song;

import java.util.LinkedList;
import java.util.Stack;

public class ListPremium implements Playing {
    private String name;
    private LinkedList<Song> myList;

    public ListPremium(String name, LinkedList<Song> myList) {
        this.name = name;
        this.myList = myList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Song> getMyList() {
        return myList;
    }

    public void setMyList(LinkedList<Song> myList) {
        this.myList = myList;
    }


    @Override
    public void playSong(Song song) {
        System.out.println(song.toString());

    }

    @Override
    public void addSongPremium(LinkedList<Song> myList, Song song) {
        this.myList.add(song);
    }

    @Override
    public LinkedList<Song> eraseSongPremium(LinkedList<Song> myList, Song song) {
        this.myList.remove(song);
        return this.myList;
    }


    @Override
    public void seeListPremium(LinkedList<Song> myList) {
        System.out.println("Lista de reproducción premium:");
        for (Song song : myList) {
            System.out.println(song.toString());
        }
    }

    @Override
    public void addSong(Stack<Song> myList, Song song) {

    }

    @Override
    public Stack<Song> eraseSong(Stack<Song> myList, Song song) {
        return null;
    }

    @Override
    public void seeList(Stack<Song> myList) {

    }

}
