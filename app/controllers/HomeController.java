package controllers;


import java.sql.SQLException;
import akka.http.javadsl.model.headers.Connection;
import play.mvc.*;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import javax.inject.Inject;

import play.mvc.Controller;

import views.html.*;



/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller{

	public Result index(String nombre, String apellido) {
		return ok(index.render(nombre, apellido));
	}
	
}
