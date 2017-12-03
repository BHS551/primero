
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/551br/Documents/Repos/play/primero/conf/routes
// @DATE:Wed Nov 01 18:22:03 COT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseSongController SongController = new controllers.ReverseSongController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseSongController SongController = new controllers.javascript.ReverseSongController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
