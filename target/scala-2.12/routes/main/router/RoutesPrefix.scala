
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/551br/OneDrive/Documents/Play/primero/conf/routes
// @DATE:Tue Oct 17 17:06:17 COT 2017


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
