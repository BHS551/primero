package models;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;

import io.ebean.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song extends Model{
	@Id
	public Integer id;
	public String name;
	public Integer length;
	public String author;

	public static Finder<Integer, Song> find = new Finder<>(Song.class);
}
