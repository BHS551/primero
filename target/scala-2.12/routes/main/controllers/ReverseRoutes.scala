
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/551br/Documents/Repos/play/primero/conf/routes
// @DATE:Wed Nov 01 18:22:03 COT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:8
  class ReverseSongController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def edit(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "songs/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:13
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "songs/create")
    }
  
    // @LINE:16
    def show(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "songs/show/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:14
    def destroy(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "songs/destroy/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:15
    def prueba(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "songs/prueba")
    }
  
    // @LINE:12
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "songs/create")
    }
  
    // @LINE:11
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "songs/update")
    }
  
    // @LINE:8
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "songs")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
