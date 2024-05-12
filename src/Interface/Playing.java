package Interface;

import Models.Song;

import java.util.LinkedList;
import java.util.Stack;

public interface Playing {
    public void playSong(Song song);

    public void addSong(Stack<Song> myList, Song song);

    public Stack<Song> eraseSong(Stack<Song> myList, Song song);

    public void seeList(Stack<Song> myList);

    public void addSongPremium(LinkedList<Song> myList, Song song);
    public LinkedList<Song> eraseSongPremium(LinkedList<Song> myList, Song song);
    public void seeListPremium(LinkedList<Song> myList);
}
