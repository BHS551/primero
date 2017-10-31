package controllers;

import play.db.Database;

import javax.inject.Inject;
import java.sql.Connection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class conexionController {

    private Database database;
    private DatabaseExecutionContext executionContext;

    @Inject

    public conexionController(Database database, DatabaseExecutionContext executionContext){
        this.database = database;
        this.executionContext = executionContext;
    }

    public CompletionStage<Void> updateSomething() {
        return CompletableFuture.runAsync(() -> {
            Connection connection = database.getConnection();



            return;
        }, executionContext);
    }

}
