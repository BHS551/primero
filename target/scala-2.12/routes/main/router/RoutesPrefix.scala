
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/551br/Documents/Repos/play/primero/conf/routes
// @DATE:Wed Nov 01 18:22:03 COT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
