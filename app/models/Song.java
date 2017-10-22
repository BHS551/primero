package models;

import java.util.HashSet;
import java.util.Set;

public class Song {

	public Integer id;
	public String name;
	public Integer length;
	public String author;

	public Song() {
		super();
	}
	
	public Song(Integer id, String name, Integer length, String author) {

		super();
		this.id = id;
		this.name = name;
		this.length = length;
		this.author = author;

	}

	private static Set <Song> songs;
	
	static {
		songs = new HashSet<>();
		songs.add(new Song(1, "The Last man standing", 270, "Hammerfall"));
		songs.add(new Song(2, "Dumb Reminders", 169, "No Use For A Name"));
	}
	
	public static Song findById(Integer id) {
		for(Song song: songs) {
			if(id.equals(song.id)) {
				return song;
			}
		}
		return null;
	}
	
	public static Set index() {
		return songs;
	}
	
	public static void addSong(Song song) {
		songs.add(song);
	}
	
	public static void remove(Song song) {
		songs.remove(song);
	}
	
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", length=" + length + ", author=" + author + "]";
	}
}
