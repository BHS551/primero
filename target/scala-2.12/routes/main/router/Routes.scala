
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/551br/Documents/Repos/play/primero/conf/routes
// @DATE:Sat Oct 21 23:43:46 COT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:8
  SongController_2: controllers.SongController,
  // @LINE:19
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:8
    SongController_2: controllers.SongController,
    // @LINE:19
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, SongController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, SongController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index/""" + "$" + """nombre<[^/]+>/""" + "$" + """apellido<[^/]+>""", """controllers.HomeController.index(nombre:String, apellido:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """songs""", """controllers.SongController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """songs/edit/""" + "$" + """id<[^/]+>""", """controllers.SongController.edit(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """songs/update""", """controllers.SongController.update()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """songs/create""", """controllers.SongController.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """songs/create""", """controllers.SongController.create()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """songs/destroy/""" + "$" + """id<[^/]+>""", """controllers.SongController.destroy(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """songs/prueba""", """controllers.SongController.prueba()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """songs/show/""" + "$" + """id<[^/]+>""", """controllers.SongController.show(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index/"), DynamicPart("nombre", """[^/]+""",true), StaticPart("/"), DynamicPart("apellido", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """index/""" + "$" + """nombre<[^/]+>/""" + "$" + """apellido<[^/]+>""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_SongController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("songs")))
  )
  private[this] lazy val controllers_SongController_index1_invoker = createInvoker(
    SongController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SongController",
      "index",
      Nil,
      "GET",
      this.prefix + """songs""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_SongController_edit2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("songs/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SongController_edit2_invoker = createInvoker(
    SongController_2.edit(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SongController",
      "edit",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """songs/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_SongController_update3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("songs/update")))
  )
  private[this] lazy val controllers_SongController_update3_invoker = createInvoker(
    SongController_2.update(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SongController",
      "update",
      Nil,
      "POST",
      this.prefix + """songs/update""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_SongController_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("songs/create")))
  )
  private[this] lazy val controllers_SongController_save4_invoker = createInvoker(
    SongController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SongController",
      "save",
      Nil,
      "POST",
      this.prefix + """songs/create""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_SongController_create5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("songs/create")))
  )
  private[this] lazy val controllers_SongController_create5_invoker = createInvoker(
    SongController_2.create(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SongController",
      "create",
      Nil,
      "GET",
      this.prefix + """songs/create""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_SongController_destroy6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("songs/destroy/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SongController_destroy6_invoker = createInvoker(
    SongController_2.destroy(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SongController",
      "destroy",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """songs/destroy/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_SongController_prueba7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("songs/prueba")))
  )
  private[this] lazy val controllers_SongController_prueba7_invoker = createInvoker(
    SongController_2.prueba(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SongController",
      "prueba",
      Nil,
      "GET",
      this.prefix + """songs/prueba""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_SongController_show8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("songs/show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SongController_show8_invoker = createInvoker(
    SongController_2.show(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SongController",
      "show",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """songs/show/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call(params.fromPath[String]("nombre", None), params.fromPath[String]("apellido", None)) { (nombre, apellido) =>
        controllers_HomeController_index0_invoker.call(HomeController_0.index(nombre, apellido))
      }
  
    // @LINE:8
    case controllers_SongController_index1_route(params) =>
      call { 
        controllers_SongController_index1_invoker.call(SongController_2.index())
      }
  
    // @LINE:10
    case controllers_SongController_edit2_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_SongController_edit2_invoker.call(SongController_2.edit(id))
      }
  
    // @LINE:11
    case controllers_SongController_update3_route(params) =>
      call { 
        controllers_SongController_update3_invoker.call(SongController_2.update())
      }
  
    // @LINE:12
    case controllers_SongController_save4_route(params) =>
      call { 
        controllers_SongController_save4_invoker.call(SongController_2.save())
      }
  
    // @LINE:13
    case controllers_SongController_create5_route(params) =>
      call { 
        controllers_SongController_create5_invoker.call(SongController_2.create())
      }
  
    // @LINE:14
    case controllers_SongController_destroy6_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_SongController_destroy6_invoker.call(SongController_2.destroy(id))
      }
  
    // @LINE:15
    case controllers_SongController_prueba7_route(params) =>
      call { 
        controllers_SongController_prueba7_invoker.call(SongController_2.prueba())
      }
  
    // @LINE:16
    case controllers_SongController_show8_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_SongController_show8_invoker.call(SongController_2.show(id))
      }
  
    // @LINE:19
    case controllers_Assets_versioned9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
