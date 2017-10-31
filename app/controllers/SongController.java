package controllers;

import org.omg.CosNaming.NamingContextPackage.NotFound;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;

import java.util.Set;

import com.google.inject.Inject;

import models.Song;

import play.mvc.Result;

import views.html.*;


public class SongController extends Controller{
	
	@Inject
	FormFactory formFactory;
	
	// Todas las canciones
	public Result index() {
		Set<Song> songs = Song.index();
		
		return ok(songIndex.render(songs));
	}
	
	// Crear cancion
	public Result create() {
		Form<Song> songForm = formFactory.form(Song.class);
		return ok(songCreate.render(songForm));
	}
		
	// Salvar cancion
	// Todas las canciones
	public Result save() {
		Form<Song> formSong = formFactory.form(Song.class).bindFromRequest();
		Song song = new Song(Integer.parseInt(formSong.field("id").value()), formSong.field("name").value(), Integer.parseInt(formSong.field("length").value()), formSong.field("author").value());
		Song.addSong(song);
		return redirect(routes.SongController.index());
	}
	
	public Result edit(Integer id) {
		Song song = Song.findById(id);
		System.out.print(song.toString());
		if(song == null) {
			return notFound("Song Not Found");
		}
		
		Form<Song> songForm = formFactory.form(Song.class).fill(song) ;
		
		return ok(songEdit.render(songForm));
	}
	
	public Result update() {
		
		Form<Song> formSong = formFactory.form(Song.class).bindFromRequest();
		Song song = new Song(Integer.parseInt(formSong.field("id").value()), formSong.field("name").value(), Integer.parseInt(formSong.field("length").value()), formSong.field("author").value());
		Song oldSong = Song.findById(song.id);

		if(oldSong == null) {
			return notFound("Song Not Found");
		}
		oldSong.author = song.author;
		oldSong.length = song.length;
		oldSong.name = song.name;
		
		return redirect(routes.SongController.index());
	}

	// detalles del libro
	public Result show(Integer id) {
		Song song = Song.findById(id);
		if(song == null) {
			return notFound("Song not found");
		}
		return ok(songShow.render(song));
	}
	
	public Result destroy(Integer id) {

		Song song = Song.findById(id);
		if(song == null){
			return notFound("Song Not Found");
		}
		Song.remove(song);

		return redirect(routes.SongController.index());
	}
	
	
	public Result prueba() {
		return ok(prueba.render());
	}
}
