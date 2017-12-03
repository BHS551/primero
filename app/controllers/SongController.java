package controllers;


import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;

import java.util.List;


import com.google.inject.Inject;

import models.Song;

import play.mvc.Result;

import views.html.*;


public class SongController extends Controller{
	
	@Inject
	FormFactory formFactory;
	
	// Todas las canciones
	public Result index() {
		List<Song> songs = Song.find.all();

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

		Song song = formFactory.form(Song.class).bindFromRequest().get();
		song.save();
		return redirect(routes.SongController.index());
	}

	public Result edit(Integer id) {
		Song song = Song.find.byId(id);
		System.out.print(song.toString());
		if(song == null) {
			return notFound("Song Not Found");
		}

		Form<Song> songForm = formFactory.form(Song.class).fill(song) ;

		return ok(songEdit.render(songForm));
	}

	public Result update() {
		Song song = formFactory.form(Song.class).bindFromRequest().get();
		Song oldSong = Song.find.byId(song.id);

		if(oldSong == null) {
			return notFound("Song Not Found");
		}
		oldSong.author = song.author;
		oldSong.length = song.length;
		oldSong.name = song.name;
		oldSong.update();

		return redirect(routes.SongController.index());
	}

	// detalles del libro
	public Result show(Integer id) {
		Song song = Song.find.byId(id);
		if(song == null) {
			return notFound("Song not found");
		}
		return ok(songShow.render(song));
	}

	public Result destroy(Integer id) {

		Song song = Song.find.byId(id);
		if(song == null){
			return notFound("Song Not Found");
		}
		song.delete();
		return redirect(routes.SongController.index());
	}
	
	
	public Result prueba() {
		return ok(prueba.render());
	}
}
